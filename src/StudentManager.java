
public class StudentManager extends UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " kiþisi öðrenci olarak eklendi");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName() + " kiþisi öðrenci olarak  silindi");
	}
	public void update(User user) {
		System.out.println(user.getFirstName() + " kiþisi öðrenci olarak  güncellendi");
	}
 
		
}
