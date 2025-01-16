package Binomal_return_19_09_2024;

public class return_binomial {
	public static void main(String[] args) {
		int exp1 = sum1(2,2);
		System.out.println(exp1);
		
		int exp2= sum2(2,2);
		System.out.println(exp2);
		
		int exp3= sum3(2,2);
		System.out.println(exp3);
		
		int exp4= sum4(2,2);
		System.out.println(exp4);
		
		int exp5 = sum5(2,2);
		System.out.println(exp5);
		
		
	}
	public static int sum1(int a , int b) {
		int m = a + b;
		return m;
	}
	public static int sum2(int a, int b) {
		int n = (a * a) + (2 * a * b) + (b*b);
		return n;
	}
	public static int sum3(int a, int b) {
		int o = (a * a * a) + (3 * a * a * b) + (b * b * b);
		return o;
	}
	public static int sum4(int a, int b) {
		int p = (a*a*a*a) + (4*a*a*a*b) + (6*a*a*b*b) + (4*a*b*b*b) + (b*b*b*b);
		return p;
	}
	public static int sum5(int a, int b) {
		int q = (a*a*a*a*a)+(5*a*a*a*a*b)+(10*a*a*a*b*b*b)+(5*a*b*b*b*b)+(b*b*b*b*b);
		return q;
	}
}
