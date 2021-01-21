package br.com.alura;

import classes.Classes;
import course.Course;
import student.Student;

public class CourseWithStudentTest {

	public static void main(String[] args) {
		Course javaCollections = new Course("Collections hard", "Paulo Silveira");
		
//		javaCollections.getClasses().add(new Classes("Working with ArrayList", 25));
		javaCollections.addClasses(new Classes("Working with ArrayList", 25));
		javaCollections.addClasses(new Classes("Modelling with Collections", 28));
		javaCollections.addClasses(new Classes("Creating a class", 35));
		
		Student student1 = new Student("Maria Joaquinha", 1234);
		Student student2 = new Student("Cirilo Paulo", 1235);
		Student student3 = new Student("Peter Parker", 1235);
		
		javaCollections.matriculate(student1);
		javaCollections.matriculate(student2);
		javaCollections.matriculate(student3);
		
		System.out.println("All students in course: ");
		javaCollections.getStudent().forEach(student -> System.out.println(student));
		
		System.out.println("The student " + student1.getName() + " is in course: " + 
		javaCollections.isInCourse(student1));
	}

}
