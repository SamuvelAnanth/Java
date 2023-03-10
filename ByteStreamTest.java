import java.io.*;
public class ByteStreamTest{
			public static void main(String[] args)throws IOException{
								ByteArrayOutputStream bOutput = new ByteArrayOutputStream(12);  //declared maximum length for the user input 
								while(bOutput.size()!=10){					//setting boundary value for howmany times loop was working
									bOutput.write(System.in.read());			//print the data which is in bOutput
								}
							byte b [] = bOutput.toByteArray();					//store the byte value in the variable b
							System.out.println("Print the Content");				//print the content for user reference
							for(int x=0;x<b.length;x++){						//setting value for howmany times loop was working
							System.out.print((char)b[x] + "  ");					//print the input letter by letter which is stored in b[x]
								}
							System.out.println("  ");
							int c;									//declare a variable for storing data in integer format
							ByteArrayInputStream bInput = new ByteArrayInputStream(b);		//create a new object bInput and passing the parameter b
							System.out.println("Converting characters to Upper case " );
							for(int y=0;y<1;y++){
								while((c=bInput.read())!=-1){					//looping the statement to end of file
									System.out.println(Character.toUpperCase((char)c));	//change user input to uppercase 
							}
							bInput.reset();								//used to refresh the connection like flesh
							}
								}
			}