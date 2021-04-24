package com.dao;

import java.util.List;

import com.beans.Classes;

public interface ClassesDao {
	
	public Integer addClasses(Classes classes);
	
    public void updateClasses(Integer classesId, String designClasses );
    
    public void deleteClasses(Integer classesId);
    
    public List<Classes> getlistAllClasses();
    
    public List<Classes>getListAllClassesAndAllSubject();

}
