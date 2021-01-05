import javax.swing.JOptionPane;

public class AccountingMethodApp {
		static String vos = JOptionPane.showInputDialog("put in your value of supply ");
		public static double ValueOfSupply;
		public static double vatRate;
		public static double Expense;
		public static double expenseRate;
	    public static void main(String[] args) {
	    ValueOfSupply = Double.parseDouble(vos);
	    vatRate = 0.1;
	    expenseRate = 0.3;
	    	
		print();
		
	}

		public static void print() {
			System.out.println("Value of supply : " + ValueOfSupply);
			System.out.println("VAT : " + getVAT() );
			System.out.println("Total : " + getTotal() );
			System.out.println("Income : " + getIncome());
			System.out.println("Expense : " + getExpense());
			System.out.println("Dividend 1 : " + getDividend1() );
			System.out.println("Dividend 2 : " + getDividend2() );
			System.out.println("Dividend 3 : " + getDividend3() );
		}

		public static double getDividend1() {
			return getIncome() * 0.5;
		}

		public static double getDividend2() {
			return getIncome() * 0.3;
		}

		public static double getDividend3() {
			return getIncome() * 0.2;
		}

		public static double getIncome() {
			return ValueOfSupply - getExpense();
		}

		public static double getExpense() {
			return ValueOfSupply*expenseRate;
		}

		public static double getTotal() {
			return ValueOfSupply + vatRate;
		}

	public static double getVAT() {
		return ValueOfSupply * vatRate;
	}

}
