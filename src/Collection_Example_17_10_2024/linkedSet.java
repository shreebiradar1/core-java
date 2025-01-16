package Collection_Example_17_10_2024;
import java.util.LinkedList;
public class linkedSet {
	public static void main(String[] args) {
		LinkedList<String>al = new LinkedList();
		
		al.add("Shree");
		al.add("Shree");
		al.add("krish");
		al.add("Vaibhav");
		al.add("Akash");
		al.add("Sujal");
		al.add("Jayesh");
		al.add("Shree");
		al.add("Ravi");
		
		for(String name : al) {
			System.out.println(name);
		}
	}
}
