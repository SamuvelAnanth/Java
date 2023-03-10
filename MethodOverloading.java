import java.util.*;
class MethodOverloading{
	public void m1(int a, int b){
		System.out.println(a + b);
	}
	public void m1(int c, String d){
		System.out.println(c+ " " +d);
	}
	public void m1(int c, int a,int b){
		System.out.println(c+a+b);
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String Value : ");
		String g = sc.nextLine();
		System.out.print("Enter Value : ");
		int a = sc.nextInt();
		System.out.print("Enter Value : ");
		int b = sc.nextInt();
		System.out.print("Enter Value : ");
		int c = sc.nextInt();
		System.out.print("Enter Value : ");
		int d = sc.nextInt();
		System.out.print("Enter Value : ");
		int e = sc.nextInt();
		System.out.print("Enter Value : ");
		int f = sc.nextInt();
		MethodOverloading obj=new MethodOverloading();
		obj.m1(a, b);
		obj.m1(c, g);
		obj.m1(d, e, f);
	}
}
