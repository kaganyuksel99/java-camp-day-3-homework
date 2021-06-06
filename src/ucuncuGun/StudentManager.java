package ucuncuGun;

public class StudentManager  extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("Öðrenci:"+ " "+ user.getFirstName() + " " + user.getLastName()  + " " + "sisteme eklendi" );
	}

}
