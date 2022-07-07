package readtxt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Write1 {//write data till given row/data from user
	
	public  Write1(int a) throws IOException {
		int i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Data to write");
		String k=s.nextLine();
		File f=new File("../Readtext/3.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter b=new BufferedWriter(fw);
		for (i=0;i<=a;i++){
			b.write(k);
		
			b.newLine();
			
		}	b.close();
		
		}
			
	public static void main(String[] args) throws IOException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter last row #");
		int x=s.nextInt();
		
		
		Write1 ob=new Write1(x);

	}

}
