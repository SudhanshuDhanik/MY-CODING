


interface one{
	void display();
}
interface two{
	void sms();
}
class Interfaces implements one , two{
	public void display(){
	System.out.println("This showcase the interface one");	
	}
	public void sms(){
		System.out.println("This is interface two");
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Interfaces obj=new Interfaces();
obj.display();
obj.sms();

	}

}
