package SDETInterviewPractice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WrtingIntheTextFile {

	public static void main(String[] args) throws IOException {
		FileWriter fl=new FileWriter("C:\\TextFileWriting\\Myfile.txt");
BufferedWriter bf=new BufferedWriter(fl);
bf.write("To write in a file first create a file then copy that path");
bf.write("create file writer the in send that path into object");
bf.write("create bufferedwriter and send the object of file writer into that");

bf.close();
	}

}
