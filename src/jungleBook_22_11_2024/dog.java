package jungleBook_22_11_2024;

public class dog extends Animal{
	String breed;
	//overloading
	public void run() {
		System.out.println(name+"is running\n");
	}
	//overloading	
	public void run(String alias) {
		System.out.println(alias + " " + name + "is running\n");

	}
	//overloading
	public void run(String alias,int hours) {
		System.out.println(alias + " " + name + " is running since "+ hours+"\n");
	}
	
	public void  bark() {
		System.out.println(name+" is barking"+"\n");
		
	}
	}
