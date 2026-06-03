/* copying contents from one file to another file */

import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    int i=0;
		try(FileInputStream fin= new FileInputStream("f.txt");
		FileOutputStream fout= new FileOutputStream("f1.txt");){
		    while(i!=-1){
		        i= fin.read();
		        fout.write(i);
		        
		    }
		}catch(IOException e){
		    System.out.print("Error in copying file");
		}
	}
}
