interface a{
  int a=22;
  void sum();
}
interface b extends a{
   int b=46;
     void prod();
}
interface c extends a{
   int c=60;
  void div();
}
class d implements b,c{
    public void sum(){
        System.out.println(a);
    }
   
    public void prod(){
System.out.println(a*b);
    }
     public void div(){
        System.out.println(c/a);
    }
}
public class Hybrid {
        public static void main(String[] args) {
        d obj=new d();
        obj.sum();
        obj.prod();
        obj.div();
    }
}
