package com.dev.functionalInterface.examples;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.dev.Student;
import com.dev.StudentDataBase;

public class BiFunctionStudentExample {

	static Predicate<Student> studentPredicate = student -> student.getGpa() >= 3.9;

	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> nameAndGpaFunction = (students,
			predicate) -> {
		Map<String, Double> nameAndGpa = new HashMap();
		students.forEach(student -> {
			if (predicate.test(student))
				nameAndGpa.put(student.getName(), student.getGpa());
		});
		return nameAndGpa;
	};

	public static void main(String[] args) {

		System.out.println(nameAndGpaFunction.apply(StudentDataBase.getAllStudents(), studentPredicate));
	}
}
