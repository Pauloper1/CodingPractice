package Codeforces.Problems.Contest.Round918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int len = Integer.parseInt(br.readLine());
            StringBuilder builder = new StringBuilder(br.readLine());
            int right = 0;
            for(int i = 0;i < len - 1 ; i++){
                char currentChar = builder.charAt(i);
                boolean vow = (currentChar == 'a' || currentChar == 'e');

                char nextChar = builder.charAt(i + 1);
                boolean nextCharCon = !(nextChar == 'a' || nextChar == 'e');


                char nextNextChar = builder.charAt(i + 2);
                boolean nextNextCharCon = !(nextNextChar == 'a' || nextNextChar == 'e');

                if(vow && nextCharCon && nextNextCharCon){
                    i += 1;
                    len += 1;
                    builder.insert(i, ".");
                } else if (vow && nextCharCon && !nextNextCharCon){
                    len += 1;
                    builder.insert(i, ".");
                }
            }
            System.out.println(builder.toString());
        }
    }
}
