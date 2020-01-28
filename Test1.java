import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test1 {
	
	public static void main(String[] arg) {
		File file = null;
		FileReader fr =null;
		
		try {
			 file = new File("aaa.txt");
			// System.out.println(file.canRead());
			 fr = new FileReader(file);
			 while(fr.ready()) {
				  char c = (char)fr.read();
				  System.out.print(c);
			 }
			
			 
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}