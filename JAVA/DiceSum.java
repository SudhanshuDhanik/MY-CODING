import java.util.ArrayList;

public class DiceSum {


    static ArrayList<String> DiceCombination(int no, String combination, ArrayList<String> AllCombination) {
        if (no == 0) {
            AllCombination.add(combination);
            return null;
        }
        for (int i = 1; i <= no; i++) {
            DiceCombination((no - i), combination + i, AllCombination);
        }
        return AllCombination;
    }

    public static void main(String[] args) {
        System.out.println( DiceCombination(5, "", new ArrayList<>()));
    }
}
