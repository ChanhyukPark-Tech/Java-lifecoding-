import javax.swing.JOptionPane;

public class AuthApp {

	public static void main(String[] args) {
		String ownerid = JOptionPane.showInputDialog("put in your name");
		String id = "egoing";
		String inputID = ownerid;
		
		String pass = "1111";
		String inputPass = JOptionPane.showInputDialog("put in your password");
		
//		if(inputID.equals(id)) {
//			if(inputPass.equals(pass)) {
//				System.out.println("Hello ! Master");
//			}
//			else {
//				System.out.println("wrong password");
//			}
//		} else
//			System.out.println("Who Are you");
		
		if(inputID.equals(id) && inputPass.equals(pass)) {
			System.out.println("Hello Master");
			}
		else {
			System.out.println("Who are you");
			
		}
	}

}
