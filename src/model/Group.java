package model;


public class Group {
	
	private String name;
	private String course;
	public Teacher curator;
	public Student pupil;
	
	public Group (String name, String course, Teacher curator, Student pupil) {
		
		this.setName(name); 
		this.setCourse(course); 
		this.curator = curator;
		this.pupil = pupil;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String toString () {
		return name + " " + course + " " + curator + " " + pupil;
	}
	

}
