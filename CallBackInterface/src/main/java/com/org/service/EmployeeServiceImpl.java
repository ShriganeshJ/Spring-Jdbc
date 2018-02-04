package com.org.service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.org.bo.EmployeeBo;
import com.org.dao.EmployeeDAO;
import com.org.dao.EmployeeDAOImpl;
import com.org.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDTO dto;
	
	
	public void setDao(EmployeeDAOImpl dao) {
		this.dao = dao;
	}
	EmployeeDAOImpl dao;
	EmployeeBo bo;
	public EmployeeDTO getDetails(int no) {
		
	bo=dao.getRecord(no);
	dto=new EmployeeDTO();
	//cop bo to DTO
	try {
		BeanUtils.copyProperties(dto,bo);
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvocationTargetException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		return dto;
	
		
	}
	
	//List
	
	public List<EmployeeDTO> getListDetails() {
		List<EmployeeBo> listBo=null;
		List<EmployeeDTO> dto1=new ArrayList<EmployeeDTO>();
		listBo=dao.getRecords();
		//copy fro List bo to List dto
		
		for(EmployeeBo bo:listBo)
		{
			EmployeeDTO dto= new EmployeeDTO();
			dto.setEid(bo.getEid());
			dto.setEname(bo.getEname());
			dto.setJob(bo.getJob());
			dto.setSal(bo.getSal());
			dto1.add(dto);
		}
		
		
		return dto1;
	}

}
