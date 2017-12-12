package studentsGroup;

import java.io.Serializable;

public class Human implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int age;
	private boolean sex;
	private String name;
	private String surname;

	public Human(int age, boolean sex, String name, String surname) {
		super();
		this.age = age;
		this.sex = sex;
		this.name = name;
		this.surname = surname;
	}

	public Human() {
		super();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSurname() {
		return surname;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return " age=" + age + ", sex=" + sex + ", name=" + name + ", surname= " + surname;
	}

}