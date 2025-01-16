package AccessingDataFromOtherClass_18_11_2024;


// Accessing class using different techniques

public class Learn extends Student{
	public static void main(String[] args) {
		
		// We can not use this because it is not a static methods or first we should create object for that 
		// Thats what we done in next line.
		//System.out.println(Student.getFirstName());
		
		//1. By creating object
			//We use this when we need to create multiple copies of that same class, we can also use interface.
		Student sd = new Student();
		System.out.println(sd.getFirstName());
		
		//It still printed but i guess it is valid.
		//Any way if you write this or System.out.println(Student.CollegeName); it will goes to same address.

		System.out.println(sd.getCollegeName());
		
		//2. By creating static variable
		//This is the static variable, There is only one copy of it and we can direct access from the class.
		// Here we dose not need to create object for static variable.
		System.out.println(Student.CollegeName);
		
		//3. By inheritances
		//It like using the class like it is present here.
		System.out.println(CollegeName);
		
	}
	
	// We can also create methods while using inheritance
	public void Name() {
		System.out.println(FirstName);
		System.out.println(LastName);
	}
}
