class A extends Thread{
	public void run(){
		int a=15,b=10;
		System.out.println("Thread A Addition "+(a+b));
	}
}
class B extends Thread{
	public void run(){
		int a=15,b=10;
		System.out.println("Thread B Subtraction "+(a-b));
	}
}
class C extends Thread{
	public void run(){
		int a=15,b=10;
		System.out.println("Thread C Multiplication "+(a*b));
	}
}
class D extends Thread{
	public void run(){
		int a=15,b=10;
		System.out.println("Thread D Division "+(a/b));
	}
}
class ThreadPriority{
	public static void main(String[] args){
		A a1 = new A();
		B b1 = new B();
		C c1 = new C();
		D d1 = new D();
		c1.setPriority(Thread.MAX_PRIORITY);
		b1.setPriority(a1.getPriority()+1);
		a1.setPriority(Thread.MIN_PRIORITY);
		d1.start();
		c1.start();
		b1.start();
		a1.start();
	}
}
