/*
 * Status: Time Limit Exceeded
 * Contest: STARTERS 114
 * Platform: Codechef
 */

package CodeChef.Contest.Contest3;

import java.util.*;
import java.lang.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        int tc = input.nextInt();
        while (tc > 0) {
            int size = input.nextInt();
            int arr[] = new int[size];
            for(int i = 0; i < size; i++){
                arr[i] = input.nextInt();
            }
            int arrChecker[] = new int[size];
            Arrays.fill(arrChecker, -1);
            int count = 0;
            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j < size; j++) {
                    if ((arr[i] > arr[j]) && arrChecker[j] != 1) {
                        count += 1;
                        arrChecker[j] = 1;

                    }
                }
            }
            System.out.println(count);
            tc--;
        }
    }
}