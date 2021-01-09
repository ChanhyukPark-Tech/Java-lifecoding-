
class Print{
	public  String delimiter = "";
	
	public Print(String delimiter) {
		this.delimiter = delimiter;	
	}
	
	public void A() {
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
	}
	public void B() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
	}
}