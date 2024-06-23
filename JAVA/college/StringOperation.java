import java.util.Scanner;
public class StringOperation {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter string s1: ");
String s1=sc.next();
//Length
System.out.println("Length of s1 is: "+s1.length());

String s2=new String();//or String s2=new String("dhanik");
s2="dhanik";           //or String s2="dhanik";
//Concatenation
System.out.println("Concatenation of s1 ans s2 is: "+s1.concat(s2));
System.out.println("Concatenation of s1 ans s2 is: "+s1+s2);
//Equals or not
boolean result=s1.equals(s2);
System.out.println("s1 are s2 are Equal? :"+result);
//equalsIgnoreCase
s1="SoNu";
s2="sOnu";
System.out.println("does s1 equals s2?: "+s1.equalsIgnoreCase(s2));

//Strings are immutable e.g.
s1.concat("dhanik");
//output will be s1 only , dhanik will not get concat on it
System.out.println(s1);
//to concat we have to do this
s1=s1.concat("dhanik");
System.out.println(s1);
System.out.println("Does string s2 contains d?"+s2.contains("d"));

//charAt
    System.out.println("char at index 4 of s1: "+s1.charAt(4));
//compareTo
String name1="tuly";
String name2="tony";
//returns int value by comparing diff b/w first different char of both strings
System.out.println("Compare name 1 and name 2: "+name1.compareTo(name2));
 //tony>sony
 String name3="tony";
String name4="sony";
if(name3.compareTo(name4)==0)
//if two strings are equal then their diff is 0
    System.out.println("Strings are equal");
    else
    System.out.println("Strings are not equal");
    name1="tonY";
name2="ToNy";
//compareToIgnoreCase
if(name1.compareToIgnoreCase(name2)==0)
    System.out.println("Strings are equal");
    else
    System.out.println("Strings are not equal");

//substring
String sentence="My name is tony";
//substring(beginIndex,endIndex)
String name=sentence.substring(11, sentence.length());
System.out.println(name);
 name=sentence.substring(0,4);
System.out.println(name);
 name=sentence.substring(4);
System.out.println(name); 

//toLowerCase
System.out.println("s1 in lower case: "+s1.toLowerCase()); 
//toUpperCase
System.out.println("s1 in upper case: "+s1.toUpperCase()); 
//Trim:remove all trailing and leading spaces from original string
String a="  aman   khana  ";
System.out.println("After trim string a looks: "+a.trim());
//replace
s2="abaytbab";
System.out.println("REplacing ab in s2 to bt: "+s2.replace("ab","bt"));
//replaceAll
System.out.println("REplacing ab in s2 to bt: "+s2.replaceAll("ab","bt"));   
//startsWith
System.out.println("does s2 startswith ab??: "+s2.startsWith("ab"));
//endsWith
System.out.println("does s2 endswith ba??: "+s2.endsWith("ba"));
//indexOf
System.out.println("index of b in s2: "+s2.indexOf("b", 2));
System.out.println("index of b in s2: "+s2.indexOf("b"));
//escape sequence
System.out.println("my name is \n sudhanshu");//new line
System.out.println("my name is \t sudhanshu");//tab
System.out.println("my name is \\sudhanshu");
System.out.println("my name is \" sudhanshu\"");


    }
}
