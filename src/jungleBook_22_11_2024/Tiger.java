package jungleBook_22_11_2024;

public class Tiger extends Animal{
	public void hunting() {
		System.out.println(name+" is Hunting");
	}
	
	@Override
	public void drink() {
		System.out.println(name+" is Lapping");
	}
	
}
