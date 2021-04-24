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
@Table(name="Classes") 
public class Classes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="idClasses")
	private int idClasses;
	
	@Column(name="designClasses")
	private String designClasses;
	
	
	@ManyToMany(targetEntity= Subject.class, cascade= { CascadeType.ALL})
	@JoinTable(name="Composed",joinColumns = { @JoinColumn(name = "idClasses") }, 
			inverseJoinColumns = { @JoinColumn(name = "idSubject") })
	private Set<Subject> subjects;
	


	
	public Classes() {
		
	}


	public Classes(String designClasses) {

		this.designClasses = designClasses;
	}


	public int getIdClasses() {
		return idClasses;
	}



	public void setIdClasses(int idClasses) {
		this.idClasses = idClasses;
	}



	public String getDesignClasses() {
		return designClasses;
	}



	public void setDesignClasses(String designClasses) {
		this.designClasses = designClasses;
	}


	
	
	public Set<Subject> getSubjects() {
		return subjects;
	}


	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}


	@Override
	public String toString() {
		return "Classes [idClasses=" + idClasses + ", designClasses=" + designClasses + ", subjects=" + subjects + "]";
	}

	
}
