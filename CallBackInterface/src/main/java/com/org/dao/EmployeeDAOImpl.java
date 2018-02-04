package com.org.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.org.bo.EmployeeBo;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String QUERY1="SELECT EID,ENAME,SAL,JOB FROM EMPLOYEE";

	private static final String QUERY="SELECT EID,ENAME,SAL,JOB FROM EMPLOYEE WHERE EID=?";
	//Config Templet
	JdbcTemplate jt;
	EmployeeBo bo;
	List<EmployeeBo> ls= new ArrayList<EmployeeBo>();

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	

	public EmployeeBo getRecord(int id) {
		
		bo=jt.queryForObject(QUERY,new CustomClassRowMapper(),id);
		
		return bo;
	}

	
	//CALLBACK INTERFACE
	//for single recored we call row mapper
	//take support of inner class
	public class CustomClassRowMapper implements RowMapper<EmployeeBo>
	{

		public EmployeeBo mapRow(ResultSet rs, int no) throws SQLException {
			// TODO Auto-generated method stub
			
			//take record from result set and set to bo
			//only this row mapper internally use while loop	
			bo= new EmployeeBo();
			bo.setEid(rs.getInt(1));
			bo.setEname(rs.getString(2));
			bo.setJob(rs.getString(4));
			bo.setSal(rs.getInt(3));
			
			
			return bo;
		}
		
		}//class
	
	//To get Bunch (List) of record
	
	public List<EmployeeBo> getRecords() {
		// TODO Auto-generated method stub
		jt.query(QUERY1, new ResultSetExtractorCustom());
		return ls;
	}
	
	
	private class ResultSetExtractorCustom implements ResultSetExtractor<List<EmployeeBo>>
	{
		
/// Result set extracto   we need to write while loop while adding obj because multiple record
		//not single rec
		EmployeeBo bo=null;
		
		public List<EmployeeBo> extractData(ResultSet rs) throws SQLException, DataAccessException {
			
			while(rs.next())
			{
				bo=new EmployeeBo();
				bo.setEid(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setSal(rs.getInt(3));
				bo.setJob(rs.getString(4));
				ls.add(bo);
				
			}
			return ls;
		}
		
	}
}
