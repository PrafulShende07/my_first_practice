package com.example.Model;

public class Student {
	
	private String fname;
	private String lname;
	private String saddress;
	private int smarks;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public int getSmarks() {
		return smarks;
	}
	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}
	@Override
	public String toString() {
		return "Student [fname=" + fname + ", lname=" + lname + ", saddress=" + saddress + ", smarks=" + smarks + "]";
	}
	
	

}
