import javax.swing.JOptionPane;

public class AccountingApp {

	public static void main(String[] args) {
	 
		
		double ValueOfSupply = Double.parseDouble(args[0]);
		double expenseRate = 0.3;
		double VAT = 0.1;
		double vat = ValueOfSupply*VAT;
		double total = ValueOfSupply + vat;
		double income = ValueOfSupply - ValueOfSupply*expenseRate;
		double dividend1 = income * 0.5;
		double dividend2 = income * 0.3;
		double dividend3 = income * 0.2;
		
		System.out.println("Value of supply : " + ValueOfSupply);
		System.out.println("VAT : " + vat );
		System.out.println("Total : " + total );
		System.out.println("Income : " + income);
		System.out.println("Dividend 1 : " + dividend1 );
		System.out.println("Dividend 1 : " + dividend2 );
		System.out.println("Expense : " + (ValueOfSupply*expenseRate));
		System.out.println("Dividend 1 : " + dividend3 );

	}

}
