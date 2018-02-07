package com.org.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.org.bo.FliptkartBO;
@Repository
public class FliptkarDAOImpl implements FliptkartDAO {
	private static final String QUERY=" insert into fliptkart (cname,cemail,cadd,clandmark,coption,cmobile) values(:cname,:cemail,:cadd,:clandmark,:coption,:cmobile)";
   //ues JDBC Named parameter templete
	@Autowired
	NamedParameterJdbcTemplate npjt;
	
	@Override
	public int insertRecord(FliptkartBO fbo) {
		int count=0;
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(fbo);
		 count=npjt.update(QUERY,param);
		return count;
	}

	@Override
	public List<FliptkartBO> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
