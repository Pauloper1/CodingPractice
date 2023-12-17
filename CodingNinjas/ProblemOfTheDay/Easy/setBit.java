package CodingNinjas.ProblemOfTheDay.Easy;

import java.util.* ;
import java.io.*; 
public class setBit {
	public static int countSetBits(int n) {
		int ones = 0;
		int n_ = n;
		while(n_ > 0){
			int q = Math.floorDiv(n_, 2);
			int rem = n_%2;
			n_ = q;
			if(rem == 1){ 
				ones++;
				}
		}
		return(ones);
	}
}

