package com.java.docker.model;

public class Student {
	
	private int sId;
	private String sName;
	private int rollNo;
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", rollNo=" + rollNo + "]";
	}
	
}
