package student;

public class Student {
	private String name;
	private int idNumber;
	
	public Student (String name, int idNumber) {
		if(name == null) {
			throw new NullPointerException();
		} 
		this.name = name;
		this.idNumber = idNumber;
	}
	
	public String getName() {
		return name;
	}
	public int getIdNumber() {
		return idNumber;
	}
	
	@Override
	public String toString() {
		return "[Student: " + this.name + ", idNumber: " + this.idNumber + "]" ;
	}
/*
	@Override
	public boolean equals(Object obj) {
		Student otherStudent = (Student) obj;
		return this.name.equals(otherStudent);
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
*/

	// implementation using CTRL + 3 on Eclipse IDE
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idNumber;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (idNumber != other.idNumber)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}	
}
