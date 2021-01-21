package classes;

public class Classes implements Comparable<Classes>{
	
	private String title;
	private int time;
	
	public Classes(String title, int time) {
		this.title = title;
		this.time = time;
	}
	public String getTitle() {
		return title;
	}
	
	public int getTime() {
		return time;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Clsss: "+ this.title + ", " + this.time + " minutes]";
	}
	@Override
	public int compareTo(Classes otherClass) {
	
		return this.title.compareTo(otherClass.title);
	}
	
}
