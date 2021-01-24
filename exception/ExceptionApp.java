
public class ExceptionApp {

	public static void main(String[] args) {
		System.out.println(1);
		
		int[] scores = {10,20,30};
		try {
			System.out.println(scores[3]);			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("없는 배열의 index 값입니다");
		}
		
		try {
		System.out.println(2/0);
		} catch(ArithmeticException e) {
			System.out.println("잘못된 계산이네요!");
		}
		System.out.println(3);
	}

}
