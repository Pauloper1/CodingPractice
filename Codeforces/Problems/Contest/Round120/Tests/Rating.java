/*
 * Status: Not working
 */
package Codeforces.Problems.Contest.Round120.Tests;

import java.util.Scanner;

public class Rating {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tc = input.nextInt();
        input.nextLine();
        Solver solver = new Solver();
        while (tc > 0) {
            String a = input.nextLine();
            int[] vals = solver.solve(a);
            if (vals.length > 1) {

                System.out.print(vals[1]);
                System.out.print(" ");
                System.out.println(vals[0]);

            } else {
                System.out.println(vals[0]);
            }
            tc--;
        }
        input.close();
    }
}


/**
 *  Solver
 */
class  Solver {
    public int[] solve(String a){
        int val1Pos = 0;
        int val2Pos = -1;
        for(int i = 1; i < a.length(); i++){
            if(a.charAt(i) == '0'){
                continue;
            } 
                val2Pos = i;
                break;
        }

        if(val2Pos != -1){
            int val1 = Integer.parseInt(a.substring(val1Pos, val2Pos));
            int val2 = Integer.parseInt(a.substring(val2Pos, a.length()));
            if(val1 > val2){
                return new int[]{val1, val2};
            } else if(val1 < val2){
                return new int[]{val2, val1};
            } else {
                return new int[]{-1};
            }
        }
            return new int[]{-1};
    }
    
}