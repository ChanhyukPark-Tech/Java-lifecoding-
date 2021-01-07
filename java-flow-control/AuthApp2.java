import javax.swing.JOptionPane;

public class AuthApp2 {

	public static void main(String[] args) {
		String ownerid = JOptionPane.showInputDialog("put in your name");
		String id = "egoing";
		String inputID = ownerid;
		
		String pass = "1111";
		String pass2 = "2222";
		
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
				boolean isRightpass = (inputPass.equals(pass)) || (inputPass.equals(pass2));
				if(inputID.equals(id) && isRightpass) {
			System.out.println("Hello Master");
			}
		else {
			System.out.println("Who are you");
			
		}
	}

}
