package bank;
//WE HAVE USE BANK PACKAGE IN OOPS.JAVA
/*we had move package.java and oops.java in
 different folder named as bank(path:java->bank).
 We choose folder name as bank coz our package name
 must be matched with folder name which includes both
 package file and file using that package*/
 class Account {
   public String name;
   protected String email;
   private String password;

   public String getPassword(){
    return this.password;
   }
   public void setPassword(String password) {
       this.password = password;
   }
}
public class Package{
   public static void main(String args[]) {
       Account a1 = new Account();
       a1.name = "Apna College";
       a1.setPassword("abcd");
       a1.email = "hello@apnacollege.com";
       System.out.println(a1.getPassword());
   }
}



