package SDETInterviewPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromTheTextFile {

	public static void main(String[] args) throws IOException   {
		FileReader f=new FileReader("C:\\\\TextFileWriting\\\\Myfile.txt");
		BufferedReader br=new BufferedReader(f);
		 String srt;
		 while((srt=br.readLine())!=null)
		 {
			 System.out.println(srt);
		 }
		br.close();
		 
	}

}
