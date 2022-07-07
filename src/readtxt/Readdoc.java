package readtxt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readdoc {

	public static void main(String[] args) throws IOException {
		File f= new File("../Readtext/src/readtxt/file1.txt");
		FileReader fr=new FileReader(f);
		int a;
		while ((a=fr.read())!=-1){
			System.out.println((char)a);
			
		}

	}

}
