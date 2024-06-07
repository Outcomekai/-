import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class Input {

	public static void main(String[] args) throws IOException {
    byte[] ByRead = new byte[1024];
    FileInputStream input = new FileInputStream("C:/MyWork/Test.txt");
    int bytesRead = input.read(ByRead);
    input.close();
    String content = new String(ByRead, 0, bytesRead, StandardCharsets.UTF_8);

    
    Random random = new Random();
    String Output = removeWordsRandomly(content, 5, random);
    System.out.println(Output);
    
    
	}
	 public static String removeWordByIndex(String[] words, int indexToRemove) {
	        StringBuilder result = new StringBuilder();
	        for (int i = 0; i < words.length; i++) {
	            if (i != indexToRemove) {
	                    result.append(" "); // 단어 사이에 공백 추가
	                
	                result.append(words[i]);
	            }
	        }
	        
	        return result.toString();
	 }
	 
	 public static String removeWordsRandomly(String content, int times, Random random) {
	        String modifiedContent = content;
	        for (int i = 0; i < times; i++) {
	            String[] words = modifiedContent.split(" ");
	            if (words.length == 0) {
	                break;
	            }
	            
	            int N = random.nextInt(words.length);
	            modifiedContent = removeWordByIndex(words, N);
	        }
	        return modifiedContent;
	 }
	 
}
