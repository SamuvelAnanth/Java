interface Drawable{
	void draw();
}
class Rectangle implements Drawable{
	public void draw(){
		System.out.println("Drawing Rectangle");
	}
}
class Circle implements Drawable{
	public void draw(){
		System.out.println("Drawing Circle");
	}
}
class TestInterface1{
	public static void main(String[] args){
		Drawable dr = new Circle();
		dr.draw();
	}
}
