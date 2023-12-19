package Codeforces.Problems.Contest.Round916;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tc = input.nextInt();
        while (tc > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            System.out.println(new Solver().solve(n, k).toString());
            tc--;
        }
    }
}

/**
 * Solver
 */
class Solver {
    public int[] solve(int n, int k) {
        int []arr = new int[n];
        int noOfsections = n/k;

        int sectionCen = noOfsections/2;
        //put max vales
        for(int i = 0; i < k; i++){
            
        }
         return new int[]{};

    }
}