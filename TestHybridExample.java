class Human{
	public void showHuman(){
		System.out.println("Human Class");
	}
}
interface father{
	public void show();
}
interface mother{
	public void show();
}
class Child extends Human implements mother,father{
	public void show(){
		System.out.println("Invoking show Method");
	}
	public void showChild(){
		System.out.println("Invoking showChild() Method");
	}
}
public class TestHybridExample{
	public static void main(String[] args){
		Child c = new Child();
		c.showHuman();
		c.showChild();
	}
}
