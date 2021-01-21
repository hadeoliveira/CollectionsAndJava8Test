package course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import classes.Classes;

public class CourseTest {
	public static void main(String[] args) {
		Course javaCollections = new Course("Collections hard", "Paulo Silveira");
		
//		javaCollections.getClasses().add(new Classes("Working with ArrayList", 25));
		javaCollections.addClasses(new Classes("Working with ArrayList", 25));
		javaCollections.addClasses(new Classes("Modelling with Collections", 28));
		javaCollections.addClasses(new Classes("Creating a class", 35));
		
		List<Classes> classesImmutable = javaCollections.getClasses();
		System.out.println(classesImmutable);
		
		List<Classes> classes = new ArrayList<>(classesImmutable);
		Collections.sort(classes);
	
		
		System.out.println(classes);
		System.out.println(javaCollections.getTimeTotal());
		
		System.out.println(javaCollections);
	}
}
