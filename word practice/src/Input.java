import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Input {

	public static void main(String[] args) throws IOException {
    byte[] Read = new byte[1024];
    FileInputStream input = new FileInputStream("C:/MyWork/Test.txt");
    int bytesRead = input.read(Read);
    input.close();
    
    String content = new String(Read, 0, bytesRead, StandardCharsets.UTF_8);
    
    String part1 = content.substring(0, 40);
    String part2 = content.substring(70);
    String modifiedContent = part1 + part2;
    System.out.println(modifiedContent);//중간 구멍 뚫림
	}
}
