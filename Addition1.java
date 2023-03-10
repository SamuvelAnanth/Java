import java.util.*;
class MainAddition{
	int firstValue,secondValue,thirdValue;
	void insertRecord(int a,int b,int c){
		firstValue=a;
		secondValue=b;
		thirdValue=c;
	}
}
class Addition1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		MainAddition s1=new MainAddition();		
		System.out.print("Enter the First Value : ");
		s1.firstValue=sc.nextInt();
		System.out.print("Enter the Second Value : ");
		s1.secondValue=sc.nextInt();
		s1.thirdValue=s1.firstValue+s1.secondValue;
		System.out.println(s1.thirdValue);
	}
}
