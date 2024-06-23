public class Q36cAndD {
    public static void main(String[] args) {
        String str="sudhanshu";
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(str.length()-2));
        int no=1;
        int n=1;
        int sum=0;
        while(n<=10)
        {
          int count=0;
          for(int j=1;j<=no;j++)
          {
            if(no%j==0)
            {
              count++;
            }
          }
          if(count==2)
          {
            sum=sum+no;
            n++;
          }
          no++;
        }
        System.out.println("Sum of first 10 prime numbers is "+sum);
      }
    }
