package Scanner_19_09_2024;
import java.util.Scanner;
public class input_function {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First number : ");
		int firstNum = sc.nextInt();
		
		System.out.println("Enter Second number : ");
		int SecondNum = sc.nextInt();
		
		int result = firstExpression(firstNum,SecondNum);
		System.out.println("Result is : "+result);
	}
	
	public static int firstExpression(int a, int b) {
		int result = a*a+2*a*b+b*b;
		return result;
	}
}
