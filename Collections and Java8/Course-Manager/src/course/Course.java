package course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import classes.Classes;
import student.Student;

public class Course {
	private String name;
	private String teacher;
	private List<Classes> classes = new ArrayList<Classes>();
	private Set<Student> students = new HashSet<>();
	private Map<Integer,Student> idNumberToStudent = new HashMap<>();
	
	
	public Course(String name, String teacher) {
		this.name = name;
		this.teacher = teacher;
	}

	public List<Classes> getClasses() {
		return Collections.unmodifiableList(classes);
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getTeacher() {
		return this.teacher;
	}
	
	public void addClasses(Classes classes) {
		this.classes.add(classes);
	}
	
	public int getTimeTotal() {

		return this.classes.stream().mapToInt(Classes :: getTime).sum();
	}
	
	@Override
	public String toString() {
		return "[Course: " + this.name + ", time: "+ getTimeTotal() + "]";
	}
	
	public void matriculate(Student student) {
		this.students.add(student);
		this.idNumberToStudent.put(student.getIdNumber(), student);
	}
	
	public Set<Student> getStudent() {
		return Collections.unmodifiableSet(students);
	}
	
	public boolean isInCourse(Student student) {
		return this.students.contains(student);
	}

	public Student searchMatriculate(int idNumber) {
		if(!idNumberToStudent.containsKey(idNumber)) {
			throw new NoSuchElementException("Student not found! Student: "+ idNumber);
		}
		return idNumberToStudent.get(idNumber);
	}
}
