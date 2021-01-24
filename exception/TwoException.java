
public class TwoException {

	public static void main(String[] args) {
		System.out.println("start");
		int[] arr = { 1, 2, 3, 4 ,5};
		
		try {
			System.out.println(2/0);
			System.out.println(arr[8]);
			System.out.println("middle");
			
		} catch(ArithmeticException e) {
			System.out.println( " 잘못된 나누기 maybe 0 으로 나눔");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(" index 의 값이 정의되지 않았을것 ");
		}
		System.out.println("finish");
	}

}
