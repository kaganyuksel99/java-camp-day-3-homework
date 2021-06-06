package ucuncuGun;

public class Main {

	public static void main(String[] args) {
		User user  = new User(); 
		user.setId(1);
		user.setFirstName("Rüzgar");
		user.setLastName("Yüksel");
		user.setEmail("ruzgar@gmail.com");
		user.setPhoneNumber("123456789");
		
		Instructor instructor = new Instructor(); 
		instructor.setFirstName("Engin"); 
		instructor.setLastName("Demiroğ");
		instructor.setEmail("engindemirog@gmail.com");
		instructor.setPhoneNumber("12345679887654");
		instructor.setBranch("Yazılım Geliştirici"); 
		
		Student student = new Student();
		student.setFirstName("Kağan");
		student.setLastName("Yüksel");
		student.setEmail("kaanyk07@gmail.com");
		student.setPhoneNumber("147852369");
		student.setTypeOfEducation("Eşit Ağırlık"); 
		
		UserManager userManager = new UserManager();
		userManager.add(user); 
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor); 
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
	}
		
		

}
