package Concept_of_Class_16_09_2024_5;

public class Result {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		dog1.name = "Tommy";
		dog1.Breed ="German shepard";
		dog1.colour ="Brown";
		dog1.Gender = "Male";
		dog1.height = 3.9;
		
		dog2.name = "Ghost";
		dog2.Breed ="Pit Bull";
		dog2.colour ="white";
		dog2.Gender = "Female";
		dog2.height = 4.3;
		
		System.out.println("First Dog name is "+dog1.name);
		System.out.println("First Dog breed is "+dog1.Breed);
		System.out.println("First Dog colour is "+dog1.colour);
		System.out.println("First Dog gender is "+dog1.Gender);
		System.out.println("First Dog height is "+dog1.height);
		System.out.println("                                 ");
		System.out.println("Second Dog name is "+dog2.name);
		System.out.println("Second Dog breed is "+dog2.Breed);
		System.out.println("Second Dog colour is "+dog2.colour);
		System.out.println("Second Dog gender is "+dog1.Gender);
		System.out.println("Second Dog height is "+dog2.height);
		
		
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		
		cat1.name = "Eva";
		cat1.Breed ="Persian cat";
		cat1.colour ="Maroon";
		cat1.Gender ="Male";
		cat1.height = 2.6;
		
		cat2.name = "Gray";
		cat2.Breed ="Bombay cat";
		cat2.colour ="Black";
		cat2.Gender = "Female";
		cat2.height = 2.3;
		
		System.out.println("-----------------------------------------------");
		System.out.println("First Cat name is "+cat1.name);
		System.out.println("First Cat breed is "+cat1.Breed);
		System.out.println("First Cat colour is "+cat1.colour);
		System.out.println("First Cat gender is "+cat1.Gender);
		System.out.println("First Cat height is "+cat1.height);
		System.out.println("                                 ");
		System.out.println("Second Cat name is "+cat2.name);
		System.out.println("Second Cat breed is "+cat2.Breed);
		System.out.println("Second Cat colour is "+cat2.colour);
		System.out.println("Second Cat gender is "+cat2.Gender);
		System.out.println("Second Cat height is "+cat2.height);
		
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.name = "BMW";
		car1.year = 1976;
		car1.colour = "Black";
		car1.type = "Diesel";
		
		car2.name = "Porsche";
		car2.year = 1948;
		car2.colour = "Black";
		car2.type = "Diesel";
		
		System.out.println("-----------------------------------------------");
		System.out.println("First car name is "+car1.name);
		System.out.println("First car manufacturing year is "+car1.year);
		System.out.println("First car colour is "+car1.colour);
		System.out.println("First car type is "+car1.type);
		System.out.println("                                               ");
		System.out.println("Second car name is "+car2.name);
		System.out.println("Second car manufacturing year is "+car2.year);
		System.out.println("Second car colour is "+car2.colour);
		System.out.println("Second car type is "+car2.type);
		
		Account acc1 = new Account();
		Account acc2 = new Account();
		
		acc1.Bankname = "Axis bank";
		acc1.ownername = "Shreeyesh biradar";
		acc1.balance = 8763;
		acc1.type = "Saving account";
		acc1.branchaddress = "kalyan";
		
		acc2.Bankname = "SBI";
		acc2.ownername = "Digant Vyahalkar";
		acc2.balance = 17349;
		acc2.type = "Current account";
		acc2.branchaddress = "latur";
		
		System.out.println("--------------------------------------------------");
		System.out.println("Bank name is "+acc1.Bankname);
		System.out.println("Account holder name is "+acc1.ownername);
		System.out.println("Current balance is "+acc1.balance);
		System.out.println("Account type is "+acc1.type);
		System.out.println("Bank branch address is "+acc1.branchaddress);
		System.out.println("                                                   ");
		System.out.println("Bank name is "+acc2.Bankname);
		System.out.println("Account holder name is "+acc2.ownername);
		System.out.println("Current balance is "+acc2.balance);
		System.out.println("Account type is "+acc2.type);
		System.out.println("Bank branch address is "+acc2.branchaddress);
		
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.name = "Shree biradar";
		student1.age = 19;
		student1.branch = "Computer";
		student1.year = "Second year";
		student1.number = "8291975766";
		
		student2.name = "Digant Vyahalkar";
		student2.age = 21;
		student2.branch = "Computer";
		student2.year = "Fourth year";
		student2.number = "8975893672";
		
		System.out.println("--------------------------------------------------");
		System.out.println("First student name is "+student1.name);
		System.out.println("First student age is "+student1.age);
		System.out.println("First student branch is "+student1.branch);
		System.out.println("First student year is "+student1.year);
		System.out.println("First student number is "+student1.number);
		System.out.println("                                                      ");
		System.out.println("second student name is "+student2.name);
		System.out.println("second student age is "+student2.age);
		System.out.println("second student branch is "+student2.branch);
		System.out.println("second student year is "+student2.year);
		System.out.println("second student number is "+student2.number);
		
		ClassRoom computer = new ClassRoom();
		ClassRoom civil = new ClassRoom();
		
		computer.numStudent = 70;
		computer.numTeacher = 5;
		computer.subject = "OOPs";
		
		civil.numStudent = 40;
		civil.numTeacher = 4;
		civil.subject = "Building materials";
		
		System.out.println("--------------------------------------------------");
		System.out.println("Number of student in Computer class is "+computer.numStudent);
		System.out.println("Number of teacher in Computer class is "+computer.numTeacher);
		System.out.println("Number of subject in Computer class is "+computer.subject);
		System.out.println("                                                   ");
		System.out.println("Number of student in Civil class is "+civil.numStudent);
		System.out.println("Number of teacher in Civil class is "+civil.numTeacher);
		System.out.println("Number of subject in Civil class is "+civil.subject);
		
		Product prod1 = new Product();
		Product prod2 = new Product();
		
		prod1.name = "Laptop";
		prod1.price = 79000;
		prod1.type = "Electronics";
		prod1.quantity = 60;
		
		prod2.name = "Maggi";
		prod2.price = 14;
		prod2.type = "Groceries";
		prod2.quantity = 100;
		
		System.out.println("--------------------------------------------------");
		System.out.println("Name of the first product "+prod1.name);
		System.out.println("Price of the first product "+prod1.price);
		System.out.println("Type of the first product "+prod1.type);
		System.out.println("Quantity of the first product "+prod1.quantity);
		System.out.println("                                                   ");
		System.out.println("Name of the second product "+prod2.name);
		System.out.println("Price of the second product "+prod2.price);
		System.out.println("Type of the second product "+prod2.type);
		System.out.println("Quantity of the second product "+prod2.quantity);
		
	}
}
