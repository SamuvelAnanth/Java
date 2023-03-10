class Table{
	synchronized void printTable(int n){
		for(int i=1;i<=5;i++){
			System.out.println(i*n);
		}
		try{
			Thread.sleep(4000);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
class A extends Thread{
	Table t;
	A(Table t){
		this.t=t;
	}
	public void run(){
		t.printTable(6);
	}
}
class B extends Thread{
	Table t;
	B(Table t){
		this.t=t;
	}
	public void run(){
		t.printTable(8);
	}
}
class SyncExample{
	public static void main(String[] args){
		Table t1 = new Table();
		A obj1 = new A(t1);
		B obj2 = new B(t1);
		obj1.start();
		obj2.start();
	}
}
