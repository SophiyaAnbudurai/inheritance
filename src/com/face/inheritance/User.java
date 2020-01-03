package com.face.inheritance;

public class User {

	private String firstname;
	private String lastname;
	private String email;
	private String mobile;
	private int age;
	
	public User(String firstname, String lastname, String email, String mobile, int age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.mobile = mobile;
		this.age = age;
	}
	public void display()
	{
		System.out.println("Firstname:" +this.firstname);
		System.out.println("Lastname:" +this.lastname);
		System.out.println("Email:" +this.email);
		System.out.println("Mobile:" +this.mobile);
		System.out.println("Age:" +this.age);
		
	}
	
	
}
