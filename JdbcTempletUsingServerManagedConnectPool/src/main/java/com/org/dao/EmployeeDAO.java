package com.org.dao;

import java.util.List;
import java.util.Map;

public interface EmployeeDAO {
	
	public List<Map<String,Object>> list(String condition);

}
