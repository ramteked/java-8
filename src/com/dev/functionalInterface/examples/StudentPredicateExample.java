package com.dev.functionalInterface.examples;

import java.util.List;
import java.util.function.Predicate;

import com.dev.Student;
import com.dev.StudentDataBase;

public class StudentPredicateExample {

	static List<Student> students = StudentDataBase.getAllStudents();

	static Predicate<Student> gradeLevelPredicate = student -> student.getGradeLevel() >= 3;

	static Predicate<Student> gPAPredicate = student -> student.getGpa() >= 3.9;

	public static void main(String[] args) {
		filterWithGradeLevel();
		filterWithGpa();
		filterWithBothUsingAnd();
		filterWithBothUsingOR();

	}

	public static void filterWithGradeLevel() {
		System.out.println("filterWithGradeLevel");

		students.forEach(student -> {
			if (gradeLevelPredicate.test(student)) {
				System.out.println(student);
			}

		});

	}

	public static void filterWithGpa() {
		System.out.println("filterWithGpa");

		students.forEach(student -> {
			if (gPAPredicate.test(student)) {
				System.out.println(student);
			}

		});

	}
	

	public static void filterWithBothUsingAnd() {
		System.out.println("filterWithBothUsingAnd");

		students.forEach(student -> {
			if (gPAPredicate.and(gradeLevelPredicate).test(student)) {
				System.out.println(student);
			}

		});

	}
	
	public static void filterWithBothUsingOR() {
		System.out.println("filterWithBothUsingOR");

		students.forEach(student -> {
			if (gPAPredicate.or(gradeLevelPredicate).test(student)) {
				System.out.println(student);
			}

		});

	}


}
