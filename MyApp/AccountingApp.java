
public class AccountingApp {

	public static void main(String[] args) {
		System.out.println("Value of supply : "+12345.0);
		System.out.println("VAT" + (12345.0*0.1) );
		System.out.println("Total : " + (12345.0 + 12345.0*0.1) );
		System.out.println("Income : " + (12345.0 - 12345.0*0.3));
		System.out.println("Dividend 1 : " + (12345.0 - 12345.0*0.3) * 0.5 );
		System.out.println("Dividend 1 : " + (12345.0 - 12345.0*0.3) * 0.3 );
		System.out.println("Expense : " + (12345.0*0.3));
		System.out.println("Dividend 1 : " + (12345.0 - 12345.0*0.3) * 0.2 );
		
		
	}

}
