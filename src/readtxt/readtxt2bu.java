package readtxt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class readtxt2bu {//read data from selected row
 public void readdata(int a) throws IOException{
	 int x=0;
	 int y=0;
			 
	 File f=new File("..//Readtext/2.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String s;
		while((s =br.readLine())!=null) {
			 x++;
		if (x==a)
		 {System.out.println(s);break; }}
		while ((s =br.readLine())==null) {
			x++;
		if(x==a)
		{System.out.println("no data on row");break; }}
 
 }
	public static void main(String[] args) throws IOException {
		
		readtxt2bu ob=new readtxt2bu();
		Scanner p=new Scanner(System.in);
		System.out.println("Enter row");
		int l=p.nextInt();
		ob.readdata(l);
	}

}
