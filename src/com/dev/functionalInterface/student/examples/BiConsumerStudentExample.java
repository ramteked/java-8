package com.dev.functionalInterface.student.examples;

import java.util.List;
import java.util.function.BiConsumer;

import com.dev.Student;
import com.dev.StudentDataBase;

public class BiConsumerStudentExample {

	static List<Student> students = StudentDataBase.getAllStudents();
	static BiConsumer<String, List<String>> concatName = (firstName, activities) -> System.out
			.println(firstName + " " + activities);

	public static void main(String[] args) {
		students.forEach(student -> concatName.accept(student.getName(), student.getActivities()));
	}

}
