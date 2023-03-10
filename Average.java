import java.util.*;
public class Average{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t\tAverage of 5 Numbers");
		System.out.println("\t\t\t********************");
		int sum=0;
		for(int i=1; i<=5;i++){
			System.out.print("Enter "+i+" Number to Add 5 Numbers : ");
			int a=sc.nextInt();
			sum=sum+a;
		}
		int average=sum/5;
		System.out.println("Sum of 5 Numbers are "+sum);		
		System.out.println("Average of 5 Numbers are "+average);
	}
}