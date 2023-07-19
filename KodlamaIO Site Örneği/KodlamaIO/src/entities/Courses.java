package entities;

public class Courses {

	private int coursesId;
	private String coursesName;
	private double coursesPrice;

	public Courses() {

	}

	public Courses(int coursesId, String coursesName, double coursesPrice) {

		this.coursesId = coursesId;
		this.coursesName = coursesName;
		this.coursesPrice = coursesPrice;
	}

	public int getCourseId() {
		return coursesId;
	}

	public void setCourseId(int courseId) {
		this.coursesId = courseId;
	}

	public String getCourseName() {
		return coursesName;
	}

	public void setCourseName(String courseName) {
		this.coursesName = courseName;
	}

	public double getCoursePrice() {
		return coursesPrice;
	}

	public void setCoursePrice(double coursePrice) {
		this.coursesPrice = coursePrice;
	}

}
