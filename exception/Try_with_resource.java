import java.io.FileWriter;
import java.io.IOException;

public class Try_with_resource {

	public static void main(String[] args) {
		try( FileWriter f = new FileWriter("data.txt")){
			f.write("hello");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
