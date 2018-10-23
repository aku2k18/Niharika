package in.co.niharika;

import java.util.Date;

public class EncapsulationStudent {
	private String name;
	private Date dob;
	private int id;
	private int marks;
	private char grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
	// To control the variable case in case restricting the variable to accept only Upper case	
	//	this.name = name;
		this.name =  name.toUpperCase();
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		//To have a control on Marks enetered
		//this.marks = marks;
		if (marks > 0 && marks <= 100) {
			this.marks = marks;
		} else {
			this.marks = -1;
		}
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}


}
