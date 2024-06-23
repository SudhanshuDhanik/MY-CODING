class Student {
   static String school;//School will be same for all object 
                        //thats why we are using static keyword
                        //to fixed the name of school
   String name;   
}


public class Statics {
   public static void main(String args[]) {
       Student.school = "JMV";//we directly put the value coz it is static

       Student s1 = new Student();//first we initialized it then put the value 
       Student s2 = new Student();//coz its not static


       s1.name = "Meena";
       s2.name = "Beena";


       System.out.println(s1.name);
       System.out.println(s1.school);
       System.out.println(s2.name );
       System.out.println(s2.school);
   }
}

