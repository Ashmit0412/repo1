package readtxt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Copypaste {

	public void Cpypt(int x,int y) throws IOException {
		int q=0;
		
	
			File f=new File("../Readtext/3.txt");
			FileReader FR=new FileReader(f);
			BufferedReader br=new BufferedReader(FR);
			String s;
			File f1=new File("../Readtext/5.txt");
			FileWriter fw=new FileWriter(f1);
			BufferedWriter b=new BufferedWriter(fw);
			while	((s=br.readLine())!=null) {
				q++;
				if ((q>=x)&&(q<=y)) {
					
			System.out.println(s);
			
			
				fw.write(s);
				fw.write("\n");
				
				}}
	while ((s=br.readLine())==null) {
		System.out.println("end of file");
		fw.write("end of file");break;
		
	}	b.close();}

		
    	
    	public static void main(String[] args) throws IOException {
    		
    		Scanner s=new Scanner(System.in);
    		System.out.println("enter 1st row");
    		int x=s.nextInt();
    		System.out.println("enter last row");
    		int y =s.nextInt();
    		
    		Copypaste ob=new Copypaste();
    		ob.Cpypt(x,y);
			}}
	


