import java.util.Scanner;

public class Prime {
    static boolean prime(int no) {
        int count = 0;
        for (int i = 1; i < no / 2; i++) {
            if (no % i == 0) {
                count++;
            }
        }
        if (count > 1)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no to check: ");
        int no = sc.nextInt();
        boolean result = prime(no);
        if (result == true)
            System.out.println(no + " is prime");
        else
            System.out.println(no + " is not prime");
        System.out.println("first 10 prime no are: ");
        firstPrime(10);
    }

    static void firstPrime(int no) {
        int num = 1;
        while (no>0) {
            int count = 0;
            int i = 1;
            while (i <= num) {
                if (num % i == 0) {
                    count++;
                }
                i++;

            }

            if (count == 2) {
                System.out.println(num);
                no--;
            }
            num++;

        }
    }
}
