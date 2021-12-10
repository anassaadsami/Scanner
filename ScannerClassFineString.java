package ScannerClass;

import java.io.File;
import java.util.Scanner;

import FilesInJava.LineCounter;

public class ScannerClassFineString {

	public static void main(String[] args) {
		try {
			// in Scanner class we can not put directly the path and file name to Scanner
			// we must put it first in File class

			File f = new File("/Users/Hiba/Desktop/outfolder/infolder2/", "Scanner1,txt");
			Scanner myReader = new Scanner(f);
			int letterCount = 0;
			while(myReader.hasNext())  {
				String word = myReader.next();
				letterCount++ ;
//				if(word.equals("child")) {   // how????
//					break;
//				}
				System.out.print(word.toUpperCase()+" ");     // if just sysout(myReader()) error
				
			}
			System.out.println(letterCount);
			/*
			int lineCount = 0 ;
			while (myReader.hasNext()) {
				String x = myReader.nextLine();
				lineCount++;
				System.out.println(x.toLowerCase().trim() + " "); // if just sysout(myReader()) error

			}
			System.out.println("no of lines is: "+ lineCount);
            */
			myReader.close();
			
		} catch (Exception e) {

		}
	}

}
