package Collection_Example_17_10_2024;
import java.util.HashSet;
public class hashSet {
	public static void main(String[] args) {
		HashSet<String>al = new HashSet();
		
		al.add("Shree");
		al.add("Shree");
		al.add("Shree");
		al.add("krish");
		al.add("Vaibhav");
		al.add("Akash");
		al.add("Sujal");
		al.add("Jayesh");
		al.add("Ravi");
		
		for(String name : al) {
			System.out.println(name);
		}
	}
}
