
public class LoopArray {

	public static void main(String[] args) {
		String[] users = new String[3];
		users[0] = "egoing";
		users[1] = "jinhyuk";
		users[2] = "youbin";
		
		for(int i=0; i<(users.length);i++) {                     // 지능적 변화하는 반복분
			System.out.println("<li>"+users[i]+"</li>");
		}
	}

}
