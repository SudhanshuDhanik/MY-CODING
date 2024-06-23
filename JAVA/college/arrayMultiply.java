import java.util.Scanner;

public class arrayMultiply {
    public static void main(String[] args) {
        int a[][] = new int[5][5];
                int b[][] = new int[5][5];
        int c[][] = new int[5][5];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows of Matrix A:");
        int m1 = sc.nextInt();
        System.out.print("Enter no of columns of Matrix A:");
        int n1 = sc.nextInt();
        System.out.println("Enter elements of matrix A");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter no of rows of Matrix B:");
        int m2 = sc.nextInt();
        System.out.print("Enter no of columns of Matrix B:");
        int n2 = sc.nextInt();
        System.out.println("Enter elements of matrix B");
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Multiplication of Matrix A and B is");
        for(int i=0;i<m1;i++){
            for(int j=0;j<n2;j++){
                c[i][j]=0;
                for(int k=0;k<n1;k++){// or  for(int k=0;k<m2;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
