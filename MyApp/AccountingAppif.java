import javax.swing.JOptionPane;

public class AccountingAppif {

	public static void main(String[] args) {
	 
		String vos = JOptionPane.showInputDialog("put in your value of supply ");
		double ValueOfSupply = Double.parseDouble(vos);
		double expenseRate = 0.3;
		double VAT = 0.1;
		double vat = ValueOfSupply*VAT;
		double total = ValueOfSupply + vat;
		double Expense = ValueOfSupply*expenseRate;
		double income = ValueOfSupply - Expense;
		
		double dividend1;
		double dividend2;
		double dividend3;
		
		if(income > 10000.0 ) {
			 dividend1 = income * 0.5;
			 dividend2 = income * 0.3;
			 dividend3 = income * 0.2;
		}	else {
			 dividend1 = income * 1;
			 dividend2 = income * 0;
			 dividend3 = income * 0;
		}
	
		
		System.out.println("Value of supply : " + ValueOfSupply);
		System.out.println("VAT : " + vat );
		System.out.println("Total : " + total );
		System.out.println("Income : " + income);
		System.out.println("Expense : " + Expense);
		System.out.println("Dividend 1 : " + dividend1 );
		System.out.println("Dividend 1 : " + dividend2 );
		System.out.println("Dividend 1 : " + dividend3 );

	}

}
