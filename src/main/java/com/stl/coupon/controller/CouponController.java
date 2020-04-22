package com.stl.coupon.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stl.coupon.config.SMSSender;
import com.stl.coupon.dto.AbstractResponse;
import com.stl.coupon.dto.AbstractResponseAuth;
import com.stl.coupon.dto.ActorModel;
import com.stl.coupon.dto.ActresModel;
import com.stl.coupon.dto.AuthorizationLink;
import com.stl.coupon.dto.CouponModel;
import com.stl.coupon.dto.EmployeeModel;
import com.stl.coupon.dto.MovieModel;
import com.stl.coupon.dto.SMSContectModel;
import com.stl.coupon.dto.SMSLogModel;
import com.stl.coupon.dto.StatusResponseAuth;
import com.stl.coupon.dto.UserAuthorizationModel;
import com.stl.coupon.dto.UserModal;
import com.stl.coupon.dto.WebHook;
import com.stl.coupon.dto.WhatsAppModal;
import com.stl.coupon.entities.CouponEntity;
import com.stl.coupon.service.CouponService;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/user")
public class CouponController {

	@Autowired
	CouponService couponService;
	
	@Autowired
	SMSSender smcService;
	
	
	@GetMapping("/test")
	public String testCoupon() {
		System.out.println("Working fine");
		return "TEST";
	}
	
	@RequestMapping("/saveCouponDetails")
	public ResponseEntity<? extends AbstractResponse> saveCouponDetails(@RequestBody CouponModel couponRequest) {		 
		System.out.println("Inside"+couponRequest.toString());
		return couponService.saveCouponDetails(couponRequest);
	}
	
	@GetMapping("/getAllCoupon")
	public ResponseEntity<? extends AbstractResponse> getAllCouponDetails() {
		return couponService.getAllCouponDetails();
	}
	
	@PutMapping("/updateCoupon")
	public ResponseEntity<? extends AbstractResponse> updateCoupon(@RequestBody CouponModel requestBody){
		System.out.println(requestBody.toString());
		return couponService.updateCoupon(requestBody);		
	}
	
	@GetMapping("/deleteById/{id}")
	public ResponseEntity<? extends AbstractResponse> deleteCouponById(@PathVariable("id") long id){
		System.out.println(id);
		return couponService.deleteCouponById(id);
	}
	
	@GetMapping("/getCouponById/{id}")
	public  Optional<CouponEntity> getOneCoupon(@PathVariable("id") long id) {
		System.out.println(id);
		return couponService.getOneCoupon(id);		
	}
	
	@PutMapping("/uploadFile")
	public ResponseEntity<? extends AbstractResponse> uploadExcelFile(@ModelAttribute UserModal userModal){
		return couponService.uploadExcelFile(userModal);
	}
	
	@GetMapping("/getCouponDetails")
	public ResponseEntity<? extends AbstractResponse> getAllCoupon() {
		return couponService.getAllCoupon();
	}
			
	@PostMapping("/saveAuthorization")
	public ResponseEntity<? extends AbstractResponseAuth> authorizationLink(@RequestBody UserAuthorizationModel requestBody){						
		try {								
			return couponService.authorizationDetails(requestBody);			
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(new StatusResponseAuth(-1, "failed to get authorization details"," "), HttpStatus.NOT_ACCEPTABLE);
		}		
	}
		
	
	@GetMapping("/getAuthorizationLink")
	public ResponseEntity<? extends AbstractResponseAuth> getAuthorizationLink(@RequestParam("msisdn") String msisdn, 
			@RequestParam("redir") String redir,@RequestParam("forcetimeout") String forcetimeout,
			@RequestParam("maxtraffic") String maxtraffic,@RequestParam("tok") String token) {
			
		AuthorizationLink authorization =  new AuthorizationLink();
		
		authorization.setMsisdn(msisdn);
		authorization.setRedir(redir);
		authorization.setForcetimeout(forcetimeout);
		authorization.setMaxtraffic(maxtraffic);
		authorization.setTok(token);
		System.out.println(authorization.toString());
		return couponService.getAuthorizationLink(authorization);
	}
	
	/**
	 * SMS Content Master
	 * 
	 * */
	
	@PostMapping("/saveSmsContectMst")
	public ResponseEntity<? extends AbstractResponse> saveSmsContectMst(@RequestBody SMSContectModel smsContectModel){
		return couponService.saveSmsContectMst(smsContectModel);
	}
	
	@GetMapping("/getAllSMSContect")
	public ResponseEntity<? extends AbstractResponse> getAllSMSContect(){
		return couponService.getAllSMSContect();
	}
	
	@PutMapping("/updateSmsContect")
	public ResponseEntity<? extends AbstractResponse> updateSmsContect(@RequestBody SMSContectModel smsContectModel){
		return couponService.updateSmsContect(smsContectModel);
	}
	
	
	/**
	 * 
	 * SMS Log
	 * 
	 * */	
	@PostMapping("/addSMSlog")
	public ResponseEntity<? extends AbstractResponse> addSMSlog(@RequestBody SMSLogModel smsLogModel){		
		return couponService.addSMSlog(smsLogModel);
	}
	
	@GetMapping("/getAllSmsLog")
	public ResponseEntity<? extends AbstractResponse> getAllSmsLog(){
		return couponService.getAllSmsLog();
	}
	
	@PostMapping("/whatsAppSMS")
	public String getSMS(@RequestBody WhatsAppModal whatsAppModal) {
		System.out.println("test");
		smcService.sendSms(whatsAppModal);
		return "HEY";
	}
	
	@PostMapping("/fetchWebHook")
	public ResponseEntity<? extends AbstractResponse> fetchWebHook(@RequestHeader("Authorization")
	String headrer,@RequestBody WebHook email){
		return couponService.fetchWebHook(email);
	}
	
	
	@PostMapping("/saveEmployeeAccount")
	public ResponseEntity<? extends AbstractResponse> saveEmployeeAccount(@RequestBody EmployeeModel empAcccountNodel){
		return couponService.saveEmployeeAccount(empAcccountNodel);
	}
	
	@PostMapping("/saveActor")
	public ResponseEntity<? extends AbstractResponse> saveActor(@RequestBody ActorModel actorModel){
		return couponService.saveActor(actorModel);
	}
	
	@PostMapping("/saveActres")
	public ResponseEntity<? extends AbstractResponse> saveActres(@RequestBody ActresModel actresModel){
		return couponService.saveActres(actresModel);
	}
	
	@PostMapping("/saveMoive")
	public ResponseEntity<? extends AbstractResponse> saveMovie(@RequestBody MovieModel movieModel){
		return couponService.saveMovie(movieModel);
	}
	
}
