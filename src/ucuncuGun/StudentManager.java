package ucuncuGun;

public class StudentManager  extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("��renci:"+ " "+ user.getFirstName() + " " + user.getLastName()  + " " + "sisteme eklendi" );
	}

}
