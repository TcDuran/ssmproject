package org.lanqiao.entity;

import java.util.Date;

public class Teacher {
private int tno;
private String tName;
private int tAge ;
private Date currenttime;


public Teacher() {
	
}

public Teacher(int tno, String tName, int tAge, Date currenttime) {
	super();
	this.tno = tno;
	this.tName = tName;
	this.tAge = tAge;
	this.currenttime = currenttime;
}
public int getTno() {
	return tno;
}
public void setTno(int tno) {
	this.tno = tno;
}
public String gettName() {
	return tName;
}
public void settName(String tName) {
	this.tName = tName;
}
public int gettAge() {
	return tAge;
}
public void settAge(int tAge) {
	this.tAge = tAge;
}
public Date getCurrenttime() {
	return currenttime;
}
public void setCurrenttime(Date currenttime) {
	this.currenttime = currenttime;
}
}
