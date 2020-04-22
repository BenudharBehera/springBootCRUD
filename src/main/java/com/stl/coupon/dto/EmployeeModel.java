package com.stl.coupon.dto;

import java.util.Set;
import lombok.Data;

@Data
public class EmployeeModel {

	private String empName;
	private String empDesg;
	private Set<EmpAccount> empAccounts;
}
