
import java.util.Arrays;
public class StringDuplicates {
    public static void main(String[] args) {
        String str="aTyydaEtTD";
        int k=0;
       char temp[]=str.toCharArray();
        for(int i=0;i<temp.length;i++){
           int j;
           for( j=0;j<i;j++){
             if(temp[i]==temp[j])
             break;
           }
           if(i==j){
            temp[k++]=temp[i];
           }

        }
    
            System.out.println(String.valueOf(Arrays.copyOf(temp,k)));
        }

}
