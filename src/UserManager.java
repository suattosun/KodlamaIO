
public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName() + " kiþisi eklendi");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName() + " kiþisi silindi");
	}
	public void update(User user) {
		System.out.println(user.getFirstName() + " kiþisi güncellendi");
	}
	public final void addMultiple(User[] users) {
		for (User user  : users) {
			System.out.println(user.getFirstName() + " kiþisi toplu olarak eklendi");
		}
		
	}
}
