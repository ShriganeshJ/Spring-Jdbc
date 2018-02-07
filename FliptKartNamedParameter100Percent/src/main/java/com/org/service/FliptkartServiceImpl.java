package com.org.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.bo.FliptkartBO;
import com.org.dao.FliptkartDAO;
import com.org.dto.FliptkartDTO;
@Service
public class FliptkartServiceImpl implements FliptkartService {
	
	FliptkartBO fbo = new FliptkartBO();
	//to communicate with model
	@Autowired
	FliptkartDAO dao;

	@Override
	public int insertRecord(FliptkartDTO fdto) {
		int count=0;
		//copy data dto to bo 
		
		BeanUtils.copyProperties(fdto, fbo);
		
		count=dao.insertRecord(fbo);
		
		
		
	return count;
	}

}
