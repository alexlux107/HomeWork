package studentsGroup;

public class Student extends Human {
	private boolean contract;
	private boolean socialBehavior;

	public Student(int age, boolean sex, String name, String surname, 
				   boolean contract, boolean socialBehavior) {
		super(age, sex, name, surname);
		this.contract = contract;
		this.socialBehavior = socialBehavior;
	}

	public Student() {
		super();
	}
	

	public boolean isContract() {
		return contract;
	}

	public void setContract(boolean contract) {
		this.contract = contract;
	}

	public boolean isSocialBehavior() {
		return socialBehavior;
	}

	public void setSocialBehavior(boolean socialBehavior) {
		this.socialBehavior = socialBehavior;
	}

	@Override
	public String toString() {
		return "Student " + super.toString() + " type=" + contract + ", socialBehavior=" + socialBehavior + "\n";
	}

}
