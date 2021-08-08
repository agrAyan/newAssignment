package com.college.model;

public class College {
public College(String clgName, String city, int semester, double fees) {
		super();
		this.clgName = clgName;
		this.city = city;
		this.semester = semester;
		this.fees = fees;
	}
public College() {
		super();
	}
@Override
	public String toString() {
		return "College [clgName=" + clgName + ", city=" + city + ", semester=" + semester + ", fees=" + fees + "]";
	}
public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
String clgName;
String city;
int semester;
double fees;

}
