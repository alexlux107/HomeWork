package HW1;

public class Cat {
	
    private int age;
    private double weight;
    private String name;
    private String colorEyes;
    private String color;

    public Cat(int age, double weight, String name, String colorEyes, String color) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.colorEyes = colorEyes;
        this.color = color;
    }
    
    public void helloKiti(){
        System.out.println("Meeooow!");
    }
    
    public double eat(){
        return weight+=0.1;
    }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColorEyes() {
		return colorEyes;
	}

	public void setColorEyes(String colorEyes) {
		this.colorEyes = colorEyes;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Cat age=" + age + ",\nCat weight=" + weight + ",\nCat name=" + name + 
			   ",\nCat colorEyes=" + colorEyes + ",\nCat color=" + color + "\n";
	}
    
    

}

