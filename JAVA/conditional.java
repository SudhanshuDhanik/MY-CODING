import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age=scanner.nextInt();
        if (age>18) {
            System.out.println("Adult");
            
        } else {
            System.out.println("Not adult");
            
        }
        switch(age){
            case 1:
            System.out.println(age-1);
            break;
            case 2:
            System.out.println(age -1);
            break;
            default:
            System.out.println("invalid choice");
        }
        
    }
}
