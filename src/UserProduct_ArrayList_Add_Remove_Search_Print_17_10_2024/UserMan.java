package UserProduct_ArrayList_Add_Remove_Search_Print_17_10_2024;
import java.util.Scanner;
import java.util.ArrayList;
public class UserMan {
	public static void userMan() {
		System.out.println("\t\tWelcome to User Management\n");
		ArrayList<User>userList = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("What you want to do in User Management\n");
			System.out.println("1. Add User");
			System.out.println("2. Search User");
			System.out.println("3. Remove User");
			System.out.println("4. Display User");
			System.out.println("5. Exit");
			
			int check = sc.nextInt();
			
			if(check == 1) {
				User user = new User();
				System.out.println("Adding User\n");
				
				System.out.println("Enter User Id : ");
				user.userId = sc.nextInt();
				
				System.out.println("Enter User name : ");
				user.name = sc.next();
				
				System.out.println("Enter User email : ");
				user.Email = sc.next();
				
				System.out.println("Enter Password : ");
				user.Pass = sc.next();
				
				userList.add(user);
			} else if(check == 2) {
				System.out.println("Enter Username to Search : ");
				String Search = sc.next();
				
				for(User data : userList) {
					if(data.name.contains(Search)) {
						System.out.println("User Id : "+data.userId);
						System.out.println("Username : "+data.name);
						System.out.println("User Email : "+data.Email);
						System.out.println("                      ");
					} else {
						System.out.println("User not found.....");
					}
				}
			} else if(check == 3) {
				System.out.println("Enter UserName to Remove : ");
				String remove = sc.next();
				
				for(int i = 0;i<userList.size();i++) {
					if(userList.get(i).name.equals(remove)) {
						userList.remove(i);
						System.out.println("User remove Successfully...\n");
					}
				}
			} else if(check == 4) {
				System.out.println("\tDisplaying User \n");
					for(User data : userList) {
						System.out.println("User Id : "+data.userId);
						System.out.println("Username : "+data.name);
						System.out.println("User Email : "+data.Email);
					}
			} else if(check == 5) {
				System.out.println("\nExiting User Management...");
			}
		}
	}
}
