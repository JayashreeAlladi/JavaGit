package com.bank.model;

import java.io.Serializable;

public class User implements Serializable {
   private String fname;
   private String lname;
   private long aadharCardNo;
   private long accountNo;
   private String accountType;
   private String pancardNo;
   private long phoneNo;
   private String address;
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
public long getAadharCardNo() {
	return aadharCardNo;
}
public void setAadharCardNo(long aadharCardNo) {
	this.aadharCardNo = aadharCardNo;
}
public long getAccountNo() {
	return accountNo;
}
public void setAccountNo(long accountNo) {
	this.accountNo = accountNo;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public String getPancardNo() {
	return pancardNo;
}
public void setPancardNo(String pancardNo) {
	this.pancardNo = pancardNo;
}
public long getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(long phoneNo) {
	this.phoneNo = phoneNo;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
   
}
