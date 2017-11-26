package studentsGroup;

import java.util.Arrays;
import java.util.Comparator;

public class Group {
	private Student[] group = new Student[10];

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
			if (name != null && group[i] != null && group[i].getName() != null && group[i].getName().equalsIgnoreCase(name)) {
				return group[i];
			}
		}
		return null;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Arrays.sort(group, new Comparator<Student>() {
			@Override
			public int compare(Student studOne, Student studTwo) {
				if ((studOne == null || studOne.getName() == null) || (studTwo == null || studTwo.getName() == null)) {
					return -1;
				}
				return studOne.getName().compareTo(studTwo.getName());
			}
		});
		for (int i = 0; i < group.length; i++) {
			if (group[i] != null) {
				sb.append(group[i].toString());
			}
		}
		return "Group:\n" + sb.toString();
	}
}
