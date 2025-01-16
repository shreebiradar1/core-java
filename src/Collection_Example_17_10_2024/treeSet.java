package Collection_Example_17_10_2024;
import java.util.TreeSet;
public class treeSet {
	public static void main(String[] args) {
		TreeSet<String>al = new TreeSet();
		
		al.add("Shree");
		al.add("Shree");
		al.add("krish");
		al.add("Vaibhav");
		al.add("Shree");
		al.add("Akash");
		al.add("Sujal");
		al.add("Jayesh");
		al.add("Ravi");
		
		for(String name : al) {
			System.out.println(name);
		}
	}
}
