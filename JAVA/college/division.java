
import java.util.Scanner;
public class division {
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the percentage: ");
		float per=sc.nextFloat();
		if(per<40 && per>=0) 
			System.out.println("You failed!");
		if(per>=40 && per<50) 
			System.out.println("You Got Third Division");
		
		else if(per>=50 && per<60) 
			System.out.println("You Got Second Division");
		
		else if(per>=60 && per<=100) 
			System.out.println("You Got First Division");
		
		else
			System.out.println("Invalid input for percentage");
		
	}}
