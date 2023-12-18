package Codeforces.Problems.Contest.Round915;

import java.util.Scanner;

public class Zelda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        while (testCases > 0) {
            int nodes = input.nextInt();
            int []u = new int[nodes];
            int []v = new int[nodes];

            for(int i = 0; i < nodes- 1; i++){
                u[i] = input.nextInt();
                v[i] = input.nextInt();
            }

            int noLeaf = 0;
            for(int i = 0; i < nodes- 1; i++){
                boolean InU = false;
                for(int j = 0; j < nodes - 1; j++){
                    int right = v[i];
                    int left = u[j];
                    if(right == left){
                         InU = true;
                         break;
                        }
                }
                if(!InU){
                    noLeaf++;
                }
                
            }
            System.out.println(Math.ceilDiv(noLeaf, 2));
            testCases--;
        }
        input.close();
    }
}
