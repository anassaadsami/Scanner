package ScannerClass;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerClassString {

	public static void main(String[] args) {
		File f = new File("/Users/Hiba/Desktop/outfolder/infolder2/", "Scanner1,txt");
		try {
			FileWriter fwr = new FileWriter(f);
			fwr.write("hi this is anas.\n");
			fwr.write("    teim is my child.\n");
			fwr.write("        tania is my wife.\n");
			fwr.flush();
			fwr.close();

			FileReader fr = new FileReader(f);
			int x;
			int lineNo = 0; // counter for lines
			while ((x = fr.read()) != -1) {
				System.out.print((char) x);
				if (x == 10) { // for print just the first line
					lineNo++;
					break; // break when char = 10 and its a ASCII code for new line
				}
			}
			System.out.printf("no of lines is %d \n", lineNo);

			// ------------------------------
			System.out.println();
			Scanner myReader = new Scanner(f);
			while (myReader.hasNext()) { // we can code hasNextLine() the same
				String data = myReader.nextLine().trim(); // move all the space in the beginning and the end of line
				System.out.println(data);

			}

			myReader.close();
			fr.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());

		}
		System.out.println("the end");
	}

}
