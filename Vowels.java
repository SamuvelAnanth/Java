import java.util.*;
public class Vowels{
		   public static void main(String[] args){
							Scanner sc=new Scanner(System.in);
							System.out.print("Enter 1 Character : ");
							char a = sc.next().charAt(0);
							if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
													System.out.println(a+" is Vowel");
												     }else{
													System.out.println(a+" is Consonant");
													  }
							}
		   }