package Codeforces.Practice;

/*
 * Problem Link: https://codeforces.com/problemset/problem/339/A
 * Problem Rating: 800
 * Improve Status: False
*/
import java.util.Arrays;
import java.util.Scanner;


public class helpfulmath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        String []arrString = string.split("\\+");
       
        int []IntArr = new int[arrString.length];

        for(int i = 0; i < arrString.length; i++){
            IntArr[i] = Integer.parseInt(arrString[i]);
        }
        Arrays.sort(IntArr);
        for(int i = 0; i < IntArr.length; i++){
            if(i == IntArr.length - 1){
                System.out.printf("%d",IntArr[i]);
            } else {
                System.out.printf("%d+",IntArr[i]);
            }
        }
        
    }
}


