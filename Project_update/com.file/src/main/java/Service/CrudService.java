package Service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;

import java.util.Scanner;

import Dao.Details;
import Model.Student;

public class CrudService implements Details {
	//public static String filepath = "C://Users/shahrin.nasrin/Desktop/file1";
	String filepath1 = "C://Users/shahrin.nasrin/Desktop/file1/Record.txt";

	@Override
	
		public String add1(ArrayList<Student> myList) {
			 
			 File file =new File(filepath1);
			 
			 file.mkdir();
		
			 String path1 = file.getAbsolutePath();
			
			 
			 FileWriter textFile;
			try {
				textFile = new FileWriter(path1,true);
				 BufferedWriter bw = new BufferedWriter(textFile);
				 int size = myList.size();
		        for (int i=0;i<size;i++) {
				 String str = myList.get(i).toString();
				 bw.write(str);
			        }
		         bw.close();
			}
	                catch (IOException e) {
		
					e.printStackTrace();
			}
			return null;
	}

//		try {
//			FileOutputStream fos = new FileOutputStream(filepath1);
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			oos.writeObject(myList.toString());
//			oos.close();
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}
//
//		return myList;

	@Override
	public String read() {

		try {
			BufferedReader br = new BufferedReader(new FileReader("C://Users/shahrin.nasrin/Desktop/file1/Record.txt"));

			String st;
			while ((st = br.readLine()) != null)
				System.out.println(st);
			return st;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return filepath1;

	}

	@Override
	public String update() {

		return null;
	}

	@Override
	public String search() throws FileNotFoundException {

		ArrayList<String> checkList = new ArrayList<>(); // Declares a String ArrayList object known as
		
		Scanner fileReader = new Scanner(new File(filepath1)); // Declares a Scanner object to read from a file
		
		Scanner keyboard = new Scanner(System.in);
		String userInput;
		

		while (fileReader.hasNext()) { // While loop to read from AliceInWonderland.txt whilst there is a next line on
		
			checkList.add((fileReader.nextLine()));
			
		
				
										// there.
			// Adds the next String to the aliceBook ArrayList.

		} // End of while loop

		System.out.println("Please enter the word you are looking for:>");
		userInput = keyboard.nextLine();
		int total = 0;
		for (String book : checkList) {
			if ((book.contains(userInput)))
				// System.out.println(book);// For each to run through aliceBook and displays
				// the ArrayList.

				total++;

		}
		if (total == 1) {
			System.out.println("found");
		} else {
			System.out.println("Not");
		}
		return userInput;
	}

}

//		Scanner scan = null;
//		try {
//			scan = new Scanner(new File(fileName));
//		} catch (FileNotFoundException e) {
//
//			e.printStackTrace();
//		}
//
//		int c = 0;
//		while (scan.hasNext()) {
//
//			String line = scan.nextLine();
//
//			if (line.contains(searchStr)) {
//				c++;
//				System.out.println(line);
//			}
//
//		}
//		if (c == 1) {
//			System.out.println("present");
//		} else
//
//		{
//			System.out.println("Not present");
//		}
