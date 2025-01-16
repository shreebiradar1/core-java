package jungleBook_22_11_2024;

public class JunMain {
	public static void main(String[] args) {

		// Dog

		dog tommy = new dog();
		tommy.name = "Tommy";
		System.out.println("Name of the Tiger : " + tommy.name);

		tommy.bark();

		// overloading

		tommy.run();
		tommy.run("Mr");
		tommy.run("Mr", 2);

		// Tiger

		Tiger bagira = new Tiger();
		bagira.name = "bagira";

		System.out.println("Name of the Tiger : " + bagira.name);
		// Overriding
		bagira.drink();

		// Bear

		Bear bhalu = new Bear();
		bhalu.name = "Bhalu";
		System.out.println("Name of the Tiger : " + bhalu.name);

		bhalu.hunting();

		// Crocodile
		Crocodile croko = new Crocodile();
		croko.name = "Crocko";

		croko.hunting();

		// Inherit from Animal class
		croko.eat();

		// Human
		Human shree = new Human();
		shree.name = "Shree";
		shree.thinking();
		shree.talk();

		// Monkey

		Monkey monk = new Monkey();
		monk.name = "Monk";
		monk.run();
		monk.jumb();

		// Snake

		snake saap = new snake();
		saap.name = "Saap";
		saap.drink();

		// Override
		saap.run();
	}
}
