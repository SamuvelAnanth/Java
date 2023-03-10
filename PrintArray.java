import java.util.*;
public class PrintArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of Table : ");
		int table=sc.nextInt();		
		System.out.print("Enter the Number of Rows : ");
		int row=sc.nextInt();
		System.out.print("Enter the Number of Columns : ");
		int column=sc.nextInt();
		int array[][][]=new int[table][row][column];
		System.out.println("Enter the Numbers for Printing in Array Format\n");
		for(int k=0; k<table; k++){
			for(int i=0; i<row; i++){
				for(int j=0; j<column;j++){
					System.out.print("Enter the Value for ["+k+"]["+i+ "]["+j+"] : ");
					array[k][i][j]=sc.nextInt();
				}
			}
		System.out.println();
		}
		System.out.println("");
		for(int k=0; k<table; k++){
			for(int i=0; i<row; i++){
				for(int j=0; j<column;j++){
					System.out.print(array[k][i][j] + "  ");						
				}
			System.out.println();
			}
			System.out.println();
			System.out.println();
		}
	}
}