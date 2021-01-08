import javax.swing.JOptionPane;

public class AuthApp4 {

	public static void main(String[] args) {
		String[][] users = { 
			{"egoing" , "1111"},
			{"chanhyuk", "2222"},
			{"nomad" , "3333"}
		};
		String inputID = JOptionPane.showInputDialog("put in your ID");
		String inputPassword = JOptionPane.showInputDialog("put in your Password");
		
		boolean isLogined = false;
		for(int i=0; i<users.length; i++ ) {
			String[] Oneuser = users[i];
			if(  inputID.equals(Oneuser[0]) && inputPassword.equals(Oneuser[1])  ) {
				isLogined = true;
				break;
			}
		}
			 System.out.println("hi");
		 if(isLogined) { 
			 System.out.println("Master");
		 }
		 else {
			 System.out.println("who are you ");
			  }
		 }
	}


