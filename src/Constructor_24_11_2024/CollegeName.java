package Constructor_24_11_2024;

public class CollegeName {
	public static void main(String[] args) {
		
		//Creating object of Student class
		//Calling No argument constructor
		Student s1 = new Student();
		
		Student s2 = new Student("krishna",19);
		
		System.out.println(s1.FirstName);
		System.out.println(s1.LastName);
		
		System.out.println(s2.FirstName);
		System.out.println(s2.Mainage);
	}
}
