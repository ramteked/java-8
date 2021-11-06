package com.dev.functionalInterface.student.examples;

import java.util.List;
import java.util.function.Predicate;

import com.dev.Student;
import com.dev.StudentDataBase;

public class StudentPredicateExample {

	static List<Student> students = StudentDataBase.getAllStudents();
	static Predicate<Student> checkGradeLevel = student -> student.getGradeLevel() >= 3 ;
	static Predicate<Student> checkGpa = student -> student.getGpa() >= 3.9 ;
	
	public static void main(String[] args) {
		printStudentHavingGradeLevelIsMoreThan3();
		printStudentDetailsHavingGPAGraterThan();
	}

	public static void printStudentHavingGradeLevelIsMoreThan3() {
		System.out.println("printStudentHavingGradeLevelIsMoreThan3");
		students.forEach(student -> {
			if(checkGradeLevel.test(student)) {
				System.out.println(student);
			}
		});
	}
	
	public static void printStudentDetailsHavingGPAGraterThan(){
		System.out.println("printStudentDetailsHavingGPAGraterThan");
		students.forEach(student -> {
			if(checkGpa.test(student)) {
				System.out.println(student);
			}
		});
	} 
}
