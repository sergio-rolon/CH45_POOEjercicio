package org.generation;

import org.generation.classes.Student;

import org.generation.classes.Courses;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creation of three student objects
		Student student1 = new Student ("Sergio", "Rolón", 1001, 60, 5);
		Student student2 = new Student ("Raúl", "Rolón", 1002, 100, 5);
		Student student3 = new Student ("Victoria", "Rolón", 1003, 90, 5);
		// Creation of three objects for add to array
		Student student4 = new Student ("Antonio", "Rolón", 1004, 50, 5);
		Student student5 = new Student ("Jasael", "Rolón", 1005, 80, 5);
		Student student6 = new Student ("Cristian", "Rolón", 1006, 90, 5);
		// Initialization of array
		Student[] students = {student4, student5, student6};
		// Creation of course object
		Courses course1 = new Courses ("Psychology", "Mayra", 5);
		// Enroll student and unenrolled for practice
		course1.enroll(student1);
		course1.unEnroll(student1);
		// Enroll students individually
		course1.enroll(student1);
		course1.enroll(student2);
		course1.enroll(student3);
		// Print name of a student
		student1.printFullName();
		// Enroll students by group
		course1.enroll(students);
		// Show number of students enrolled
		System.out.println(course1.courseName+" has "+course1.countStudents()+" students enrolled");
		//Show best grade
		System.out.println("The best grade of the course is: "+course1.bestGrade());
		// Show message of approvement or not
		student2.changeYearIfApproved();
		// Show average grade of the course
		System.out.println("The average grade of "+course1.courseName+" is "+course1.averageGrade());
	}

}
