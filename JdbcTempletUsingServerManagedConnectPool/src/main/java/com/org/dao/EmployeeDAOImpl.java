package com.org.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOImpl implements EmployeeDAO {

	// Configure The JDBC Templet
	JdbcTemplate jt;
	// create one list
	List<Map<String, Object>> list = null;

	@Override
	public List<Map<String, Object>> list(String condition) {

		list = jt.queryForList("SELECT EID,ENAME,JOB,SAL FROM EMPLOYEE WHERE JOB IN" + condition);
		return list;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

}
