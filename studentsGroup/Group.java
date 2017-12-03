package studentsGroup;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class Group implements Army {
	private static Comparator<Student> comparator;
	private Student[] group = new Student[10];

	public Group() {
		super();
	}

	public void addInfoStudent() {
		try {
			for (int i = 0; i < group.length; i++) {
				if (group[i] != null && group[group.length - 1] != null) {
					throw new GroupFullException();
				}
			}
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter name of student: ");
			String name = scan.nextLine();
			System.out.println("Enter surname of student: ");
			String surname = scan.nextLine();
			System.out.println("Enter age of student: ");
			int age = Integer.parseInt(scan.nextLine());
			System.out.println("Enter sex of student(true - man/false - woman): ");
			boolean sex = checkInput(scan);
			System.out.println("Are student contracter?(true/false): ");
			boolean contract = checkInput(scan);
			System.out.println("Are the social behavior normal?(true/false): ");
			boolean socialBehavior = checkInput(scan);
			Student newStudent = new Student(age, sex, name, surname, contract, socialBehavior);
			addNewStudent(newStudent);

		} catch (GroupFullException e) {
			System.out.println(e.getMessage());
		}
	}

	public void addNewStudent(Student student) throws GroupFullException {
		if (student != null) {
			for (int i = 0; i < group.length; i++) {
				if (group[i] == null) {
					group[i] = student;
					return;
				}
			}
			throw new GroupFullException();

		} else {
			System.out.println("Wrong information about student!!!");
		}
	}

	public void deleteStudent(Student student) {
		for (int i = 0; i < group.length; i++) {
			if (group[i] == student) {
				group[i] = null;
			}
		}
	}

	public Student searchStudent(String name) {
		for (int i = 0; i < group.length; i++) {
			if (name != null && group[i] != null && group[i].getName() != null
					&& group[i].getName().equalsIgnoreCase(name)) {
				return group[i];
			}
		}
		return null;
	}

	public void arraysSort(Student[] group, Comparator<Student> compare) {
		compare = Comparator.comparing(Student::getSurname);

		for (int i = 0; i < group.length; i++) {
			for (int j = i + 1; j < group.length; j++) {
				if (compare.compare(group[j], group[i]) < 0) {
					Student temp = group[j];
					group[j] = group[i];
					group[i] = temp;
				}
			}
		}

	}

	public Student[] army() {
		Student[] army = new Student[10];
		int j = 0;

		for (int i = 0; i < group.length; i++) {
			if (group[i] != null && group[i].getAge() >= 18) {
				army[j] = group[i];
				j++;
			}
			throw new NullPointerException("Return value is null at method army!!!");
		}
		arraysSort(army, comparator);
		return army;
	}
	public boolean checkInput(Scanner scan) {
		boolean input = true;
		do {
			
		if (scan.nextLine().equals("true") == true) {
			input = true;
			return input;
		} else if (scan.nextLine().equals("false") == false) {
			input = false;
			return input;
		}
		System.out.println("Wrong input! Only true or false! Please reenter:");
		}while(scan.nextLine().equals("true") != true || scan.nextLine().equals("false") != false);
		return input;
	}

	@Override
	public String toString() {
		arraysSort(group, comparator);
		return "Students:\n" + Arrays.toString(group);
	}
}
