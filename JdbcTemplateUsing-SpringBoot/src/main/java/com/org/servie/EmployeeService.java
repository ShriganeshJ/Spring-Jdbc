package com.org.servie;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
	
	public int ServiceCount();
	
	public  Map<String,Object> getMapDetails(int no);
	
	public List<Map<String,Object>> getAlDetails(int no);
	
	public String update(int id,int newSal);

}
