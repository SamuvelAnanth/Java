import java.util.Arrays;
class MultiplicationTable extends Thread{
	public void run(){
		for(int i=1; i<=10;i++){
			System.out.println(i*3);
		}
	}
}
class FibonacciSeries extends Thread{
	public void run(){
		int c=10;
		int a=0,b=1,d;
		System.out.println(a);
		System.out.println(b);
		for(int j=2;j<c;j++){
			d=a+b;
			System.out.println(d);
			a=b;
			b=d;
		}
	}
}
class FactorialNumber extends Thread{
	public void run(){
		int a=10;
		int fact=1;
		for(int i=1;i<=a;++i){
			fact=fact*i;
		}
		System.out.println("The Factorial number of "+a+" is "+fact);
	}
}
class SumOfArrays extends Thread{
	public void run(){
		int myArray[] = {45, 12, 55, 78, 445};
      		int sum = 0;
      		System.out.println("Enter the elements of the array one by one ");
		for(int i=0; i<=4; i++){
         		sum = sum + myArray[i];
      		}
      		System.out.println("Elements of the array are: "+Arrays.toString(myArray));
      		System.out.println("Sum of the elements of the array ::"+sum);
	}
}
class ExampleMultithreading{
	public static void main(String[] args){
		MultiplicationTable mul = new MultiplicationTable();
		FibonacciSeries fib = new FibonacciSeries();
		FactorialNumber fac = new FactorialNumber();
		SumOfArrays sum = new SumOfArrays();
		mul.start();
		fib.start();
		fac.start();
		sum.start();
	}
}