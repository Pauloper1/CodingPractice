package Codeforces.Practice;
/*
 * Problem Link: https://codeforces.com/problemset/problem/263/A
 * Problem Platform: Codeforces
 * Problem Rating: 800
 */
import java.util.Scanner;

public class Domino {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        System.out.println((int)m*n/2);
        input.close();
    }

}
