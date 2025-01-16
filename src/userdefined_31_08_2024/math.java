package userdefined_31_08_2024;

public class math {
	public static void main(String[] args) {
		add(6,2);
		sub(6,2);
		multi(6,2);
		div(6,2);
	}
	public static void add(int a, int b) {
		int c = a+b;
		System.out.println("Addition : "+c);
	}
	public static void sub(int a, int b) {
		int c = a-b;
		System.out.println("Subtraction : "+c);
	}
	public static void multi(int a , int b) {
		int c = a*b;
		System.out.println("Multipication : "+c);
	}
	public static void div(int a , int b) {
		int c = a/b;
		System.out.println("Division : "+c);
	}
}
