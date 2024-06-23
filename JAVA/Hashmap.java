import java.util.*;
public class Hashmap {
   public static void main(String arg[]) {
    //Country(key) , Population
    HashMap<String,Integer>map=new HashMap<>();

    //Insertion
    map.put("India",120);
        map.put("China",150);
    map.put("USA",40);
    System.out.println(map);

    map.put("China",180);
    System.out.println(map);

//Search
if(map.containsKey("indonesia")){
    System.out.println("Key is present in the map");
}
else{
    System.out.println("Key is not present in the map");
}
System.out.println(map.get("China"));

//Iterator
int arr[]={12,25,34};
for(int val:arr){ //Alternative of using loop
    System.out.print(val+" ");
}
System.out.println();
//loop for HashMap
for(Map.Entry<String, Integer>e:map.entrySet()){
    System.out.println(e.getKey());
    System.out.println(e.getValue());
}

//Remove
map.remove("China");
System.out.println(map);
} 
}
