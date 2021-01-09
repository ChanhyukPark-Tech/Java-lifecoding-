class foo{
	public static String classVar = "I am in the class";
	public String instanceVar = "I am in the instance";
	
	public static void classMethod(){
		System.out.println(classVar);
		System.out.println("========");
//		System.out.println(instanceVar);
	}
	public void instanceMethod() {
		System.out.println(classVar);
		System.out.println(instanceVar);
		System.out.println("======");
		
	}
	
}
public class StaticApp {

	public static void main(String[] args) {
		foo.classMethod();
//		foo.instanceMethod();
		foo f1 = new foo();
		foo f2 = new foo();
		
		f1.instanceMethod();
		
		System.out.println(f1.classVar);
		System.out.println(f1.instanceVar);
		
		f1.classVar = "changed by f1";
		System.out.println(f1.classVar);
		System.out.println(foo.classVar);
		f1.instanceVar = "changed by f1";
		System.out.println(f1.instanceVar);
//		System.out.println(foo.instanceVar);
		System.out.println(f2.instanceVar);
		
		
		
		
	}

}
