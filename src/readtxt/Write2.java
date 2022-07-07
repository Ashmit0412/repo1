package readtxt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



	public class Write2{//write data in range
		
		public  Write2(int a,int c) throws IOException {
			int i=1;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Data to write");
			String k=s.nextLine();
			File f=new File("../Readtext/3.txt");
			FileWriter fw=new FileWriter(f);
			BufferedWriter b=new BufferedWriter(fw);
			for (i=1;i<=c;i++){
				if ((i>=a)&&(i<=c)) {
				b.write(k);
			
				b.newLine();}
				else  
					if (i<a){
				b.newLine();}
				
			}	b.close();
			
			}
				
		public static void main(String[] args) throws IOException {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter first row #");
			int x=s.nextInt();
			System.out.println("Enter last row #");
			int y=s.nextInt();
			
			Write2 ob=new Write2(x,y);

		}}

	


