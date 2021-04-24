package com.dao;

import java.util.List;

import com.beans.Subject;

public interface SubjectDao {
	
	public Integer AddSubject(Subject subject);
	
	public List<Subject> getListAllSubject();
	

}
