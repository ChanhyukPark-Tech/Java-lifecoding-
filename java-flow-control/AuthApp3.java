import javax.swing.JOptionPane;

public class AuthApp3 {

	public static void main(String[] args) {
		String[] users = new String[3];		
		users[0] = "egoing";
		users[1] = "chanhyuk";
		users[2] = "leezche";
		
		
		String inputId = JOptionPane.showInputDialog("put in your user name");
		
		boolean isLogined = false;
		for(int i=0; i<users.length;i++) {
			
			if(inputId.equals(users[i])) {
				isLogined = true;
				break;
			}
		}
		System.out.println("Hi,");
		if(isLogined) {
			System.out.println("master");
			
		}else {
			System.out.println("Who are you");
		}
		
	}

}
