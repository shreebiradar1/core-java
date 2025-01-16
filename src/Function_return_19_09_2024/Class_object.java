package Function_return_19_09_2024;

public class Class_object {
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.Name = "Shree";
		s1.address = "Pune";
		s1.age = 19;
		s1.mobile = "8291975766";
		
		String last = s1.forLastName("Biradar");
		System.out.println(s1.Name+" "+last);
		
		String countryCode = s1.Code("+91");
		System.out.println("Calling on.. "+countryCode+s1.mobile);
	}
}
