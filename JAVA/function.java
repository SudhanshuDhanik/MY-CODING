import java.util.Scanner;
public class function {
    public static void printName(String name) 
    {System.out.println(name);
        return;
        
    }
    public static int fact(int no) {
        
      int factorial=1;
        for( int i=1;i<=no;i++){
          factorial=factorial*i;
        }
        return factorial;
        
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
    String name=sc.next();
printName(name);  
int a=sc.nextInt();

System.out.println(fact(a));  }
}
