package com.stl.coupon;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.stl.coupon.controller.CouponController;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class CouponApplicationTests {
	private MockMvc mockMvc;
	
	@InjectMocks
	private CouponController couponController;
	
	@BeforeEach
	public void setUp() throws Exception {
		mockMvc = MockMvcBuilders.standaloneSetup(couponController).build();
	}
	
	@Test
	public void test() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/user/test"))
		.andExpect(status().isOk());
	}

}
