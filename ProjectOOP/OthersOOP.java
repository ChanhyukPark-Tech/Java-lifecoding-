import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {
		
//		/
//		* class: System , Math , FileWriter
		
//		*
//		* instance : f1 , f2
//		*
//		/
		System.out.println(Math.PI);
		System.out.println(Math.ceil(2.40));
		System.out.println(Math.floor(2.4));
		
		FileWriter f1 = new FileWriter("data.txt");
		f1.write("hello"+"\n");
		f1.write("JAVA");
		f1.close();
		
		FileWriter f2 = new FileWriter("data2.txt");
		f2.write("hello2");
		f2.write("JAVA2");
		f2.close();
	
		
	}

}
