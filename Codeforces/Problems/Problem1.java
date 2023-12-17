/*
 * Problem link: https://codeforces.com/problemset/problem/158/A
 */

package Codeforces.Problems;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int k = input.nextInt();
        int []arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = input.nextInt();
        }
        input.close();
        int kVal = arr[k];
        int result = 0;
            for(int i = 0; i< size ; i++){
            if(arr[i] >= kVal && arr[i] > 0) result++;
        }
        System.out.println(result);

    }
}
