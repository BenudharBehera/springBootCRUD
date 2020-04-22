package com.stl.coupon.service;

import java.util.Optional;

import org.springframework.http.ResponseEntity;

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
import com.stl.coupon.dto.UserAuthorizationModel;
import com.stl.coupon.dto.UserModal;
import com.stl.coupon.dto.WebHook;
import com.stl.coupon.entities.CouponEntity;

public interface CouponService {
	
	public ResponseEntity<? extends AbstractResponse> saveCouponDetails(CouponModel couponRequest);

	public ResponseEntity<? extends AbstractResponse> getAllCouponDetails();

	public  Optional<CouponEntity> getOneCoupon(long id);

	public ResponseEntity<? extends AbstractResponse> deleteCouponById(long id);

	public ResponseEntity<? extends AbstractResponse> updateCoupon(CouponModel requestUpdate);

	public ResponseEntity<? extends AbstractResponse> uploadExcelFile(UserModal userModal);

	public ResponseEntity<? extends AbstractResponse> getAllCoupon();

	public ResponseEntity<? extends AbstractResponseAuth> authorizationDetails(UserAuthorizationModel authorizationModel);

	public ResponseEntity<? extends AbstractResponseAuth> getAuthorizationLink(AuthorizationLink authorization);

	public ResponseEntity<? extends AbstractResponse> saveSmsContectMst(SMSContectModel smsContectModel);

	public ResponseEntity<? extends AbstractResponse> getAllSMSContect();

	public ResponseEntity<? extends AbstractResponse> updateSmsContect(SMSContectModel smsContectModel);

	public ResponseEntity<? extends AbstractResponse> addSMSlog(SMSLogModel smsLogModel);

	public ResponseEntity<? extends AbstractResponse> getAllSmsLog();

	public ResponseEntity<? extends AbstractResponse> fetchWebHook(WebHook wenhook);

	public ResponseEntity<? extends AbstractResponse> saveEmployeeAccount(EmployeeModel empAcccountNodel);

	public ResponseEntity<? extends AbstractResponse> saveActor(ActorModel actorModel);

	public ResponseEntity<? extends AbstractResponse> saveActres(ActresModel actresModel);

	public ResponseEntity<? extends AbstractResponse> saveMovie(MovieModel movieModel);

	

}
