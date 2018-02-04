package com.org.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOImpl implements EmployeeDAO {
	JdbcTemplate jt;
	Map<String,Object> map = new HashMap<>();
	List<Map<String,Object>> al = new ArrayList<>();
	private static String QUERY=("SELECT COUNT (*) FROM EMP");
	private static String QUERY2=("SELECT * FROM EMP WHERE EID=?");
	private static String UPDATE_QUERY=("UPDATE EMP SET SAL=?  WHERE EID=?");
	


	@Override
	public int employeeCount() {
		int count;
	
	count=	jt.queryForObject(QUERY,Integer.class);
		return count;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public Map<String, Object> MapDetails(int no) {
		
		map=jt.queryForMap("SELECT * FROM EMP WHERE EID=?",no);
		
		return map;
	}
	
	@Override
	public List<Map<String,Object>> ListCollection(int no) {
		// TODO Auto-generated method stub
	
		al=jt.queryForList("SELECT * FROM EMP WHERE EID=?",no);
		
		return al;
	}
	
	@Override
	public String update(int id, int newSal) {
		// TODO Auto-generated method stub
		int count=0;
	count=	jt.update(UPDATE_QUERY,newSal,id);
		if(count==1)
		{
		return id+"EmployeeSalisUpdated$New sal is::"+newSal ;
		}
	
		return "RecordNotUpdate";
}
}