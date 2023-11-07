package TASK;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task31_reader_writer {
	public static void main(String[]args) 
	{
		
		File file=new File("task30.txt");
		
		//Using buffer writer to write
		
		try {
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        @SuppressWarnings("resource")
		String str = new Scanner(System.in).nextLine();
        while(!str.equals("exit")){
            bw.write(str);
            str = new Scanner(System.in).nextLine();
        }
        bw.close();	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//Using buffer reader to read file

		try {
			BufferedReader rd = new BufferedReader(new FileReader(file));
			String ln = rd.readLine();
			
			int count=0;
			
			while(ln!=null) {
				System.out.println(count++ +":"+ ln);
				ln=rd.readLine();
			}
			rd.close();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
