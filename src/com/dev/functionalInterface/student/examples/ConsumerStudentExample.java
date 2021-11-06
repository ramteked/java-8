package com.dev.functionalInterface.student.examples;

import java.util.List;
import java.util.function.Consumer;

import com.dev.Student;
import com.dev.StudentDataBase;

public class ConsumerStudentExample {
	
	static List<Student> students = StudentDataBase.getAllStudents();
	
	//print student details
	static Consumer<Student> studentDetails = student -> System.out.println(student);
	
	//print student name
	static Consumer<Student> studentName = student -> System.out.println(student.getName());
	
	//print student gradeLevel
	static Consumer<Student> studentGradeLevel = student -> System.out.println(student.getGradeLevel());
	
	public static void main(String[] args) {
		printStudentDetails();
		printStudentName();
		printStudentGradeLevel();
	}

	public static void printStudentDetails() {
		System.out.println("printStudentDetails");
		students.forEach(studentName);
	}

	
	public static void printStudentName() {
		System.out.println("printStudentName");
		students.forEach(studentName);
	}

	public static void printStudentGradeLevel() {
		System.out.println("printStudentGradeLevel");
		students.forEach(studentGradeLevel);
	}
}
