package bank;
//WE HAVE USE BANK PACKAGE IN OOPS.JAVA
/*we had move package.java and oops.java in
 different folder named as bank(path:java->bank).
 We choose folder name as bank coz our package name
 must be matched with folder name which includes both
 package file and file using that package*/
class Pen{       
    String color; //properties/instance variables  of class Pen.
    String type;  
    public void write() { //Function of class Pen also known as instance methods.
        System.out.println("Write something");
        
    }
    public void printColor() {
        System.out.println(this.color);
    }
}

  class Student {
   String name;
   int age;
  public void printInfo() {
    System.out.println(this.name);
    System.out.println(this.age);
  }
   Student(String name, int age) {
       this.name = name;
       this.age = age;
   }
}

    public class OOPS {
    public static void main(String arg[]) {
        Pen pen1=new Pen();
        pen1.color="blue";
        pen1.type="gel";      //Pen1 is object
        pen1.write();
        pen1.printColor();

        Pen pen2=new Pen();
        pen2.color="black";
        pen2.type="ball";      //Pen2 is object
        pen2.write();
        pen2.printColor();

        Student s1=new Student("Aman",24); //s1 is object
         s1.printInfo();

         bank.Account Acc=new bank.Account();
         Acc.name="Sonu";
         System.out.println(Acc.name);
        
   }}



