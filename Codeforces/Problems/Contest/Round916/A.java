package Codeforces.Problems.Contest.Round916;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tc = input.nextInt();
        while (tc > 0) {
            int len = input.nextInt();
            input.nextLine();
            String log = input.nextLine();
            System.out.println(new Solver().solve(len, log));
            tc--;
        }
        input.close();
    }

}

/**
 * Solver
 */
class Solver {
    public int solve(int len, String log) {
        int pSolved = 0;
        int initial = 0;
        int last = 0;
        int preChar = 0;
        int []done = new int[len];
        int counter = 0;
        for (int i = 1; i <= log.length(); i++) {
            last = i;
            int charVal = (int) log.charAt(i - 1) - 64;
            //check if character already exists
            boolean isContinue = checker(done, charVal, len);

            if (isContinue) {
                boolean diff = last - initial >= charVal;
                if (diff) {
                    pSolved++;
                    initial = i;
                    preChar = (int) log.charAt(i - 1);
                    done[counter] = charVal;
                    counter++;
                    while (i < log.length() && (int) log.charAt(i - 1) == (int) log.charAt(i)) {
                        i++;
                    }
                }
            }

        }
        return pSolved;
    }

    private boolean checker(int[] done, int charVal, int len) {
        for (int j = 0; j < len; j++) {
            if (done[j] == charVal) {
                return false;
            }
        }
        return true;
    }
}