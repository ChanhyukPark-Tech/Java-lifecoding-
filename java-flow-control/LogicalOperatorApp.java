
public class LogicalOperatorApp {

	public static void main(String[] args) {
		System.out.println(1 == 1);
		
//		AND
		System.out.println("AND--------------------------");
		System.out.println(true && true);
		System.out.println(true && false); //false
		System.out.println(false && true); //false
		System.out.println(false && false); //false
//		OR
		System.out.println("OR--------------------------");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
//		not
		System.out.println("not--------------------------");
		System.out.println(!true);
		System.out.println(!false);
		
	}

}
