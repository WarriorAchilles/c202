import java.util.*;

import java.util.regex.*;



public class fmr {
	public static void main(String[] args) {
	//this is a example 	
		for (int i = 0; i < args.length; i++) {
			if (args[i].equals("-h")) {
				System.out.println("This program takes in an input and a regrex and outputs the found token of the regrex");
				System.exit(0);
			}//if
		}//for

		int fileInput = -1;

		for (int i = 0; i < args.length; i++) {
			if (args[i].equals("-f") {
				fileInput = i;
			}//if
			Pattern pattern = Pattern.compile(args[fileInput + 2]);

			try{
				FileReader fReader = new FileReader(fileName);
				BufferedReader br = new BufferedReader(freader);
			}//try
			catch {
				
			}//catch
		}//for
		if (fileInput != -1) {
			String fileName = args[fileInput +1];	
		}//if
		else {


		String line = args[0];

		String regrex = args[1];

		Pattern pattern = Pattern.compile(regrex);

		Matcher matcher = Pattern.matcher(line);
		
		boolean found = false;

		while(matcher.find()) {
			System.out.println("I found text " + matcher.group() + " Starting at index " + matcher.start() + " and ending at index " + matcher.end());
		}//while matcher
		if (!found) {
			
			System.out.println("No match found");
		}//if

	}//main

}//class
