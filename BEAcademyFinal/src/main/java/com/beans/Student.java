package com.beans;

import javax.persistence.ForeignKey;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student{

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="idStudent")
	private int idStudent;
	
	@Column(name="firstNStudent")
	private String firstNStudent;
	
	@Column(name="middleNStudent")
	private String middleNStudent;
	
	@Column(name="lastNStudent")
	private String lastNStudent;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idClasse", foreignKey=@ForeignKey(name="idClasse"))
	private Classes classe;
	
	
	public Student() {}

	public Student(String firstNStudent, String middleNStudent, String lastNStudent) {
		super();
		this.firstNStudent = firstNStudent;
		this.middleNStudent = middleNStudent;
		this.lastNStudent = lastNStudent;
	}

	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public String getFirstNStudent() {
		return firstNStudent;
	}

	public void setFirstNStudent(String firstNStudent) {
		this.firstNStudent = firstNStudent;
	}

	public String getMiddleNStudent() {
		return middleNStudent;
	}

	public void setMiddleNStudent(String middleNStudent) {
		this.middleNStudent = middleNStudent;
	}

	public String getLastNStudent() {
		return lastNStudent;
	}

	public void setLastNStudent(String lastNStudent) {
		this.lastNStudent = lastNStudent;
	}

	@Override
	public String toString() {
		return "Student [idStudent=" + idStudent + ", firstNStudent=" + firstNStudent + ", middleNStudent="
				+ middleNStudent + ", lastNStudent=" + lastNStudent + "]";
	}

}
