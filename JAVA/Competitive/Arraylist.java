import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
       
        // add elements
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list2.add("d");
        list2.add("f");
        list2.add("z");
        list2.add("a");

        list3.add(true);
        list3.add(false);
        list3.add(false);
        list3.add(true);

        System.out.println(list2);
        System.out.println(list3);

        // to get an element
        int element = list.get(0); // 0 is the index
        System.out.println(element);
        System.out.println(list2.get(0));
        System.out.println(list3.get(0));

        // add element in between
        list.add(1, 2); // 1 is the index and 2 is the element to be added
        System.out.println(list);

        // set element
        list.set(0, 0);
        System.out.println(list);

        // delete elements
        list.remove(0); // 0 is the index
        System.out.println(list);

        // size of list
        int size = list.size();
        System.out.println(size);

        // Loops on lists
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Sorting the list
        list.add(0);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
         Collections.sort(list2);
        System.out.println(list2);
        Collections.reverse(list2);
        System.out.println(list2);
         Collections.sort(list3);
        System.out.println(list3);
    }
}
