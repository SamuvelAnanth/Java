import java.io.*;
public class fileStreamTest{
	public static void main(String args[]){
		try{
 			byte bWrite [] = {11,21,3,40,5};
 			OutputStream os = new FileOutputStream("test.txt");		//type casting to create new file(only if not available)
 			for(int x=0; x < bWrite.length ; x++){				//looping for 5 times which is declared in bWrite(for ex:0-4 = 5 times)
 				os.write( bWrite[x] ); // writes the bytes		//stored that value in (os)
 		}
 		os.close();								//closed os object
			InputStream is = new FileInputStream("test.txt");		//create a object is in file using type casting
 			int size = is.available();					//Gives the number of bytes that can be read from this file input stream
 			for(int i=0; i< size; i++){					//loop was running which means howmuch times stored in size
 				System.out.print((char)is.read() + " ");		//print character by character which data was read
 			}
 		is.close();								//closed is object
 		}catch(IOException e){
 		System.out.print("Exception");
 		}
 	}
} 