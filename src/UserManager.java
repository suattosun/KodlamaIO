
public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName() + " ki�isi eklendi");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName() + " ki�isi silindi");
	}
	public void update(User user) {
		System.out.println(user.getFirstName() + " ki�isi g�ncellendi");
	}
	public final void addMultiple(User[] users) {
		for (User user  : users) {
			System.out.println(user.getFirstName() + " ki�isi toplu olarak eklendi");
		}
		
	}
}
