import java.util.Scanner;
class irst{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
int x=1;
     do{
if(x==1){
    System.out.print("Enter marks: ");
    int marks=sc.nextInt();
    if(marks<=100 && marks>90){
        System.out.println("This is Good");
    }
    else if(marks<=90 && marks>60){
        System.out.println("This is also Good");
    }
    else if(marks<=60 && marks>=0){
        System.out.println("This is Good as well");
    }
    else{
        System.out.println("Invalid input for marks");
    }
    System.out.println("Marks don't matter but our efforts does");
    System.out.println();
}
System.out.print("Enter 1 to input marks and 0 for exit: ");
 x=sc.nextInt();
     }  
     while(x==1); 
    }
}