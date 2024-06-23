import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
         int marks[]=new int[5]; 
         marks[0]=90;
         marks[1]=87;
         marks[2]=86;
         marks[3]=87;
         for(int i=0;i<5;i++){
            System.out.println(marks[i]);
         }
         Scanner sc=new Scanner(System.in);
         int x=sc.nextInt();
         for(int i=0;i<marks.length;i++)
{
    if(marks[i]==x)
    System.out.println("x is found at index: "+i);
}    }
    
}
