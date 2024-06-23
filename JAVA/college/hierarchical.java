
class first2{
	int a=10;
	int b=20;
	void sum() {
		System.out.println("Sum of a and b is: "+(a+b));
	}
}
class second2 extends first2{
	int c=b*a;
	void prod() {
		System.out.println("Product of a and b is: "+c);
	}
}
class third2 extends first2{
	int d=b/a;
	void divide() {
		System.out.println("b divided by a is :"+d);
	}
}
public class hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        second2 obj=new second2();
        third2 obj2=new third2();
        obj.sum();
        obj.prod();
        obj2.sum();
        obj2.divide();
	}

}
