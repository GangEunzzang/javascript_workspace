import java.io.*;
import java.util.*;

public class FileWriterEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("C:\\Temp\\test.txt");
			while(true) {
				String line = sc.nextLine();
				if(line.length()==0)
					break;
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0,2 );
			}
			fout.close();
		}catch(Exception e) {
			System.out.println("����� ����");
		}
		sc.close();
	}
}