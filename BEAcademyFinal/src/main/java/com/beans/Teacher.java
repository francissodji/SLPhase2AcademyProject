package com.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Teacher")
public class Teacher{

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="idTeacher")
	private int idTeacher;
	
	@Column(name="firstNTeacher")
	private String firstNTeacher;
	
	@Column(name="middleNTeacher")
	private String middleNTeacher;
	
	@Column(name="lastNTeacher")
	private String lastNTeacher;
	
	
	public Teacher() {}


	public Teacher(String firstNTeacher, String middleNTeacher, String lastNTeacher) {
		super();
		this.firstNTeacher = firstNTeacher;
		this.middleNTeacher = middleNTeacher;
		this.lastNTeacher = lastNTeacher;
	}


	public int getIdTeacher() {
		return idTeacher;
	}


	public void setIdTeacher(int idTeacher) {
		this.idTeacher = idTeacher;
	}


	public String getFirstNTeacher() {
		return firstNTeacher;
	}


	public void setFirstNTeacher(String firstNTeacher) {
		this.firstNTeacher = firstNTeacher;
	}


	public String getMiddleNTeacher() {
		return middleNTeacher;
	}


	public void setMiddleNTeacher(String middleNTeacher) {
		this.middleNTeacher = middleNTeacher;
	}


	public String getLastNTeacher() {
		return lastNTeacher;
	}


	public void setLastNTeacher(String lastNTeacher) {
		this.lastNTeacher = lastNTeacher;
	}


	@Override
	public String toString() {
		return "Teacher [idTeacher=" + idTeacher + ", firstNTeacher=" + firstNTeacher + ", middleNTeacher="
				+ middleNTeacher + ", lastNTeacher=" + lastNTeacher + "]";
	}
	
	
}
