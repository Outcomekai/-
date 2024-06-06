import java.io.FileInputStream;
import java.io.IOException;

public class Input {

	public static void main(String[] args) throws IOException {
    byte[] b = new byte[1024];
    FileInputStream input = new FileInputStream("C:/MyWork/Test.txt");
    input.read(b);
    System.out.println(new String(b));
    input.close();
	}
}
