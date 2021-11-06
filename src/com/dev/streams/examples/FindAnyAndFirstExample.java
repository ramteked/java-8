package com.dev.streams.examples;

import java.util.Optional;

import com.dev.Student;
import com.dev.StudentDataBase;

public class FindAnyAndFirstExample {

	public static void main(String[] args) {
		
	 Optional<Student> studentGradeLevel =	StudentDataBase.getAllStudents().stream()
		.filter(student -> student.getGradeLevel() >= 3)
		.findAny();
	 
	 System.out.println(studentGradeLevel);
	 
	 Optional<Student> studentGpa =	StudentDataBase.getAllStudents().stream()
				.filter(student -> student.getGpa() >= 3)
				.findAny();
			 
			 System.out.println(studentGpa);

	}

}
