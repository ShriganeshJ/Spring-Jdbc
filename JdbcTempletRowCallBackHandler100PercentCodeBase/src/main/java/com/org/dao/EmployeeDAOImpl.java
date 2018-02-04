package com.org.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.org.bo.EmployeeBo;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	private static final String QUERY="SELECT EID,ENAME,SAL,JOB FROM EMPLOYEE";
	List<EmployeeBo>al= new ArrayList<>(); 
	// Jdbc Templet
	@Autowired
	JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public List<EmployeeBo> getAllRecord() {
		// TODO Auto-generated method stub
		
		jt.query(QUERY,new RowCallbackHandler() {
			
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				System.out.println("Row Callback Handler");
				EmployeeBo bo = new EmployeeBo();
				bo.setEid(rs.getInt(1));
				bo.setName(rs.getString(2));
				bo.setSal(rs.getInt(3));
				bo.setJob(rs.getString(4));
				//add each record to Collection 
				al.add(bo);
				
			}
		});
		return al;
	}

}
