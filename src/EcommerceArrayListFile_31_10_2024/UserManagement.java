package EcommerceArrayListFile_31_10_2024;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class UserManagement {
	public static void userMan() throws Exception {
		ArrayList<User> userList = new ArrayList<>();
		String path = "D:\\Programming\\java\\W26\\Day_16\\src\\EcommerceArrayListFile_31_10_2024\\UserData.csv";
		FileReader fileRead = new FileReader(path);
		BufferedReader bfReader = new BufferedReader(fileRead);
		
		String line = "";
		while((line = bfReader.readLine()) != null) {
			String value[] = line.split(",");
			User readUser = new User();
			
			readUser.userName = value[0];
			readUser.userMail = value[1];
			userList.add(readUser);
		}
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t\tWelcome to User Management\n");
		
		while(true) {
			System.out.println("1.Add User");
			System.out.println("2.Search User");
			System.out.println("3.Remove User");
			System.out.println("4.Display User");
			System.out.println("5.Exit\n");
			int check = sc.nextInt();
			
			if(check == 1) {
				User user = new User();
				System.out.println("Enter Username : ");
				user.userName =sc.next();
				
				System.out.println("Enter UserMail : ");
				user.userMail = sc.next();
				
				userList.add(user);
				System.out.println("\tUser Added Sucessfully");
				
			}
			else if(check == 2) {
				System.out.println("\tSearching User\n");
				System.out.println("Enter Username : ");
				String Search = sc.next();
				
				boolean found = false;
				for(User data : userList) {
					if(data.userName.contains(Search)) {
						System.out.println("\t----- User Exist -----\n");
						found = true;
					}
				}
				if(!found) {
					System.out.println("\nUser not Exist...");
				}
			}
			else if(check == 3) {
				System.out.println("\tRemoving User\n");
				System.out.println("Enter Username : ");
				String remove = sc.next();
				
				for(int i = 0;i<userList.size();i++) {
					if(userList.get(i).userName.equals(remove)) {
						userList.remove(i);
						System.out.println("\tUser Removed Sucessfully");
					}
				}
			}
			else if(check == 4) {
				System.out.println("\tDisplaying User Details\n");
				for(User data : userList) {
					System.out.println("Username : "+data.userName);
					System.out.println("UserMail : "+data.userMail + "\n");
					
				}
			}
			else if(check == 5) {
				FileWriter fileWriter = new FileWriter(path,false);
				BufferedWriter bfWriter = new BufferedWriter(fileWriter);
				
				for(User value : userList) {
					bfWriter.write(value.userName + "," + value.userMail + "\n");
				}
				bfWriter.close();
				
				System.out.println("\n\t\tExiting User Management...\n");
				return;
			}
		}
	}
}
