package readtxt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Readdataor {//read data of range
	
	public void rdor(int a, int b) throws IOException {
		int q=0;
		File f=new File("../Readtext/2.txt");
		FileReader FR=new FileReader(f);
		BufferedReader br=new BufferedReader(FR);
		String s;
		while ((s=br.readLine())!=null) {
			q++;
			if ((a<=q) && (q<=b)) {
				System.out.println(s);
			}
			}
		while ((s=br.readLine())==null) {
			
			if ((a<=q) && (q<=b)){
		System.out.println("End of File"); break;}
		}
	}

	public static void main(String[] args) throws IOException {
		Readdataor ob=new Readdataor();
		Scanner s=new Scanner(System.in);
		System.out.println("enter 1st row");
		int x=s.nextInt();
		System.out.println("enter last row");
		int y =s.nextInt();
		ob.rdor(x, y);
	}

}
