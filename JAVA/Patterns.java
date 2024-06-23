public class Patterns{
    public static void main(String args[]) {
        // 1.Solid rectangle
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        // 2.hollow rectangle
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 1 || i == 4 || j == 5)
                    System.out.print("*");

                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // 3.half pyramid
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 4.inverted half pyramid
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 5.inverted & rotated half pyramid
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 6.floyd's Traingle
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                sum = sum + 1;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        // 7.0-1 Traingle
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
        // 8.Butterfly pattern
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            int spaces = 2 * (4 - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            int spaces = 2 * (4 - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // 9.Solid Rhombus
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 10.number pyramid
        for(int i=1;i<=5;i++){
            for(int j=5;j>i;j--){
    System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println();}
        // 11.Palindromic pattern
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
        // 12.Diamond paTTERN
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    //     13.Pascal's Triangle(H.W ques in video description)
    //     Each number in the triangle is the sum of the two directly above it
    //      1
    //     1 1
    //    1 2 1
    //   1 3 3 1
    //  1 4 6 4 1
    for(int i=1;i<=5;i++){
        for(int j=5;j>i;j--){
           System.out.print(" "); 
        }
        int num=1;
    for(int j=1;j<=i;j++ ){
        System.out.print(num+" ");
        num=num*(i-j)/(j);
    }
    System.out.println();
    }
    //14.Hollow Butterfly(H.W ques in video description)
    for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= i; j++) {
            if (i == j || j == 1) {
                System.out.print("*");

            } else
                System.out.print(" ");
        }
        for (int j = 1; j <=2 * (5 - i); j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
            if (i == j || j == 1) {
                System.out.print("*");

            } else
                System.out.print(" ");
        }
        System.out.println();
    }
    for (int i = 5; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
            if (i == j || j == 1) {
                System.out.print("*");

            } else
                System.out.print(" ");
        }
        for (int j = 1; j <= 2 * (5 - i); j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
            if (i == j || j == 1) {
                System.out.print("*");

            } else
                System.out.print(" ");
        }
        System.out.println();
    }
}
}
