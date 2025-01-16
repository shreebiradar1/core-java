package Ecommerce_with_database_11_11_2024;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserMan {
	public static void userMan() throws IOException {
		ArrayList<User>userList = new ArrayList<>();
		String path ="D:\\Programming\\java\\W26\\Day_17\\src\\Ecommerce_with_database_11_11_2024\\Userdata.csv";
		FileReader fileRead = new FileReader(path);
		BufferedReader bfRead = new BufferedReader(fileRead);
		
		String line = "";
		while((line= bfRead.readLine()) != null) {
			String value[] = line.split(",");
			User readUser = new User();
			
			readUser.name = value[0];
			readUser.Email = value[1];
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
			
			switch(check) {
			case 1 :
				User user = new User();
				System.out.println("Enter Username : ");
				user.name =sc.next();
				
				System.out.println("Enter UserMail : ");
				user.Email = sc.next();
				
				userList.add(user);
				System.out.println("\tUser Added Sucessfully");
				break;
				
			case 2 :
				System.out.println("\tSearching User\n");
				System.out.println("Enter Username : ");
				String Search = sc.next();
				
				boolean found = false;
				for(User data : userList) {
					if(data.name.contains(Search)) {
						System.out.println("\t----- User Exist -----\n");
						found = true;
					}
				}
				if(!found) {
					System.out.println("\nUser not Exist...");
				}
				break;
				
			case 3 :
				System.out.println("\tRemoving User\n");
				System.out.println("Enter Username : ");
				String remove = sc.next();
				
				for(int i = 0;i<userList.size();i++) {
					if(userList.get(i).name.equals(remove)) {
						userList.remove(i);
						System.out.println("\tUser Removed Sucessfully");
					}
				}
				break;
				
			case 4 :
				System.out.println("\tDisplaying User Details\n");
				for(User data : userList) {
					System.out.println("Username : "+data.name);
					System.out.println("UserMail : "+data.Email + "\n");
					
				}
				break;
				
			case 5 :
				FileWriter fileWriter = new FileWriter(path,false);
				BufferedWriter bfWriter = new BufferedWriter(fileWriter);
				
				for(User value : userList) {
					bfWriter.write(value.name + "," + value.Email + "\n");
				}
				bfWriter.close();
				
				System.out.println("\n\t\tExiting User Management...\n");
				return;
				
			default :
				System.out.println("\tInvalid option...\n");
			}
		}
	}
}
