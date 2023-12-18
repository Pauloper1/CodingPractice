/*
 * Platform: Codeforces
 * Problem Rating: 800
 * Problem link: https://codeforces.com/problemset/problem/282/A
 */

package Codeforces.Practice;

import java.util.Scanner;

public class Bits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        input.nextLine();
        int val = 0;
        while (testCases > 0) {
            
            String ops = input.nextLine();
            
            for(int i = 1; i < ops.length(); i+=3){
                if(ops.charAt(i) == '+'){
                    val++;
                } else if(ops.charAt(i) == '-') {
                    val--;
                }

            }
            testCases--;
        }
        input.close();
        System.out.println(val);
    }
}
