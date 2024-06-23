public class Reoccurence_2 {
    public static void main(String[] args) {
        int no=234245574;
        int x=4;
        int count=0;
        while(no>0){
            int r=no%10;
            if(r==x){
                count++;
            }
            no=no/10;
        }
        System.out.println(x+" occurs "+count+" times");

        //Aliter method
      int newno=679229726;
      String str=Integer.toString(newno);
    char y='2';
      int count2=0;
      for(int i=0;i<str.length();i++){
if(y==str.charAt(i)){
    count2++;
}
      }
      System.out.println(y+" occurs "+count2+" times");
    }
}
