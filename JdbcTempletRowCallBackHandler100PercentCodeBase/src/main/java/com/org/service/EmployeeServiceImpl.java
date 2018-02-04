package com.org.service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.parser.DTD;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.bo.EmployeeBo;
import com.org.dao.EmployeeDAOImpl;
import com.org.dto.EmployeeDTO;
@Service
public class EmployeeServiceImpl implements EmployeeService {
      @Autowired
	EmployeeDAOImpl dao;
	public void setDao(EmployeeDAOImpl dao) {
		this.dao = dao;
	}
	@Override
	public List<EmployeeDTO> getAllRecord() {
		List<EmployeeDTO> edto=new ArrayList<>();
		List<EmployeeBo> ebo;
		//take data from dao
		ebo=dao.getAllRecord();
		//copy data from boCollection to dto Collection
		ebo.forEach(bo->{
			EmployeeDTO dto = new EmployeeDTO();
			
			try {
				BeanUtils.copyProperties(dto, bo);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			edto.add(dto);
			
		});
		
		//using Enhanced For loop
		/*for(EmployeeBo bo : ebo)
		{
			EmployeeDTO dto = new EmployeeDTO();
			dto.setEid(bo.getEid());
			dto.setName(bo.getName());
			dto.setSal(bo.getSal());
			dto.setJob(bo.getJob());
			
			edto.add(dto);
			
		}
		*/return edto;
	}

}
