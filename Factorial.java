import java.util.*;
public class Factorial{
		       public static void main(String[] args){
							     Scanner sc = new Scanner(System.in);
							     System.out.print("Enter the Number : ");
							     int a=sc.nextInt();
							     int fact=1;
							     for(int i=1;i<=a;++i){
										  fact=fact*i;
										  }
							     System.out.println("The Factorial number of "+a+" is "+fact);
							     }
		      }