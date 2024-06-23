public class CountEvenDigit {
    public static void main(String[] args) {
        int arr[]={34,456,38,27,5748,38923,34};
        System.out.println("There are "+count(arr)+" numbers containing even digits");
    }
    static int count(int arr[]){
        int total=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
             while(arr[i]>0){
                 count++;
                arr[i]=arr[i]/10;
             }
             if(count%2==0){
                total++;
             }
        }
        return total;
    }
}
