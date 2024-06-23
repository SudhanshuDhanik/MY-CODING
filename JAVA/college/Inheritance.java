 


		class first{
			int a=10;
			int b=20;
			void sum1() {
				System.out.println("Sum of a and b is: "+(a+b));
			}
		}
		class second extends first{
			int c=b*a;
			void prod() {
				System.out.println("Product of a and b is: "+c);
			}
		}
		class third extends second{
			int d=20;
			int sum=a+b+c+d;
			void sum2() {
				System.out.println("Sum of a , b , c and d is: "+sum);
			}
		}
		public class Inheritance{
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	       third obj=new third();
	       obj.sum1();
	       obj.sum2();
	       obj.prod();
	       
		}
	
	}
