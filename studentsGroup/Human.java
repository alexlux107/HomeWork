package studentsGroup;

public class Human {

	private int age;
	private int weight;
	private int height;
	private boolean sex;
	private String name;
	private String surname;

	public Human(int age, int weight, int height, boolean sex, String name, String surname) {
		super();
		this.age = age;
		this.weight = weight;
		this.height = height;
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

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
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
		return " age=" + age + ", weight=" + weight + ", height=" + height + ", sex=" + sex + ", name=" + name + ", surname= " + surname;
	}

}