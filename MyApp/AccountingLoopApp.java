import javax.swing.JOptionPane;

public class AccountingLoopApp {

	public static void main(String[] args) {
	 
		
		
		String vos = JOptionPane.showInputDialog("put in your value of supply ");
		double ValueOfSupply = Double.parseDouble(vos);
		double expenseRate = 0.3;
		double VAT = 0.1;
		double vat = ValueOfSupply*VAT;
		double total = ValueOfSupply + vat;
		double Expense = ValueOfSupply*expenseRate;
		double income = ValueOfSupply - Expense;
		
		System.out.println("Value of supply : " + ValueOfSupply);
		System.out.println("VAT : " + vat );
		System.out.println("Total : " + total );
		System.out.println("Income : " + income);
		System.out.println("Expense : " + Expense);
	
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		int i = 0;
		while(i < dividendRates.length) {
			System.out.println("Dividend" + (i+1) + ":" + (income * dividendRates[i]) );
			i = i + 1 ;
		}
		
	

	}

}
