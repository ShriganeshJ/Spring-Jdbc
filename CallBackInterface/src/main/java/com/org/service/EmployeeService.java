package com.org.service;

import java.util.List;

import com.org.bo.EmployeeBo;
import com.org.dto.EmployeeDTO;

public interface EmployeeService {
	
	public EmployeeDTO getDetails(int no);
	
	public  List<EmployeeDTO> getListDetails();

}
