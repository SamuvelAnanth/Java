import java.io.*;
public class Test{
			public static void main(String[] args)throws IOException{
								DataInputStream d = new DataInputStream(new FileInputStream("C:\\Users\\samuv\\OneDrive\\Documents\\test.txt"));
								DataOutputStream out = new DataOutputStream(new FileOutputStream("C:\\Users\\samuv\\OneDrive\\Documents\\test1.txt"));
								String count;
								while((count = d.readline())!=null){
									String u = count.toUpperCase();
									System.out.println(u);
									out.writeBytes(u + " ,");
								}
								d.close();
								out.close();
							    }
		       }