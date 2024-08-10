package collection;

public class Student {
	String name ;
	int rollnum ;
	double marks ;
	
	public Student(String name, int rollnum, double marks) {
		super();
		this.name = name;
		this.rollnum = rollnum;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollnum() {
		return rollnum;
	}

	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
}

