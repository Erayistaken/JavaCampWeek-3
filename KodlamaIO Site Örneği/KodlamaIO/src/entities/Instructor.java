package entities;

public class Instructor {

	private int instructorId;
	private String instructorName;
	private String instructorLastname;

	public Instructor() {

	}

	public Instructor(int instructorId, String instructorName, String instructorLastname) {
		super();
		this.instructorId = instructorId;
		this.instructorName = instructorName;
		this.instructorLastname = instructorLastname;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public String getInstructorLastname() {
		return instructorLastname;
	}

	public void setInstructorLastname(String instructorLastname) {
		this.instructorLastname = instructorLastname;
	}

}
