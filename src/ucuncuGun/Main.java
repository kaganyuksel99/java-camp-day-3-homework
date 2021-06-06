package ucuncuGun;

public class Main {

	public static void main(String[] args) {
		User user  = new User(); 
		user.setId(1);
		user.setFirstName("R�zgar");
		user.setLastName("Y�ksel");
		user.setEmail("ruzgar@gmail.com");
		user.setPhoneNumber("123456789");
		
		Instructor instructor = new Instructor(); 
		instructor.setFirstName("Engin"); 
		instructor.setLastName("Demiro�");
		instructor.setEmail("engindemirog@gmail.com");
		instructor.setPhoneNumber("12345679887654");
		instructor.setBranch("Yaz�l�m Geli�tirici"); 
		
		Student student = new Student();
		student.setFirstName("Ka�an");
		student.setLastName("Y�ksel");
		student.setEmail("kaanyk07@gmail.com");
		student.setPhoneNumber("147852369");
		student.setTypeOfEducation("E�it A��rl�k"); 
		
		UserManager userManager = new UserManager();
		userManager.add(user); 
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor); 
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
	}
		
		

}
