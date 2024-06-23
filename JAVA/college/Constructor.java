
class Constructor{
	String name;
	int id;
	Constructor()
	{
		name="kuldeep";
		id=277;
	}
	Constructor(String s,int i){
		name=s;
		id=i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Constructor s1=new Constructor();
        Constructor s2=new Constructor("kuldeep",123);
        System.out.println("Name of s1 is "+s1.name+" and id is "+s1.id);
        System.out.println("Name of s2 is "+s2.name+" and id is "+s2.id);
	}

}
