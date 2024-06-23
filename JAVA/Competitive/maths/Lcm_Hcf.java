package maths;
public class Lcm_Hcf {
    static int hcf(int n1,int n2){     while(n1 != n2) { 
        if(n1>n2) {
            n1 = n1 - n2;
        } else {
            n2 = n2 - n1;
        }
    }
return n2;
// or return n1;

}
//2nd method:
// while (b != 0) {
//     int temp = b;
//     b = a % b;
//     a = temp;
// }
// return a;
// }

//3rd method
    // static int hcf(int a, int b) {
    //     int min;
    //     if (a < b) {
    //         min = a;
    //     } else
    //         min = b;
    //     int no = 1;
    //     for (int i = 1; i <= min; i++) {
    //         if (a & b % i == 0) {
    //             no
    //         }
    //     }
    //     return no;
    // }


    public static void main(String[] args) {
        int a = 60;
        int b = 18;
        int gcd = hcf(a, b);
        System.out.println(gcd);
        int lcm=(a*b)/gcd;
        System.out.println(lcm);
    }
}
