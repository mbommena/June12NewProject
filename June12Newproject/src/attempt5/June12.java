package attempt5;

public class June12{
	public int subtract(int a, int b) {
		int c=a-b;
		System.out.println("difference is:"+c);
		return c;
	}	
	public int multiply(int a, int b) {
		int c=a*b;
		System.out.println("product is:"+c);
		return c;
	}	
	public int subtract1(int a, int b) {
		int c=a-b;
		System.out.println("difference1 is:"+c);
		return c;
	}	
	public int sum(int a, int b) {
		int c=a+b;
		System.out.println("sum is:"+c);
		return c;
	}	
	public int division(int a, int b) {
		int c=a/b;
		System.out.println("quotient is:"+c);
		return c;
	}	
	public static void main(String[] args) {
		June12 test=new June12();
		int sub1=test.subtract(10,2);
		int mul=test.multiply(sub1,2);
		int sub2=test.subtract1(mul,2);
		int add=test.sum(sub2,2);
		int div=test.division(add,2);
		System.out.println("Final result =:" + div);
	}
}
