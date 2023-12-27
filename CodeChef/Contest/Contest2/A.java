package CodeChef.Contest.Contest2;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
       
		// your code goes here
		Scanner input = new Scanner(System.in);
		int tc = input.nextInt();
		while(tc > 0){
		    int val = input.nextInt();
		    int rem = val%3;
		    int q = Math.floorDiv(val, 3);
            int back = val - (q-1)*3;
		    if(rem == 0){
		        System.out.println("YES");
		    } else if(back%4 == 0){
		        System.out.println("YES");
		    } else {
		        System.out.println("NO");
		    }
		    tc--;
		}
		input.close();
    }
    
}
