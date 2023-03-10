import java.io.*;
public class BRReadLines{
			public static void main(String[] args) throws IOException{
								BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
								String str;
								System.out.println("Enter lines of text.");
								System.out.println("Enter 'end' to Quit.");
								do {
									str = br.readLine();
									System.out.println(str);
								} while(!str.contains("end"));
							      }
			}