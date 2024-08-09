package record;

public class Exemplo1 {

	public static void main(String[] args) {
		
        User user1 = new User(1, "John");
        System.out.println(user1);
        
		if (user1 instanceof User) {
			System.out.println("user1 is an instance of User");
		}
		
		if(user1 instanceof User u) {
			System.out.println(u.id());
			System.out.println(u.nome());
		}
		
		if(user1 instanceof User u && u.id() == 1) {
			System.out.println(u.id());
			System.out.println(u.nome());
		}
		
    }
	
}
