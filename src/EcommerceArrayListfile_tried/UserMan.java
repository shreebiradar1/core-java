package EcommerceArrayListfile_tried;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.nio.file.FileSystemNotFoundException;

public class UserMan {
	public static void userMan() throws Exception {
		System.out.println("\t\tWelcome UserManagement\n");
		Scanner sc = new Scanner(System.in);
		ArrayList<User>userList = new ArrayList();
		//Created another ArrayList to taking data from the file
		//Taking file data to this ArrayList
		ArrayList<String[]>filedata = new ArrayList();
		
		String path ="D:\\Programming\\java\\W26\\Day_16\\src\\EcommerceArrayListfile\\UserData.csv"; 
		FileReader fileread = new FileReader(path);
		BufferedReader bfread = new BufferedReader(fileread);
		
		//File data Storing in filedata ArrayList
		String line = "";
		while((line = bfread.readLine()) != null) {
			String row[] = line.split(",");
			
			filedata.add(row);
		}
		
		
		while(true) {
			System.out.println("\n1.Add User");
			System.out.println("2.Search User");
			System.out.println("3.Remove User");
			System.out.println("4.Display User");
			System.out.println("5.Exit");
			
			int check= sc.nextInt();
			
			if(check == 1) {
				System.out.println("\nAdding User..");
				User user = new User();
				
				System.out.println("Enter User Id : ");
				user.UserId = sc.nextInt();
				
				System.out.println("Enter Username : ");
				user.Username = sc.next();
				
				System.out.println("Enter Email : ");
				user.mail = sc.next();
				
				userList.add(user);
				System.out.println("User Added Successfully in ArrayList..");
				FileWriter filewrite = new FileWriter(path,true);
				BufferedWriter bfwrite = new BufferedWriter(filewrite);
				
				for(User data : userList) {
					bfwrite.write(data.UserId +","+data.Username + ","+ data.mail + "\n");
				}
				bfwrite.close();
				System.out.println("User Added Successfully in File");
				
			} 
			else if(check == 2) {
				System.out.println("\nSearching User");
				
				System.out.println("Enter Username to Search : ");
				String Search = sc.next();
				
					for(String[] data : filedata) {
						for(String value : data) {
							if(value.contains(Search)) {
								System.out.println("User Found.....!");
							}
						}
					}
				}
				
			else if(check == 3) {
				System.out.println("\n\tRemoving User");
				System.out.println("Enter Username for Remove : ");
				String remove = sc.next();
				
				for(int i = 0;i<filedata.size();i++) {
					if(userList.get(i).Username.equals(remove)) {
						userList.remove(i);
						System.out.println("\tUser Remove Successfully..");
					}
				}
			}
			else if(check == 4) {
				System.out.println("\tDisplaying User Details ");
				for(String[] data : filedata) {
					for(String element : data) {
						System.out.println(element);
					}
				}
				
			}
			else if(check == 5) {
				
				System.out.println("\nExiting User Management...");
				return;
			}
		}
	}
}
