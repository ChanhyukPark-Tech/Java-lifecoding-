
public class TwoException {

	public static void main(String[] args) {
		System.out.println("start");
		int[] arr = { 1, 2, 3, 4 ,5};
		
		try {
			System.out.println(2/0);
			System.out.println(arr[8]);
			System.out.println("middle");
			
		} catch(ArithmeticException e) {
			System.out.println( " �߸��� ������ maybe 0 ���� ����");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(" index �� ���� ���ǵ��� �ʾ����� ");
		}
		System.out.println("finish");
	}

}
