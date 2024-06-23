


	class firste{
		int a=10;
		int b=20;
		void sum1() {
			System.out.println("Sum of a and b is: "+(a+b));
		}
	}
	class seconds extends firste{
		int c=b*a;
		void prod() {
			System.out.println("Product of a and b is: "+c);
		}
	}
	public class SingleInherit {
	public static void main(String args[]) {
		seconds obj=new seconds();
		obj.sum1();
		obj.prod();
	}
}
