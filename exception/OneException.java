public class OneException {

	public static void main(String[] args) {
		System.out.println("start");
		int[] arr = { 1, 2, 3, 4 ,5};
		
		try {
			System.out.println(2/0);
			System.out.println(arr[8]);
			System.out.println("middle");
			
		} catch(Exception e) {
			System.out.println("���� �̻��մϴ� �����߻�");
		}
		System.out.println("finish");
	}

}
