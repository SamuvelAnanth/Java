import java.io.*;​

public class ExceptionExample{ ​

	public static void main(String[] args) throws Exception​{ ​


		int numeric;​

		try { ​
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));​
			System.out.print("Enter Your Name:");​
			numeric = Integer.parseInt(br.readLine()); ​

		}​catch(Exception ex){ ​

			System.out.println("You are entered"+" "+ex.printStackTrace()+" " + "Catch the Exception:Non numeric value.");​
	 ​
		}​
	}​
}