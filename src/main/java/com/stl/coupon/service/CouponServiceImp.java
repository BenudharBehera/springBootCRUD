package com.stl.coupon.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.stl.coupon.dto.AbstractResponse;
import com.stl.coupon.dto.AbstractResponseAuth;
import com.stl.coupon.dto.ActorModel;
import com.stl.coupon.dto.ActresModel;
import com.stl.coupon.dto.AuthorizationLink;
import com.stl.coupon.dto.CouponModel;
import com.stl.coupon.dto.CouponNewModel;
import com.stl.coupon.dto.CouponNewResponseModel;
import com.stl.coupon.dto.CouponResponse;
import com.stl.coupon.dto.CouponResponsePojo;
import com.stl.coupon.dto.EmpAccount;
import com.stl.coupon.dto.EmployeeModel;
import com.stl.coupon.dto.MovieModel;
import com.stl.coupon.dto.SMSContectModel;
import com.stl.coupon.dto.SMSLogModel;
import com.stl.coupon.dto.SMSLogResponse;
import com.stl.coupon.dto.SmsContentResponse;
import com.stl.coupon.dto.StatusResponse;
import com.stl.coupon.dto.StatusResponseAuth;
import com.stl.coupon.dto.UserAuthorizationModel;
import com.stl.coupon.dto.UserModal;
import com.stl.coupon.dto.WebHook;
import com.stl.coupon.entities.AccountsEntity;
import com.stl.coupon.entities.ActorEntity;
import com.stl.coupon.entities.ActresEntity;
import com.stl.coupon.entities.AuthorizationEntity;
import com.stl.coupon.entities.BrowserEntity;
import com.stl.coupon.entities.CouponEntity;
import com.stl.coupon.entities.CouponNewEntity;
import com.stl.coupon.entities.EmployeAccountEntity;
import com.stl.coupon.entities.SMSContectEntity;
import com.stl.coupon.entities.SMSLogEntity;
import com.stl.coupon.entities.UserAuthorizationEntity;
import com.stl.coupon.entities.UserEntity;
import com.stl.coupon.repository.ActorRepository;
import com.stl.coupon.repository.ActresRepository;
import com.stl.coupon.repository.CouponNewRepository;
import com.stl.coupon.repository.CouponRepository;
import com.stl.coupon.repository.EmpAccountRepository;
import com.stl.coupon.repository.SMSContectRepository;
import com.stl.coupon.repository.SMSLogRepository;
import com.stl.coupon.repository.UserAuthorizationRepository;
import com.stl.coupon.repository.UserRepository;

@Service("CouponService")
public class CouponServiceImp implements CouponService {

	@Autowired
	CouponRepository couponRepository;
	
	@Autowired
	UserRepository userRepository;
			
	@Value("upload.excel.path")
	private String uploadFilePath;
		
	@Autowired
	CouponNewRepository couponNewRepository;
	
	@Autowired
	UserAuthorizationRepository userAuthorizationRepository;
	
	@Autowired
	SMSContectRepository smsContectRepository;
	
	@Autowired
	SMSLogRepository smsLogRepository;
	
	@Autowired
	EmpAccountRepository empAccountRepository;
	
	@Autowired
	ActorRepository actorRepository; 
	
	@Autowired
	ActresRepository actresRepository; 
	
