package _01_File_Recorder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileRecorder {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			FileWriter fw = new FileWriter("src/_01_File_Recorder/input.txt");
			
			System.out.println("Type something so it is saved in a file");
			String input = s.nextLine();
			
			
			fw.write(input);
			
			s.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
