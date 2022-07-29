package model;

public class Student {

	private String name; 
	private String surname;
	private int age;
	public Address Studentaddress;
	
	public Student (String name, String surname, int age, Address Studentaddress) {
		this.setName(name);
		this.setSurname(surname); 
		this.setAge(age);
		this.Studentaddress = Studentaddress;	
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
	
	
//	student1.Studentaddress = "";
	
	
	public String toString () {
		return name + " " + surname + " " + age + " " + Studentaddress;
	}
}
