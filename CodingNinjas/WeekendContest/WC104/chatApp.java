package CodingNinjas.WeekendContest.WC104;

import java.util.ArrayList;
import java.util.List;

public class chatApp {
    public static void main(String[] args) {
        int n = 6;
        int m = 10;
        String s = "1010101010";
        ArrayList<Integer> time = new ArrayList<>(List.of(1, 2, 4, 5));

        int result = countMinimumDeletion(n, m, s, time);
        System.out.println("Minimum deletions: " + result);
    }
    static int countMinimumDeletion(int n, int m, String s, ArrayList<Integer> time) {
         
        int count = 0;
         StringBuilder stringbuilder = new StringBuilder(s);

         for(int i = 0; i < time.size(); i++){
             int deleteIndex = time.get(i) - 1;
             while(deleteIndex < stringbuilder.length() && stringbuilder.charAt(deleteIndex) == '1'){
                 stringbuilder.deleteCharAt(deleteIndex);
                 count ++;
             }
             }
             
             return count;
         }
}
