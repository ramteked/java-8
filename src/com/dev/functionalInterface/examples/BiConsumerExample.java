package com.dev.functionalInterface.examples;

import java.util.List;
import java.util.function.BiConsumer;

import com.dev.Student;
import com.dev.StudentDataBase;

public class BiConsumerExample {

	static List<Student> students = StudentDataBase.getAllStudents();
	static BiConsumer<String, List<String>> studentNameAndActivities = (name, activities) -> System.out
			.println("Name: " + name + " , activities: " + activities);

	public static void main(String[] args) {

		BiConsumer<Integer, Integer> additions = (no1, no2) -> System.out.println("sum of numbers: " + (no1 + no2));
		additions.accept(10, 20);

		BiConsumer<Integer, Integer> multiplication = (no1, no2) -> System.out
				.println("multiplication of number: " + (no1 * no2));
		multiplication.accept(10, 20);

		students.forEach(student -> {
			studentNameAndActivities.accept(student.getName(), student.getActivities());
		});
	}

}
