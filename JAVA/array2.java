import java.util.Scanner;

public class array2{
public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    int[][]matrice=new int[m][n];
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
matrice[i][j]=sc.nextInt();    }
}
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        System.out.print(matrice[i][j]);
    }
    System.out.println();
}
int x=sc.nextInt();
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        if(matrice[i][j]==x)
        System.out.println("x is at ("+ i +"," +j +")");
    }}
}
}