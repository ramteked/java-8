package com.dev.functionalInterface.examples;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import com.dev.Student;
import com.dev.StudentDataBase;

public class FunctionStudentExample {

	static Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.9;

	static Function<List<Student>, Map<String, Double>> nameAndGPA = (students) -> {
		Map<String, Double> nameAndGpa = new HashMap<String, Double>();
		students.forEach(student -> {
			if (gpaPredicate.test(student))
				nameAndGpa.put(student.getName(), student.getGpa());
		});

		return nameAndGpa;
	};

	public static void main(String[] args) {
		List<Student> students = StudentDataBase.getAllStudents();

		System.out.println(nameAndGPA.apply(students));
	}
}
