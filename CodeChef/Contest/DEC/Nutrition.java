/*
 * Date: 13/12/23
 * 
 * 
 */

package CodeChef.Contest.DEC;

import java.util.ArrayList;
import java.util.Scanner;

public class Nutrition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        while (testCases > 0) {

            int fruits = input.nextInt();
            ArrayList<Integer> A = new ArrayList<>();
            ArrayList<Integer> B = new ArrayList<>();
            for (int i = 0; i < fruits; i++) {
                A.add(input.nextInt());
            }

            for (int i = 0; i < fruits; i++) {
                B.add(input.nextInt());
            }

            // logic
            int sum = 0;
            for (int i = 0; i < A.size(); i++) {

                int max = B.get(i);
                for (int j = i + 1; j < A.size(); j++) {
                    if (A.get(i) == A.get(j)) {

                        if (B.get(j) > max) {
                            max = B.get(j);
                            if (j > i) {
                                A.remove(i);
                                B.remove(i);
                                j--;
                            } else {
                                A.remove(j);
                                B.remove(j);
                                j--;
                            }
                        } else {
                            A.remove(j);
                            B.remove(j);
                            j--;
                        }
                    }
                    System.out.println(A.toString());
                    System.out.println(B.toString());
                }
                if (B.get(i) > -1) {
                    sum += max;
                }
            }
            System.out.println(sum);
            testCases--;
        }

    }
}
