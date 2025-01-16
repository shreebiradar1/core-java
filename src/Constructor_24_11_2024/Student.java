package Constructor_24_11_2024;

public class Student {
	public String FirstName;
	public String LastName;
	public String Mobile;
	public int Mainage;
	
	//Default constructor
	//Called by compiler 
	
	//No argument Constructor
	public Student() {
		FirstName = "Shree";
		LastName = "Biradar";
	}
	
	//Parameterized constructor
	public Student(String Name,int age) {
		FirstName = Name;
		Mainage = age;
	}
}
