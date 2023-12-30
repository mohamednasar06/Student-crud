package com.jsp;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentDataBase {
	Set student=new LinkedHashSet();
	Scanner sc=new Scanner(System.in);
	public void addStudent() {
		System.out.println("enter roll no");
		int rollNo=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		if(student.add(new StudentEntity(rollNo,name)))
			System.out.println("student added");
		else
			System.err.println("please recheck the details");
		
		
	}
	public void removeStudent() {
		System.out.println("enter the roll no of student");
		int rollNo=sc.nextInt();
		Iterator stu=student.iterator();
		while(stu.hasNext()) {
			StudentEntity se=(StudentEntity)stu.next();
			if(se.getRollNo()==rollNo) {
				student.remove(se);
				System.out.println("student removed");
				return;
			}
		}
		System.out.println("student data is not found in database");
		
		
	}
	public void searchStudent() {
		System.out.println("enter the roll no of student");
		int rollNo=sc.nextInt();
		Iterator stu=student.iterator();
		while(stu.hasNext()) {
			StudentEntity se=(StudentEntity)stu.next();
			if(se.getRollNo()==rollNo) {
				
				System.out.println(se);
				return;
			}
		}
		System.out.println("student data is not found in database");
		
		
	}
	public void updateStudent() {
		System.out.println("enter the roll no of student");
		int rollNo=sc.nextInt();
		Iterator stu=student.iterator();
		while(stu.hasNext()) {
			StudentEntity se=(StudentEntity)stu.next();
			if(se.getRollNo()==rollNo) {
			System.out.println("if you need to update name enter 1 marks 2 for the menu 3");
			int choice=sc.nextInt();
			if(choice==1) {
				System.out.println("enter the new Name");
				se.setName(sc.next());
				return;
				
			}
			else if(choice==2) {
				double[]marks=se.getMarks();
				
				System.out.println("which subject you need to update");
				System.out.println("1.Tamil");
				System.out.println("2.English");
				System.out.println("3.Maths");
				System.out.println("4.Sceince");
				System.out.println("5.social sceince");
				System.out.println("for the menu press anything");
				int markschoice=sc.nextInt();
				if(markschoice<=1&&markschoice>=5) {
					marks[markschoice-1]=sc.nextDouble();
					return;
					
				}
				else
					return;
				
			}
				
			}
				
			
			else {
				return;
			}
		}
		System.out.println("student data is not found in database");
		
	}
	public void displayStudent() {
		Iterator stu=student.iterator();
		while(stu.hasNext()) {
			StudentEntity se=(StudentEntity)stu.next();
			
				System.out.println(se);
			}
		}
		

}
