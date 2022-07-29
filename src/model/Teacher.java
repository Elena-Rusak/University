package model;


public class Teacher {
		
	private String name; 
	private String surname;
	private int age;
	private Address Teacheraddress;
	
	public Teacher (String name, String surname, int age, Address Teacheraddress) {
		this.setName(name);
		this.setSurname(surname); 
		this.setAge(age);
		this.setTeacheraddress(Teacheraddress);	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int salary () {
		
		int teacherSalary = 30*5+10;
		return teacherSalary;
	}

	public Address getTeacheraddress() {
		return Teacheraddress;
	}

	public void setTeacheraddress(Address teacheraddress) {
		Teacheraddress = teacheraddress;
	}

	public String toString () {
		return name + " " + surname + " " + age + " " + Teacheraddress;
	}

}