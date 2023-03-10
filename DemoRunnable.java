class Batch13 implements Runnable{
	public void run(){
        System.out.println("Thread Batch13 "+(a*b));
	}
}
class DemoRunnable{
	public static void main(String[] args) {
        	Batch13 b = new Batch13();
        	Thread thread = new Thread(b);
        	b.start();
	}
}
