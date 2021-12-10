package ScannerClass;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

public class ScannerFromFile {

	public static void main(String[] args){
		try {
			// we can not put just the file name but all the path and file name
		File f = new File("/Users/Hiba/Desktop/outfolder/ScannerClass","Scanner.TXT");
		Scanner input = new Scanner(f);
//		System.out.println(input.next());    // print one word 
//		System.out.println(input.nextLine());    // print the whole line
		while ( input.hasNext()) {       // we can code hasNextLine() the same here    
//			System.out.println(input.nextLine());   // we can code directly together line 19,20
			String line = input.nextLine() ;   // why if i move this code outside the while loop 
			System.out.println(line);         // will be infinite 
		}
		input.close(); 
		
		}	
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("the end");
		
		

	}

}
