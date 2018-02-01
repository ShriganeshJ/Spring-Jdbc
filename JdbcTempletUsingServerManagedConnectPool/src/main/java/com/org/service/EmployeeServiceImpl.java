package com.org.service;

import java.util.List;
import java.util.Map;

import com.org.dao.EmployeeDAO;
import com.org.dao.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDAOImpl dao;
	@Override
	public List<Map<String, Object>> serviceList(String job[]) {
		
		String cond=null;
		
		StringBuffer sb = new StringBuffer("(");
		for(int i=0;i<job.length;++i)
		{
			if(i==job.length-1)
			{
				sb.append("'"+job[i]+"')");
			}
			else
			{
				sb.append("'"+job[i]+"'"+",");
			}
			
			 cond=sb.toString();
			
		}
		
		
		return dao.list(cond);
	}
	
	/*public static void main(String[] args) {
		
		String job[]= {"job","test","raja"};
		
		StringBuffer sb = new StringBuffer("(");
		for(int i=0;i<job.length;++i)
		{
			if(i==job.length-1)
			{
				sb.append("'"+job[i]+"')");
			}
			else
			{
				sb.append("'"+job[i]+"'"+",");
			}
			
			String condition=sb.toString();
			System.out.println(condition);
		}
	}
*/
	public void setDao(EmployeeDAOImpl dao) {
		this.dao = dao;
	}

}
