package Codeforces.Practice;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        int size = 5;
        int iLoc = 0;
        int jLoc = 0;
        int [][]matrix = new int[size][size];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < size;i++){
            for(int j = 0; j < size; j++){
                int val = input.nextInt();
                if(val == 1){
                    iLoc = i;
                    jLoc = j;
                }
                matrix[i][j]  = val;
            }
        }
        System.out.println(Math.abs(iLoc - 2) + Math.abs(jLoc - 2));
    }

}
