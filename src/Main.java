
public class Main {

	public static void main(String[] args) {
		Student studentUser = new Student();
		studentUser.setFirstName("Ali");
		studentUser.setLastName("Veli");
		studentUser.setId(1);
		studentUser.setAge(29);
		studentUser.setEmail("aliveli@gmail.com");
		studentUser.setSchool("Kodlama.ýo");
		
		Student studentUser2 = new Student();
		studentUser2.setFirstName("ahmet");
		studentUser2.setLastName("ozoglu");
		studentUser2.setId(2);
		studentUser2.setAge(25);
		studentUser2.setEmail("ahmetozoglu@gmail.com");
		studentUser2.setSchool("Kodlama.ýo");
		
		Instructor instructorUser = new Instructor();
		instructorUser.setFirstName("Engin");
		instructorUser.setLastName("Demirog");
		instructorUser.setId(3);
		instructorUser.setAge(38);
		instructorUser.setEmail("EnginDemirog@gmail.com");
		
		User[] users = {studentUser, studentUser2};
		UserManager studentManager = new StudentManager();
		studentManager.add(studentUser);
		studentManager.addMultiple(users);
		
		UserManager instructorManager = new InstructorManager();
		instructorManager.add(instructorUser);
 
	}

}
