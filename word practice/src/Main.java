import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		String filePath = "C:/MyWork/Test.txt";

        File file = new File(filePath); 
        if(!file.exists()){ 
            file.createNewFile(); 
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
        writer.write("나는 개쩐다");
        writer.flush(); 
        writer.close(); 
        

	}
}

