package Binomial_06_09_2024;

public class By_functions {
	public static void main(String[] args) {
		quardatic_1(3,2);
		quardatic_2(3,2);
		quardatic_3(3,2);
		quardatic_4(3,2);
		quardatic_5(3,2);
	}
	
	public static void quardatic_1(int a , int b) {
		int c = a+b;
		System.out.println("Quardatic_1 output : "+c);
	}
	public static void quardatic_2(int a , int b) {
		int c = (a*a)+2*(a*b)+(b*b);
		System.out.println("Quardatic_2 output : "+c);
	}
	public static void quardatic_3(int a , int b) {
		int c = (a*a*a) + 3*(a*a*b) + 3*(a*b*b) + (b*b*b);
		System.out.println("Quardatic_3 output : "+c);
	}
	public static void quardatic_4(int a , int b) {
		int c = (a*a*a*a) + 4*(a*a*a*b) + 6*(a*a*b*b) + 4*(a*b*b*b)  + (b*b*b*b);
		System.out.println("Quardatic_4 output : "+c);
	}
	public static void quardatic_5(int a , int b) {
		int c = (a*a*a*a*a) + 5*(a*a*a*a*b) + 10*(a*a*a*b*b) + 10*(a*a*b*b*b)  + 5*(a*b*b*b*b) +  (b*b*b*b*b);
		System.out.println("Quardatic_5 output : "+c);
	}

}
