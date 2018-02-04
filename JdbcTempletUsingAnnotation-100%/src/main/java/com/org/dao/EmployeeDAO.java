package com.org.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface EmployeeDAO {
	
	public int employeeCount();
	
	public Map<String,Object> MapDetails(int no);
	
	public List<Map<String,Object>> ListCollection(int no);
	
	public String update(int id,int newSal);

}
