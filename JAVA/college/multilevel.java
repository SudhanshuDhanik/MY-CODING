
class firs{
	int a=10;
	int b=20;
	void sum() {
		System.out.println("Sum of a and b is: "+(a+b));
	}
}
class secon extends firs{
	int c=a*b;
	void prod() {
		System.out.println("Product of a and b is: "+c);
	}
}
class thir extends firs{
	int d=b/a;
	void divide() {
		System.out.println("b divide by a is :"+d);
	}
}

public class multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         thir obj=new thir();
         secon obj2=new secon();
         obj.sum();
         obj.divide();
         obj2.prod();
         obj2.sum();
	}

}
