package objectComplexity;

public class SchoolMain {
	
	public static void main(String[] args) {
		Student std = new Student();
		std.setName("Shree Biradar");
		std.getAddress().setStreet("Haji malang road");
		std.getAddress().setState("Maharashtra");
		std.getAddress().setCountry("India");
		std.getAddress().setCity("Kalyan");
		
		System.out.println(std);
		
	}
	
	
}
