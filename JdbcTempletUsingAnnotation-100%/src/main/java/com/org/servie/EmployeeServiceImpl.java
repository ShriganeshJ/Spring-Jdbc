package com.org.servie;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.dao.EmployeeDAO;
@Service("empService")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDAO d=null;
      
	public EmployeeDAO getD() {
		return d;
	}
	public void setD(EmployeeDAO d) {
		this.d = d;
	}
	@Override
	public int ServiceCount() {

		return d.employeeCount();
	}
	
	@Override
	public Map<String, Object> getMapDetails(int no) {
		
		return d.MapDetails(no);
	}

	
	@Override
	public List<Map<String, Object>> getAlDetails(int no) {
		// TODO Auto-generated method stub
		return d.ListCollection(no);
	}
	
	@Override
	public String update(int id, int newSal) {
		// TODO Auto-generated method stub
		
		String s= d.update(id, newSal);
		return s;
	}
}
