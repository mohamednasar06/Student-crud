package com.jsp;



public class StudentApp {
	public static void main(String[] args) {
		StudentDataBase sd=new StudentDataBase();
		for(;;) {
			System.out.println("1.addstudent 2.remove student 3.update student 4.search student 5.display 6.Exit");
			int choice=sd.sc.nextInt();
			switch(choice) {
			case 1:
				sd.addStudent();
				break;
			case 2:
				sd.removeStudent();
				break;
			case 3:
				sd.updateStudent();
				break;
			case 4:
				sd.searchStudent();
				break;
			case 5:
				sd.displayStudent();;
				break;
			case 6:
				return;
				
			}
		}
	}


}
