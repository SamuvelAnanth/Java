import java.util.*;
public class SampleIfelse{
		public static void main(String[] args){
							Scanner student = new Scanner(System.in);
							System.out.print("Enter Student Mark : ");
							int mark=student.nextInt();
							if (mark<35){
									System.out.println("Student Grade is C");
								     } else if(mark>=35&&mark<60){
									System.out.println("Student Grade is B");
										}
							else if(mark>=60&&mark<85){
									System.out.println("Student Grade is A");
										}
							else if(mark>=85&&mark<=100){
									System.out.println("Student Grade is A+");
										}
							else{
								System.out.println("Please Enter Valid Mark");
							}
				}		
}
		