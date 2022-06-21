package com.cg.hibmapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	
	@Id
	private int rollNo;
	private String stdName;
	private int stdMarks;
	
	@ManyToMany(mappedBy = "student")
	private List<Laptop> laptop=new ArrayList<Laptop>();
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getStdMarks() {
		return stdMarks;
	}
	public void setStdMarks(int stdMarks) {
		this.stdMarks = stdMarks;
	}
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	
	
}
