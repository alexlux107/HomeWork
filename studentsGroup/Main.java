package studentsGroup;

public class Main {

	public static void main(String[] args) {
		
		Student ellise = new Student(17, 55, 166, false, "Ellise", "Schmidt", true, false);
		Student mira = new Student(18, 56, 170, false, "Mira", "Fischer", true, true);
		Student sindy = new Student(17, 53, 167, false, "Sindy", "Mayer", false, false);
		Student jasmine = new Student(19, 52, 164, false, "Jasmine", "Becker", false, true);
		Student lussy = new Student(20, 56, 170, false, "Lussy", "Koch", false, true);
		Student alex = new Student(18, 70, 170, true, "Alex", "Richter", true, true);
		Student will = new Student(20, 75, 172, true, "Will", "Hofmann", true, true);
		Student gerbert = new Student(18, 77, 173, true, "Gerbert", "Hartmann", false, true);
		Student norbert = new Student(19, 75, 172, true, "Norbert", "Schmitt", true, false);
		Student filip = new Student(18, 71, 173, true, "Filip", "Werner", true, false);
		
//		Group group = new Group();
//		
//		try {
//			group.addNewStudent(ellise);
//			group.addNewStudent(mira);
//			group.addNewStudent(sindy);
//			group.addNewStudent(jasmine);
//			group.addNewStudent(lussy);
//			group.addNewStudent(alex);
//			group.addNewStudent(will);
//			group.addNewStudent(gerbert);
//			group.addNewStudent(norbert);
//			group.addNewStudent(filip);
//		}catch (GroupFullException e) {
//			e.getMessage();
//		}
//		
//		System.out.println(group);
//		System.out.println();
//		
//		group.deleteStudent(lussy);
//		System.out.println(group);
//		System.out.println();
//		
//		System.out.println("Result of search: Norbert\n" + group.searchStudent("Norbert"));
		
		Group newGroup = new Group();
		
		try {
			newGroup.addNewStudent(ellise);
			newGroup.addNewStudent(mira);
			newGroup.addNewStudent(sindy);
			newGroup.addNewStudent(jasmine);
			newGroup.addNewStudent(lussy);
			newGroup.addNewStudent(alex);
			newGroup.addNewStudent(will);
			newGroup.addNewStudent(norbert);
			newGroup.addInfoStudent();
			newGroup.addInfoStudent();
		}catch (GroupFullException e) {
			e.getMessage();
		}
		
		System.out.println(newGroup);
		System.out.println();
		
		newGroup.deleteStudent(lussy);
		System.out.println(newGroup);
		System.out.println();
		
		System.out.println("Result of search: Norbert\n" + newGroup.searchStudent("Norbert"));
		
		System.out.println(newGroup.army());
	}

}
