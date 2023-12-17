package Codeforces.Problems.Contest.Round915;

import java.util.Scanner;

public class contest {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int testCases = input.nextInt();
        while(testCases >0){
            int n = input.nextInt();
            int m = input.nextInt();
            System.out.println(n>m?n:m);
            testCases--;
        }
    }
}
