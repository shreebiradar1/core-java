package E_Commerce_27_09_2024;
import java.util.Scanner;
public class User {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username : ");
		String Username = sc.next();
		
		System.out.println("Enter password : ");
		String Password = sc.next();
		
		System.out.println("Enter confirm password : ");
		String conPass = sc.next();
		
		if(Username.equals("Shree")) {
			if(Password.equals(conPass)) {
				System.out.println("Login successfull....");
				return;
			}
		}
		System.out.println("Login fail.....");
	}
}
