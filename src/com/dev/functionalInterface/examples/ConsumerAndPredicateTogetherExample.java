package com.dev.functionalInterface.examples;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.dev.Student;
import com.dev.StudentDataBase;

public class ConsumerAndPredicateTogetherExample {

	Predicate<Student> gradeLevelPredicate = student -> student.getGradeLevel() >= 3;
	Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.9;

	BiPredicate<Integer, Double> gradeLevelAndGPAPredicate = (gradeLevel, gpa) -> gradeLevel >= 4 && gpa >= 3.9;

	BiConsumer<String, List<String>> nameAndActivitiesConsumer = (name, activity) -> System.out
			.println(name + " : " + activity);

	Consumer<Student> studentLambda = (student) -> {
		if (gradeLevelPredicate.and(gpaPredicate).test(student)) {
			nameAndActivitiesConsumer.accept(student.getName(), student.getActivities());

		}
	};

	Consumer<Student> studentLambdaUsingBiPredicate = (student) -> {
		if (gradeLevelAndGPAPredicate.test(student.getGradeLevel(), student.getGpa())) {
			nameAndActivitiesConsumer.accept(student.getName(), student.getActivities());

		}
	};

	List<Student> students = StudentDataBase.getAllStudents();

	public static void main(String[] args) {

		ConsumerAndPredicateTogetherExample example = new ConsumerAndPredicateTogetherExample();
		example.printNameAndActivities();
		example.printNameAndActivitiesUsingBiPredicate();
		
	}

	public void printNameAndActivities() {
		System.out.println("printNameAndActivities");

		students.forEach(studentLambda);
	}

	public void printNameAndActivitiesUsingBiPredicate() {
		System.out.println("printNameAndActivitiesUsingBiPredicate");

		students.forEach(studentLambdaUsingBiPredicate);
	}
}
