public class stringbuilder {
    public static void main(String arg[]) {
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);
        
        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index
       sb.setCharAt(0, 'p');  
        System.out.println(sb); 
    
    //insert
sb.insert(2,'h');
System.out.println(sb);

//delete
sb.delete(2, 3);
System.out.println(sb);

//append
sb.append("stt");
sb.append("t");
sb.append("a");
sb.append("r");
sb.append("k");
System.out.println(sb);

//length
System.out.println(sb.length());

//reverse
for(int i=0;i<sb.length()/2;i++){
int front=i;
int back=sb.length()-1-i;
char frontChar=sb.charAt(front);
char backchar=sb.charAt(back);
sb.setCharAt(front,backchar);
sb.setCharAt(back, frontChar);
}
System.out.println(sb);

}
    
    
}
