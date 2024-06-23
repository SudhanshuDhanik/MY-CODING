


	class superclasses{
int i=20;
void display() {
	System.out.println("This is super class");
}}
	class subclass extends superclasses{
		int i=30;
		void display() {
			super.display();
			System.out.println("This is SUBCLASS");
			System.out.println("VAlue of i in superclass is "+super.i);
			System.out.println("VAlue of i in SUBCLASS is "+i);
		}
	}
	public class Superclass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        subclass obj=new subclass();
        obj.display();
	}

}
