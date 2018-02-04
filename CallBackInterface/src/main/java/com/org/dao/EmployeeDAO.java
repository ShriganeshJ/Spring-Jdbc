package com.org.dao;

import java.util.List;

import com.org.bo.EmployeeBo;

public interface EmployeeDAO {

	public EmployeeBo getRecord(int id);
	public List<EmployeeBo> getRecords();
}
