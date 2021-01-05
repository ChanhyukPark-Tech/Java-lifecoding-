import javax.swing.JOptionPane;

public class AccountingArrayApp {

	public static void main(String[] args) {
	 
		String vos = JOptionPane.showInputDialog("put in your value of supply ");
		double ValueOfSupply = Double.parseDouble(vos);
		double expenseRate = 0.3;
		double VAT = 0.1;
		double vat = ValueOfSupply*VAT;
		double total = ValueOfSupply + vat;
		double Expense = ValueOfSupply*expenseRate;
		double income = ValueOfSupply - Expense;
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		double dividend1 = income * dividendRates[0];
		double dividend2 = income * dividendRates[1];
		double dividend3 = income * dividendRates[2];
		
		
		System.out.println("Value of supply : " + ValueOfSupply);
		System.out.println("VAT : " + vat );
		System.out.println("Total : " + total );
		System.out.println("Income : " + income);
		System.out.println("Dividend 1 : " + dividend1 );
		System.out.println("Dividend 1 : " + dividend2 );
		System.out.println("Expense : " + Expense);
		System.out.println("Dividend 1 : " + dividend3 );

	}

}
