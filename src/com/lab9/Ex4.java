package com.lab9;

import java.util.function.BiFunction;

class Employee{
	String fname;
	String lname;
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
	
	public String FullName(String fname,String lname) {
		return (fname.concat(lname));
	}
	
}
public class Ex4 {

	public static void main(String[] args) {
		BiFunction<String,String,String> fun= new Employee()::FullName;
		String fullname=fun.apply("Suchi", " kumari");
		System.out.println(fullname);
	}

}