	/**
	 * Insert
	 * 
	 * */
	@Override
	public ResponseEntity<? extends AbstractResponse> saveCouponDetails(CouponModel couponModel) {
		
		CouponEntity couponEntity = new CouponEntity();
		couponEntity.setCouponCode(couponModel.getCouponCode());
		couponEntity.setCouponName(couponModel.getCouponName());
		couponEntity.setStartDate(couponModel.getStartDate());
		couponEntity.setExpiryDate(couponModel.getExpiryDate());
		couponEntity.setStatus(couponModel.getStatus());
		try {
			couponRepository.save(couponEntity);
			return new ResponseEntity<>(new StatusResponse(1, "Successfully Coupon Created"), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(new StatusResponse(0, "failed to create"), HttpStatus.NOT_ACCEPTABLE);
		}		
	}

	/**
	 * Get All
	 * 
	 * */
	@Override
	public ResponseEntity<? extends AbstractResponse> getAllCouponDetails() {		
		List<CouponEntity> couponEntities = couponRepository.findAll();
		CouponResponse response =  new CouponResponse();
		List<CouponResponsePojo> couponResponsePojo = new ArrayList<>();
		for (CouponEntity entity : couponEntities) {
			CouponResponsePojo copRespojo = new CouponResponsePojo();
			copRespojo.setId(entity.getId());
			copRespojo.setCouponCode(entity.getCouponCode());
			copRespojo.setCouponName(entity.getCouponName());
			copRespojo.setStartDate(entity.getStartDate());
			copRespojo.setExpiryDate(entity.getExpiryDate());
			copRespojo.setStartDate(entity.getStartDate());
			
			couponResponsePojo.add(copRespojo);
		}
		response.setCouponResponse(couponResponsePojo);
		return new ResponseEntity<>(response, HttpStatus.OK);		
	}

	/**
	 * Update
	 * 
	 * */
	@Override
	public  ResponseEntity<? extends AbstractResponse> updateCoupon(CouponModel requestBody) {			
		CouponEntity couponUpdateEntity = couponRepository.getOne(requestBody.getId());
		if (couponUpdateEntity == null) {
			return new ResponseEntity<>(new StatusResponse(-1, "Failed to update coupon details"),
					HttpStatus.NOT_FOUND);
		}else {
			CouponEntity entity =  new CouponEntity();
			
			entity.setCouponCode(requestBody.getCouponCode());
			entity.setCouponName(requestBody.getCouponName());
			entity.setStartDate(requestBody.getStartDate());
			entity.setExpiryDate(requestBody.getExpiryDate());
			entity.setStatus(requestBody.getStatus());			
			try {
				couponRepository.save(entity);
				return new ResponseEntity<>(new StatusResponse(1, "Successfully coupon updated"),
						HttpStatus.OK);
			} catch (Exception e) {
				e.printStackTrace();
				return new ResponseEntity<>(new StatusResponse(0, "Failed to update coupon details"),
						HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}		
	}
	
	
	/**
	 * Delete
	 * 
	 * */
	@Override
	public ResponseEntity<? extends AbstractResponse> deleteCouponById(long id) {	
		CouponEntity couponEntity =  couponRepository.getOne(id);		
		if (couponEntity == null) {
			return new ResponseEntity<>(new StatusResponse(-1, "Failed to delete coupon details, id not found"),
					HttpStatus.NOT_FOUND);
		}else {
			try {
				couponEntity.setStatus(0);
				couponRepository.save(couponEntity);
				return new ResponseEntity<>(new StatusResponse(1, "Successfully Deleted"), HttpStatus.NOT_ACCEPTABLE);
			} catch (Exception e) {
				e.printStackTrace();
				return new ResponseEntity<>(new StatusResponse(0, "failed to Delete"), HttpStatus.NOT_ACCEPTABLE);
			}
		}				
	}
	
	/**
	 * 
	 * 
	 * */
	@Override
	public Optional<CouponEntity> getOneCoupon(long id) {		
		return couponRepository.findById(id);
	}
	
	@Override
	public  ResponseEntity<? extends AbstractResponse> getAllCoupon() {		
		List<CouponNewEntity> couponEntities = couponNewRepository.findAll();
		CouponNewResponseModel response =  new CouponNewResponseModel();
		List<CouponNewModel> couponResponse = new ArrayList<>();
		for (CouponNewEntity entity : couponEntities) {
			CouponNewModel model = new CouponNewModel();
			
			model.setCoupon_id(entity.getCoupon_id());
			model.setSubcoupon_id(entity.getSubcoupon_id());
			model.setCoupon_name(entity.getCoupon_name());
			
			couponResponse.add(model);
		}
		response.setCouponNew(couponResponse);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	
	@Override
	public ResponseEntity<? extends AbstractResponseAuth> authorizationDetails(UserAuthorizationModel authorizationModel) {
		try {
			
			UserAuthorizationEntity entity = new UserAuthorizationEntity();
			AuthorizationEntity authorization =  new AuthorizationEntity();
			BrowserEntity browserEntity = new BrowserEntity();			
						
			authorization.setAuthorizationLink(authorizationModel.getAuthorization().getLoc());
			authorization.setForcetimeout(authorizationModel.getAuthorization().getForcetimeout());
			authorization.setMaxtraffic(authorizationModel.getAuthorization().getMaxtraffic());
			authorization.setMsisdn(authorizationModel.getAuthorization().getMsisdn());
			authorization.setRedir(authorizationModel.getAuthorization().getRedir());
			authorization.setTok(authorizationModel.getAuthorization().getTok());
			
			browserEntity.setUserAgent(authorizationModel.getBrowserInfo().getUserAgent());
			browserEntity.setAppName(authorizationModel.getBrowserInfo().getAppName());
			browserEntity.setAppCodeName(authorizationModel.getBrowserInfo().getAppCodeName());
			browserEntity.setAppVersion(authorizationModel.getBrowserInfo().getAppVersion());
			browserEntity.setPlatform(authorizationModel.getBrowserInfo().getPlatform());
			browserEntity.setCookieEnabled(authorizationModel.getBrowserInfo().getCookieEnabled());
			browserEntity.setJavaEnabled(authorizationModel.getBrowserInfo().getJavaEnabled());
			browserEntity.setColorDepth(authorizationModel.getBrowserInfo().getColorDepth());
			browserEntity.setWidth(authorizationModel.getBrowserInfo().getWidth());
			browserEntity.setHeight(authorizationModel.getBrowserInfo().getHeight());
			browserEntity.setAvailWidth(authorizationModel.getBrowserInfo().getAvailWidth());
			browserEntity.setAvailHeight(authorizationModel.getBrowserInfo().getAvailHeight());
			browserEntity.setOuterWidth(authorizationModel.getBrowserInfo().getOuterWidth());
			browserEntity.setOuterHeight(authorizationModel.getBrowserInfo().getHeight());
			browserEntity.setPlatforms(authorizationModel.getBrowserInfo().getPlatforms());
			browserEntity.setCpuClass(authorizationModel.getBrowserInfo().getCpuClass());
			browserEntity.setReferrer(authorizationModel.getBrowserInfo().getReferrer());
			browserEntity.setLocaledate(authorizationModel.getBrowserInfo().getLocaledate());
			browserEntity.setNow(authorizationModel.getBrowserInfo().getNow());
			browserEntity.setLanguage(authorizationModel.getBrowserInfo().getLanguage());
			browserEntity.setSystemLanguage(authorizationModel.getBrowserInfo().getSystemLanguage());
			browserEntity.setUserLanguage(authorizationModel.getBrowserInfo().getUserLanguage());
			
			
			entity.setUserAuthorizationEntity(authorization);
			entity.setToken(authorizationModel.getTok());
			entity.setNodogSplash(authorizationModel.getInit());
			entity.setRouterMAC(authorizationModel.getAp());
			entity.setClientMAC(authorizationModel.getId());
			entity.setRedirectionURL(authorizationModel.getUrl());
			entity.setCareem(authorizationModel.getSsid());
			entity.setSessionId(authorizationModel.getSessionid());
			entity.setGpsLatitude(authorizationModel.getLat());
			entity.setGpsLongitude(authorizationModel.getLon());
			entity.setJsGetTime(authorizationModel.getT());
			entity.setBrowserEntity(browserEntity);
			
			userAuthorizationRepository.save(entity);
								
			return new ResponseEntity<>(new StatusResponseAuth(1, "Authorization link generated",""),HttpStatus.OK);
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(new StatusResponseAuth(0, "failed fetch authorization link"," "),HttpStatus.NOT_ACCEPTABLE);
		}		
	}
	
	
	@Override
	public ResponseEntity<? extends AbstractResponseAuth> getAuthorizationLink(AuthorizationLink authorization) {								
		return new ResponseEntity<>(authorization, HttpStatus.OK);
	}

	/**
	 * SMS Content Master
	 * 
	 * */	
	@Override
	public ResponseEntity<? extends AbstractResponse> saveSmsContectMst(SMSContectModel smsContectModel) {		
		SMSContectEntity entity =  new SMSContectEntity();
		
		entity.setSms(smsContectModel.getSms());
		entity.setStstus(smsContectModel.getStstus());
		try {
			smsContectRepository.save(entity);
			return new ResponseEntity<>(new StatusResponse(1, "Successfully saved sms contect"),HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(new StatusResponse(0, "Failed to save"),HttpStatus.NOT_ACCEPTABLE);
		}		
	}

	@Override
	public ResponseEntity<? extends AbstractResponse> getAllSMSContect() {		
		List<SMSContectEntity>  lisOfEntities = smsContectRepository.findAll();
		List<SMSContectModel>  listSMSContects =  new ArrayList<>();
		SmsContentResponse response =  new SmsContentResponse();		
		try {
			for (SMSContectEntity entity : lisOfEntities) {				
				SMSContectModel model =  new SMSContectModel(); 
				
				model.setId(entity.getId());
				model.setSms(entity.getSms());
				model.setStstus(entity.getStstus());
				
				listSMSContects.add(model);
			}
			response.setSmsContectModels(listSMSContects);
			return new ResponseEntity<>(response, HttpStatus.OK);				
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(response,HttpStatus.NOT_ACCEPTABLE);
		}		
	}

	@Override
	public ResponseEntity<? extends AbstractResponse> updateSmsContect(SMSContectModel smsContectModel) {		
		SMSContectEntity smsContectEntity = smsContectRepository.getOne(smsContectModel.getId());
		if (smsContectEntity == null) {
			return new ResponseEntity<>(new StatusResponse(-1, "Data not found"),HttpStatus.BAD_REQUEST);
		}else {
			SMSContectEntity entity =  new SMSContectEntity();
			
			entity.setId(smsContectModel.getId());
			entity.setSms(smsContectModel.getSms());
			entity.setStstus(smsContectEntity.getStstus());			
			try {
				smsContectRepository.save(entity);
				return new ResponseEntity<>(new StatusResponse(1, "Updated Sucessfully"),HttpStatus.OK);
			} catch (Exception e) {
				e.printStackTrace();
				return new ResponseEntity<>(new StatusResponse(0, "Failed to update"),HttpStatus.NOT_ACCEPTABLE);
			}
		}				
	}

	
	/**
	 * SMS Log Details
	 * 
	 * */
	@Override
	public ResponseEntity<? extends AbstractResponse> addSMSlog(SMSLogModel smsLogModel) {
		SMSLogEntity entity =  new SMSLogEntity();
		
		entity.setId(smsLogModel.getId());
		entity.setSmsContectId(smsLogModel.getSmsContectId());
		entity.setUserId(smsLogModel.getUserId());
		entity.setCount(smsLogModel.getCount());		
		try {
			smsLogRepository.save(entity);
			return new ResponseEntity<>(new StatusResponse(1, "SMS log generated"),HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(new StatusResponse(0, "Failed"),HttpStatus.OK);
		}		
	}

	@Override
	public ResponseEntity<? extends AbstractResponse> getAllSmsLog() {
		List<SMSLogEntity>  listOfSMSLogEntyties =  smsLogRepository.findAll();
		SMSLogResponse response = new SMSLogResponse();
		List<SMSLogModel> listOfSmslog =  new ArrayList<>();
		if (listOfSMSLogEntyties == null) {				
			return new ResponseEntity<>(new StatusResponse(-1, "Record not found"),HttpStatus.BAD_REQUEST);
		}else {		
			try {
				for (SMSLogEntity entity : listOfSMSLogEntyties) {
					SMSLogModel model =  new SMSLogModel();
					
					model.setId(entity.getId());
					model.setSmsContectId(entity.getSmsContectId());
					model.setUserId(entity.getUserId());
					model.setCount(entity.getCount());
					
					listOfSmslog.add(model);
				}
				response.setSmsLogModels(listOfSmslog);
				return new ResponseEntity<>(response,HttpStatus.OK);
			} catch (Exception e) {
				e.printStackTrace();
				return new ResponseEntity<>(response,HttpStatus.NOT_ACCEPTABLE);
			}
		}		
	}

	
	
	
	
	/**
	 * Upload File
	 * 
	 * */
	@Override
	public ResponseEntity<? extends AbstractResponse> uploadExcelFile(UserModal userModal) {
		if (userModal.getExcelFile() == null) {
			return new ResponseEntity<>(new StatusResponse(-1,"File not found"),HttpStatus.NOT_FOUND);
		}
		try {
			//MultipartFile file =  userModal.getExcelFile();
			//String fileName =  file.getOriginalFilename();
			//String directory = uploadFilePath;
			UserEntity  userEntity = generateUniqueFileId();
			String updatedFileName =  saveFileInPhysicalPath(Arrays.asList(userModal.getExcelFile()) ,userEntity.getId());
			userEntity.setName(userModal.getName());
			userEntity.setId(userEntity.getId());
			userEntity.setDob(userModal.getDob());
			userEntity.setFileName(updatedFileName);
			userEntity.setUserName(userModal.getUserName());
			userRepository.save(userEntity);
			return new ResponseEntity<>(new StatusResponse(1,"Successfully Uploaded"),HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(new StatusResponse(0,"failed to Upload"),HttpStatus.NOT_ACCEPTABLE);
		}
		
	}

	private String saveFileInPhysicalPath(List<MultipartFile> files, long fileId) throws IOException {
		// TODO Auto-generated method stub
		boolean status = false;
		String updatedFileName = null;
		for (MultipartFile file : files) {
			if (file.isEmpty()) {
				continue; //next pls
			}
			byte[] bytes = file.getBytes();
			String name = file.getOriginalFilename();
			System.out.println(name);
			String subStr[] = name.split("\\.");
			System.out.println(subStr[0]);
			System.out.println(subStr[1]);
			Path path = Paths.get(uploadFilePath +'\\'+subStr[0]+fileId+"."+subStr[1]);
			updatedFileName = subStr[0]+fileId+"."+subStr[1];
			Files.write(path, bytes);
			status = true;
		}
		return updatedFileName;
	}

	private UserEntity generateUniqueFileId() {
		Integer id = null;
		UserEntity fm = new UserEntity();
		id = userRepository.findMaxId();
		fm.setId(id == null ? 1 : id + 1);
		return fm;
	}

	@Override
	public ResponseEntity<? extends AbstractResponse> fetchWebHook(WebHook webhooke) {
		try {
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public ResponseEntity<? extends AbstractResponse> saveEmployeeAccount(EmployeeModel empAcccountModel) {
		try {
			EmployeAccountEntity entity =  new EmployeAccountEntity();
			AccountsEntity  accountsEntity =  new AccountsEntity();
			BeanUtils.copyProperties(empAcccountModel, entity, "empAccounts");
			List<AccountsEntity> listOfData = new ArrayList<>();
			empAcccountModel.getEmpAccounts().forEach(new Consumer<EmpAccount>() {				
				@Override
				public void accept(EmpAccount account) {					
					AccountsEntity ent = new AccountsEntity();
					ent.setAccountId(account.getAccountId());
					ent.setAccountType(account.getAccountType());
					ent.setBankName(account.getBankName());
										
					listOfData.add(ent);					
				}
			});		
			entity.setEmpAccounts(listOfData);					
			empAccountRepository.save(entity);							
			return new ResponseEntity<>(new StatusResponse(1, "DONE"),HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(new StatusResponse(0, "Failed"),HttpStatus.NOT_ACCEPTABLE);
		}		
		
	}

	@Override
	public ResponseEntity<? extends AbstractResponse> saveActor(ActorModel actorModel) {
		try {
			ActorEntity entity =  new ActorEntity();
			BeanUtils.copyProperties(actorModel, entity);
			actorRepository.save(entity);
			return new ResponseEntity<>(new StatusResponse(1, "DONE"),HttpStatus.OK);	
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(new StatusResponse(0, "Failed"),HttpStatus.NOT_ACCEPTABLE);
		}
	}

	@Override
	public ResponseEntity<? extends AbstractResponse> saveActres(ActresModel actresModel) {
		try {
			ActresEntity entity =  new ActresEntity();
			BeanUtils.copyProperties(actresModel, entity);
			actresRepository.save(entity);
			return new ResponseEntity<>(new StatusResponse(1, "DONE"),HttpStatus.OK);	
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(new StatusResponse(0, "Failed"),HttpStatus.NOT_ACCEPTABLE);
		}
	}

	@Override
	public ResponseEntity<? extends AbstractResponse> saveMovie(MovieModel movieModel) {
		try {
			return new ResponseEntity<>(new StatusResponse(0, "DONE"),HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(new StatusResponse(0, "Failed"),HttpStatus.NOT_ACCEPTABLE);
		}		
	}

	
}
