
public class StudentManager extends UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " ki�isi ��renci olarak eklendi");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName() + " ki�isi ��renci olarak  silindi");
	}
	public void update(User user) {
		System.out.println(user.getFirstName() + " ki�isi ��renci olarak  g�ncellendi");
	}
 
		
}
