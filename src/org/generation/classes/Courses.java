package org.generation.classes;

import java.util.ArrayList;
import java.util.List;

public class Courses {
	public String courseName;
	String professorName;
	int year;
	List <Student> enrolledStudents = new ArrayList<Student>();
	
	
	public Courses(String courseName, String professorName, int year) {
		this.courseName=courseName;
		this.professorName=professorName;
		this.year=year;
	}// Constructor
	
	public void enroll(Student student){
	      //TODO add the student to the collection
		if(student!=null) {
		enrolledStudents.add(student);
		System.out.println("Student "+ student.registration + " enrolled");
		}else {
		   System.out.println("Student not found");
		   }
	   }//enroll()
	
	public void enroll(Student[] students){
	      //TODO add the student to the collection
		if(students!=null) {
			for(Student student:students) {
				enrolledStudents.add(student);
				System.out.println("Student "+ student.registration + " enrolled");
			}//foreach
			}else {
			System.out.println("Student not found");
			}
		}//enroll() overload
	
	   public void unEnroll(Student student){
	       //TODO remove this student from the collection
	       // Hint: check if that really is this student
			if(student!=null) {
				enrolledStudents.remove(student);
				System.out.println("Student "+ student.registration + " unenrolled");
			   }else {
				   System.out.println("Student not found");
				   }
	   }//unEnroll() 

	   public int countStudents(){
	       //TODO implement
	       return enrolledStudents.size();
	   }//countStudents()
	   
	   public int bestGrade(){
	       //TODO implement
		   int bestGrade=0;
	    	if(enrolledStudents!=null) {
	        	for(Student student:enrolledStudents) {
	        		if(bestGrade < student.grade) {
	        			bestGrade=student.grade;
	        		};
	        	} //foreach
	        	}//if(enrolledStudents!=null)
	    	return bestGrade;
	   }//bestGrade()
	   
	   public float averageGrade() {
		   float averageGrade=0;
		   int sumGrades=0;
	    	if(enrolledStudents!=null) {
	        	for(Student student:enrolledStudents) {
	        		sumGrades+=student.grade;
	        	} //foreach
	        	averageGrade=(float)sumGrades/enrolledStudents.size();
	        	}//if(enrolledStudents!=null)
	    	return averageGrade;
	   }
}
