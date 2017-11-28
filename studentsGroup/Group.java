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

		boolean sex = false;
		boolean contract = false;
		boolean socialBehavior = false;
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

			System.out.println("Enter sex of student: ");
			if (scan.nextLine().equals("man") == true) {
				sex = true;
			} else if (scan.nextLine().equals("woman") == true) {
				sex = false;
			}

			System.out.println("Enter age of student: ");
			int age = Integer.parseInt(scan.nextLine());

			System.out.println("Enter weight of student: ");
			int weight = Integer.parseInt(scan.nextLine());

			System.out.println("Enter height of student: ");
			int height = Integer.parseInt(scan.nextLine());

			System.out.println("Are student contracter?: ");
			if (scan.nextLine().equals("true") == true) {
				contract = true;
			} else if (scan.nextLine().equals("false") == true) {
				contract = false;
			}

			System.out.println("Are the social behavior normal?: ");
			if (scan.nextLine().equals("true") == true) {
				socialBehavior = true;
			} else if (scan.nextLine().equals("false") == true) {
				socialBehavior = false;
			}

			Student newStudent = new Student(age, weight, height, sex, name, surname, contract, socialBehavior);
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

	@Override
	public String toString() {
		arraysSort(group, comparator);
		return "Students:\n" + Arrays.toString(group);
	}
}
