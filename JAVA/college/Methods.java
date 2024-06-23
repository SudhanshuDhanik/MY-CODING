


	
// A Simple Java program to demonstrate
// method overriding in java
 
// Base Class
class Parent {
    void show() { System.out.println("Parent's show()"); }
void sum(int a,int b){
System.out.println(a+b);
}
}
 
// Inherited class
class Child extends Parent {
    // This method overrides show() of Parent
    @Override void show()
    {
        System.out.println("Child's show()");
    }
	void sum(int a,int b,int c){
System.out.println(a+b+c);
}
}
 
// Driver class
public class Methods {
    public static void main(String[] args)
    {
        // If a Parent type reference refers
        // to a Parent object, then Parent's
        // show is called
        Parent obj1 = new Parent();
        obj1.show();
		obj1.sum(4,7);
 
        // If a Parent type reference refers
        // to a Child object Child's show()
        // is called. This is called RUN TIME
        // POLYMORPHISM.
        Parent obj2 = new Child();
        obj2.show();
		//or
		Child obj3=new Child();
		obj2.show();
		obj3.sum(6,9,8);
    }
}
