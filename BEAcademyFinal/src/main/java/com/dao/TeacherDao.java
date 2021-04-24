package com.dao;

import java.util.List;

import com.beans.Teacher;

public interface TeacherDao {

	public Integer addTeacher(Teacher teacher);
	
	public List<Teacher> getlistOfAllTeacher();
}
