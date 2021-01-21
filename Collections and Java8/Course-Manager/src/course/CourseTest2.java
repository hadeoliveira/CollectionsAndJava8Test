package course;

import java.util.Collections;
import java.util.List;
import classes.Classes;

public class CourseTest2 {
	public static void main(String[] args) {
		Course javaCollections = new Course("Collections hard", "Paulo Silveira");
		
//		javaCollections.getClasses().add(new Classes("Working with ArrayList", 25));
		javaCollections.addClasses(new Classes("Working with ArrayList", 25));
		javaCollections.addClasses(new Classes("Modelling with Collections", 28));
		javaCollections.addClasses(new Classes("Creating a class", 35));
		
		List<Classes> classes = javaCollections.getClasses();
		System.out.println(classes);
		
	}
}
