
package CodingNinjas.ProblemOfTheDay.Moderate;

import java.util.Scanner;

class SpecialStrin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        while (testCases >0) {
            String s = input.nextLine();
            int n = input.nextInt();
            int p = input.nextInt();

            System.out.println(specialString(s, n, p));
            testCases--;
        }
        input.close();
    }
    public static String specialString(String s, int n, int p) {
		//1. create all possible strings
		//2. check if the string has palindrone
        int noDiffCount = 0;
        int countMul = 1;
        for(int i = 0; i < s.length(); i++){
            int diff = (int)s.charAt(i) - (60 + p); 
            if(diff == 0){
                noDiffCount ++;
            }else{
                countMul *= diff;
            }
        }

        int iteration = countMul + noDiffCount;
		StringBuilder stringbuilder = new StringBuilder(s);

        int pointer = 0;
        for(int i = 0; i < iteration ; i++){
            if( (int)stringbuilder.charAt(pointer) == (p+60)){
                pointer++;
                continue;
            }
            stringbuilder.replace(pointer, pointer+1, Character.toString(stringbuilder.charAt(pointer)+1));

            outerLoop:
            for(int j = pointer; j < stringbuilder.length(); j++){
                for(int k = pointer + 1; k < stringbuilder.length(); k++ ){
                    boolean isPalin = isPalindrome(stringbuilder.substring(j, k));
                    if(!isPalin){
                        break outerLoop;
                    }
                }
            }


        }
        return stringbuilder.toString();
	}
    public static boolean isPalindrome(String a){
		if(a.length() < 1){
            return true;
        } else {
            if(a.charAt(0) == a.charAt(a.length() - 1)){
                return isPalindrome(a.substring(1, a.length() - 1));
            } else {
                return false;
            }
        }
	}
    
}