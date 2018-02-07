package com.org.dao;

import java.util.List;

import com.org.bo.FliptkartBO;

public interface FliptkartDAO {
	
	public int insertRecord(FliptkartBO fbo);
	public List<FliptkartBO>getAll();
	

}
