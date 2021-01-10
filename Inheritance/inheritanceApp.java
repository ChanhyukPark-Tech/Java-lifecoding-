class Cal {

	public int sum(int v1, int v2) {
		return v1 + v2 ;
    }
	public int sum(int v1, int v2, int v3) {
		return this.sum(v1, v2) + v3 ; 
	}
	public int minus(int v1 , int v2 , int v3) {
		return v1 - v2 + v3 ;
	}
}

class Cal2 extends Cal{
	public int minus(int v1, int v2) {
		return v1 - v2 ;
		
	}
//	overriding 
	public int sum(int v1, int v2) {
		System.out.println("this is overriding");
		return v1 + v2 ;
	}
	
	public int sum1(int v1 , int v2 , int v3) {
		
		return this.minus(v1, v2) - v3 ;
	}
	
	public int minus1(int v1 , int v2 , int v3 , int v4) {
		return super.minus(v1, v2, v3) + v4;
	}
	
}


public class inheritanceApp {

	public static void main(String[] args) {
		Cal c1 = new Cal();
		Cal2 c2 = new Cal2();
		
		
		System.out.println(c1.sum(1, 2));
		System.out.println(c2.sum(1, 2));
		System.out.println(c2.minus(1,2));
		System.out.println(c1.sum(1, 2, 3));
		System.out.println(c2.sum1(3, 10, 3));
		System.out.println(c2.minus1(3, 5, 1, 7));
	}
}
