package com.dev.functionalInterface.examples;

import java.util.List;
import java.util.function.Consumer;

import com.dev.Student;
import com.dev.StudentDataBase;

public class ConsumerExample {

	static List<Student> students = StudentDataBase.getAllStudents();
	static Consumer<Student> stundentDetails = (student) -> System.out.println("Student details: " + student);
	static Consumer<Student> studentName = (student) -> System.out.print(student.getName());
	static Consumer<Student> studentActivities = (student) -> System.out
			.println(student.getActivities());

	public static void main(String[] args) {
		Consumer<String> nameConsumer = (name) -> System.out.println("Name of user :" + name);
		nameConsumer.accept("Devendra");
		printStudentDetails();
		printStudentNameAndActivities();
		printStudentNameAndActivitiesWhenGradeLevelGraterThen3();
	}

	public static void printStudentDetails() {
		System.out.println("printStudentDetails");
		// print student details

		students.forEach(stundentDetails);
	}

	public static void printStudentNameAndActivities() {
		System.out.println("printStudentNameAndActivities");
		students.forEach(studentName.andThen(studentActivities));
	}
	
	public static void printStudentNameAndActivitiesWhenGradeLevelGraterThen3() {
		System.out.println("printStudentNameAndActivitiesWhenGradeLevelGraterThen3");
		students.forEach(student -> {
			if(student.getGradeLevel() >= 3) {
				studentName.andThen(studentActivities).accept(student);
			}
		});
	}

}
