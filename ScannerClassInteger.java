package ScannerClass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerClassInteger {

	public static void main(String[] args) {
		try {
			File f = new File("/Users/Hiba/Desktop/outfolder/infolder2/scanner.txt");  // we create a new file in infolder2 	
			FileWriter fwr = new FileWriter(f);
			fwr.write("10 20 30 40 50 60 70\n");
			fwr.write("1 2 3 4 5 6 7 8 9 11\n");
			fwr.flush();
			
			Scanner myReader = new Scanner(f);
			
			int itemNo = 0;
			int total=0;

			
			while(myReader.hasNextInt()) {    // break when the file has no integer longer   
				int num = myReader.nextInt();    // if we put this code outside the while loop num takes the value 10 and the loop begin from 
				// second item ( myReader.nextInt() = 20 )
				  total+= num ;		// add all item together
				  
				  itemNo++;
			
				  if(itemNo== 7) 
					
					  
					  System.out.println( "the ave of the line:"+ total/itemNo );
				  
			}
			System.out.printf("total num = %d \nand the no of num = %d",total,itemNo);
			
			System.out.println();
			int x = Items(f);
			System.out.println(x);
			
			fwr.close();
			myReader.close();
			
		
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	// method takes file as a parameter and count how many int in the file 
	public static int Items(File f)throws IOException {
		int itemCounter  = 0 ;
		Scanner input = new Scanner(f);
		while(input.hasNextInt()) {
		    input.nextInt();
			itemCounter++ ;
			input.close();
		}
		return itemCounter;
	}

}
