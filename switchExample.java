import java.util.*;
public class switchExample{
		public static void main(String[] args){
					Scanner week = new Scanner(System.in);
					System.out.print("Enter the Number : ");
					int day = week.nextInt();
						switch(day){
							case 1:
								System.out.println("The Day is Sunday");
								break;
							case 2:
								System.out.println("The Day is Monday");
								break;
							case 3:
								System.out.println("The Day is Tuesday");
								break;
							case 4:
								System.out.println("The Day is Wednesday");
								break;
							case 5:
								System.out.println("The Day is Thursday");
								break;
							case 6:
								System.out.println("The Day is Friday");
								break;
							case 7:
								System.out.println("The Day is Saturday");
								break;
							default:
								System.out.println("You are trying to Access Invalid Day");

							   }
						      }
			  }