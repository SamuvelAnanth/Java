class A extends Thread{
	public void run(){
		int a=15,b=10;
		System.out.println("Thread A - Addition "+(a+b));
	}
}
class B extends Thread{
	public void run(){
		int a=15,b=10;
		System.out.println("Thread B - Subtraction "+(a-b));
	}
}
class C extends Thread{
	public void run(){
		int a=15,b=10;
		System.out.println("Thread C - Multiplication "+(a*b));
	}
}
class D extends Thread{
	public void run(){
		int a=15,b=10;
		System.out.println("Thread D - Division "+(a/b));
	}
}
class MultiThread{
	public static void main(String[] main){
		A a1 = new A();
 		B b1 = new B();
    		C c1 = new C();
    		D d1 = new D();
		a1.start();
    		b1.start();
    		c1.start();
    		d1.start();
	}
}