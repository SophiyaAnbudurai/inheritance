package com.face.inheritance;

public class Student extends User{
	private String firstname;
	private String lastname;
	private int roll;
	private float cgpa;

	public Student(String firstname, String lastname, String email, String mobile,int age,int roll, float cgpa) {
		super(firstname,lastname,email,mobile,age);
		 this.roll = roll;
		this.cgpa = cgpa;
	}
	public void display()
	{
		super.display();
		System.out.println("Roll:" +this.roll);
		System.out.println("Cgpa:" +this.cgpa);

	}
	
}
