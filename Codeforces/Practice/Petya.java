package Codeforces.Practice;

import java.util.Scanner;

public class Petya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        input.nextLine();
        String b = input.nextLine();
        System.out.println(new Solver().solve(a, b));
        input.close();
    }
}

/**
 * Solver
 */
class Solver {
    public int solve (String a, String b){
        a = a.toLowerCase();
        b = b.toLowerCase();
        int result = a.compareTo(b);
        if(result < 0) return -1;
        else if(result == 0 ) return 0;
        else return 1;
    }
    
}
