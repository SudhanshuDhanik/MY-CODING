public class Wealth {
    /*
     * you are given m x n integer grid accounts where
     * accounts[i][j] is the amount of money the ith customer has in the jth bank .
     * Return the wealth that the richest customer has.
     */
    public static void main(String[] args) {
        int arr[][]={{1,2,3},//man i=1 has wealth of 1+2+3=6
                     {3,2,1},//man i=2  has wealth of 3+2+1=6
                      {3,3},//man i=3 has wealth of 3+3=6
                     {1,3,0}};//man i=4 has wealth of 1+3+0=3
                     System.out.println("Richest man has wealth of "+rich(arr));
    }
    static int rich(int arr[][]){
        int max=0;
        for(int i=0;i<arr.length;i++){
            int total=0;
            for(int j=0;j<arr[i].length;j++){
                  total+=arr[i][j];
            }
            if(total>max){
                max=total;
            }
        }
        return max;
    }

}
