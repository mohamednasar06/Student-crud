package com.jsp;

import java.util.Arrays;
import java.util.Scanner;



public class StudentEntity {
	//create variable
	 private int rollNo;
	private String name;
	//created the array to store 5 marks of a student 
	private double[]marks=new double[5];
	//created a scanner object for dynamic input
	Scanner sc=new Scanner(System.in);
	//created the constructor for assign data during object creation
	StudentEntity(int rollNo,String name){
		this.rollNo=rollNo;
	    this.name=name;
	    setMarks();
	    
	}
	StudentEntity(){}
	
	public void setMarks() {
		
		for(int i=0;i<marks.length;i++) {
			System.out.println("enter the"+i+1+"st"+"marks");
			marks[i]=sc.nextInt();
		}
		
	}
	//overrided a hashcode and equals method because going create a set to avoid duplicate object
	public int hashCode() {
		return name.hashCode()+rollNo;
	}
	public boolean equals(Object obj) {
		StudentEntity student=(StudentEntity)obj;
		return this.name.equals(student.name)&&this.rollNo==student.rollNo;
		
	}
    //overrided a toString method to print state of an object
	@Override
	public String toString() {
		return "StudentEntity [rollNo=" + rollNo + ", name=" + name + ", marks=" + Arrays.toString(marks) + "]";
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double[] getMarks() {
		return marks;
	}

	public void setMarks(double[] marks) {
		this.marks = marks;
	}
	
	

}

