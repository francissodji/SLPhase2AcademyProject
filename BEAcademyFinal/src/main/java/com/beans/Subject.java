package com.beans;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Subject") 
public class Subject {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="idSubject")
	private int idSubject;
	
	@Column(name="designSubject")
	private String designSubject;
	
	@ManyToMany(targetEntity= Teacher.class, cascade= { CascadeType.ALL})
	@JoinTable(name="Assigned",joinColumns = { @JoinColumn(name = "idSubject") }, 
			inverseJoinColumns = { @JoinColumn(name = "idTeacher") })
	private Set<Teacher> teachers;
	
	public Subject() {}


	public Subject(String designSubject) {

		this.designSubject = designSubject;
	}


	public int getIdSubject() {
		return idSubject;
	}


	public void setIdSubject(int idSubject) {
		this.idSubject = idSubject;
	}


	public String getDesignSubject() {
		return designSubject;
	}


	public void setDesignSubject(String designSubject) {
		this.designSubject = designSubject;
	}


	public Set<Teacher> getTeachers() {
		return teachers;
	}


	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}


	@Override
	public String toString() {
		return "Subject [idSubject=" + idSubject + ", designSubject=" + designSubject + ", teachers=" + teachers + "]";
	}

	

}
