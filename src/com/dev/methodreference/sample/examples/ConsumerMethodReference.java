package com.dev.methodreference.sample.examples;

import java.util.function.Consumer;
import java.util.function.Predicate;

import com.dev.Student;
import com.dev.StudentDataBase;

public class ConsumerMethodReference {

	public static void main(String[] args) {
		Consumer<Student> consumerStudent = System.out::println;
		StudentDataBase.getAllStudents().forEach(consumerStudent);
		
		Consumer<Student> printActivities = student -> student.printActivities() ;
		Consumer<Student> activities = Student::printActivities;
		
		StudentDataBase.getAllStudents().forEach(activities);
		
		Predicate<Student> gradeLevelPredicate = checkGradeLevel();
		System.out.println("Student pass: "+gradeLevelPredicate.test(StudentDataBase.aStudent.get()));
		
		
	}

	private static Predicate<Student> checkGradeLevel() {
		return student -> student.getGradeLevel() >= 3;
	}

	

}
