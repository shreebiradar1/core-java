package Collection_Example_17_10_2024;
import java.util.LinkedHashSet;
public class linkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<String>al = new LinkedHashSet();
		
		al.add("Shree");
		al.add("Shree");
		al.add("krish");
		al.add("Vaibhav");
		al.add("Akash");
		al.add("Shree");
		al.add("Sujal");
		al.add("Jayesh");
		al.add("Ravi");
		
		for(String name : al) {
			System.out.println(name);
		}
	}
}
