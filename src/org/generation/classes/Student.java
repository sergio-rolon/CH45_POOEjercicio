package org.generation.classes;

public class Student {
    String firstName;
    String lastName;
    int registration;
    int grade;
    public int year;
    
    public Student(String firstName, String lastName, int registration, int grade, int year) {
     this.firstName=firstName;
     this.lastName=lastName;
     this.registration=registration;
     this.grade=grade;
     this.year=year;   	
    }// Student constructor 1
    
    public Student(String firstName, String lastName, int registration, int grade) {
        this(firstName,lastName, registration, grade, 5);	
       }// Student constructor 2
    
    public Student(String firstName, String lastName, int registration) {
        this(firstName,lastName, registration, 70, 5);	
       }// Student constructor 3
    
    
    public void printFullName(){
        //TODO implement
    	System.out.println("The name of the student with registration "+registration+" is: "+firstName+" "+lastName);
     }// printFullName()

     public boolean isApproved(){
         //TODO implement: should return true if grade >= 60
    	 if(grade>=60) {
    		 return true;
    	 } else {
    		 return false;
    	 } 
     }//isApproved()

     public int changeYearIfApproved(){
         //TODO implement: the student should advance to the next year if he/she grade is >= 60
         // Make year = year + 1, and print "Congragulations" if the student has been approved
         if(isApproved()) {
        	 System.out.println("Congratulations "+firstName+" "+lastName);
        	 
        	 return year=year+1;
         }else {
        	 System.out.println("Not approved "+firstName+" "+lastName);
        	 return year;
         }
     }//changeYearIfApproved()

}// class Student