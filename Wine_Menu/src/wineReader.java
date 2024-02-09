import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class wineReader {
	public static void main(String[] args) {
		String filePath = "menu.txt";
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
			String line;
			int lineNumber = 1;
			
			while ((line = reader.readLine()) != null) {
				System.out.println("Line " + lineNumber + ": " + line);
				lineNumber++;
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}