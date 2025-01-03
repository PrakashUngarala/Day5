package logical_sections.day6;

import java.util.Objects;

public class Student {

	private int id;
	private String name;
	private long phno;
	private String course;
	private char gender;
	public Student(int id, String name, long phno, String course, char gender) {
		super();
		this.id = id;
		this.name = name;
		this.phno = phno;
		this.course = course;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phno=" + phno + ", course=" + course + ", gender=" + gender
				+ "]";
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
		return Objects.equals(course, other.course) && gender == other.gender && id == other.id
				&& Objects.equals(name, other.name) && phno == other.phno;
	}
	
	
	
}
