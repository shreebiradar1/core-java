package AccessingDataFromOtherClass_18_11_2024;

public class Student {
		String FirstName = "Shree" ;
		String LastName = "Biradar";
		static String CollegeName;
		
		public String getFirstName() {
			return FirstName;
		}
		
		public String getLastName() {
			return LastName;
		}
		public String getCollegeName(){
			return CollegeName;
		}
}
