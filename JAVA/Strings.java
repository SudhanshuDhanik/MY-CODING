 public class Strings {
    public static void main(String args[]) {
//Concatenation
String firstName="TONY";
String lastName="STARK";
String fullName=firstName+" "+lastName;
System.out.println(fullName);

//String length
System.out.println(fullName.length());

//charAt
for(int i=0;i<fullName.length();i++)
{
    System.out.println(fullName.charAt(i));
}

//compareTo
String name1="tony";
String name2="tony";
if(name1.compareTo(name2)==0)
    System.out.println("Strings are equal");
    else
    System.out.println("Strings are not equal");
    //tony>sony
    String name3="tony";
String name4="sony";
if(name3.compareTo(name4)==0)
    System.out.println("Strings are equal");
    else
    System.out.println("Strings are not equal");

//substring
String sentence="My name is tony";
//substring(beginIndex,endIndex)
/*String name=sentence.substring(11, sentence.length());
System.out.println(name);
String name=sentence.substring(0,4);
System.out.println(name);*/
String name=sentence.substring(4);
System.out.println(name);     
    }   
}

// ParseInt Method of Integer class
// public class Strings {
//    public static void main(String args[]) {
//        String str = "123";
//        int number = Integer.parseInt(str);
//        System.out.println(number); 
//    }
// }

// ToString Method of String class
// public class Strings {
//    public static void main(String args[]) {
//       int number = 123;
//       String str = Integer.toString(number);
//       System.out.println(str.length());
      
      
//    }
