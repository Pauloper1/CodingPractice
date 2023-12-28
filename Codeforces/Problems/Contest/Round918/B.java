package Codeforces.Problems.Contest.Round918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            for (int i = 0; i < 3; i++) {
                String row = br.readLine();
                if (row.contains("?")) {
                    int pos = row.indexOf("?");
                    if (pos == 0) {
                        if ((row.charAt(pos + 1) == 'A' && row.charAt(pos + 2) == 'B')
                        ||  (row.charAt(pos + 1) == 'B' && row.charAt(pos + 2) == 'A')
                        ) {
                            System.out.println('C');
                        } 
                        
                        
                        else if ((row.charAt(pos + 1) == 'A' && row.charAt(pos + 2) == 'C')
                        || (row.charAt(pos + 1) == 'C' && row.charAt(pos + 2) == 'A')
                        ) {
                            System.out.println('B');
                        } 
                        
                        
                        else if ((row.charAt(pos + 1) == 'B' && row.charAt(pos + 2) == 'C')
                        || (row.charAt(pos + 1) == 'C' && row.charAt(pos + 2) == 'B')
                        ) {
                            System.out.println('A');
                        }
                    } else if (pos == 1) {
                        if ((row.charAt(pos - 1) == 'A' && row.charAt(pos + 1) == 'B')
                        ||  (row.charAt(pos - 1) == 'B' && row.charAt(pos + 1) == 'A')
                        ) {
                            System.out.println('C');
                        } 
                        
                        
                        else if ((row.charAt(pos - 1) == 'A' && row.charAt(pos + 1) == 'C')
                        || (row.charAt(pos - 1) == 'C' && row.charAt(pos + 1) == 'A')
                        ) {
                            System.out.println('B');
                        } 
                        
                        
                        else if ((row.charAt(pos - 1) == 'B' && row.charAt(pos + 1) == 'C')
                        || (row.charAt(pos - 1) == 'C' && row.charAt(pos + 1) == 'B')
                        ) {
                            System.out.println('A');
                        }
                    } else if (pos == 2) {
                        if ((row.charAt(pos - 1) == 'A' && row.charAt(pos - 2) == 'B')
                        ||  (row.charAt(pos - 1) == 'B' && row.charAt(pos - 2) == 'A')
                        ) {
                            System.out.println('C');
                        } 
                        
                        
                        else if ((row.charAt(pos - 1) == 'A' && row.charAt(pos - 2) == 'C')
                        || (row.charAt(pos - 1) == 'C' && row.charAt(pos - 2) == 'A')
                        ) {
                            System.out.println('B');
                        } 
                        
                        
                        else if ((row.charAt(pos - 1) == 'B' && row.charAt(pos - 2) == 'C')
                        || (row.charAt(pos - 1) == 'C' && row.charAt(pos - 2) == 'B')
                        ) {
                            System.out.println('A');
                        }
                    }
                }

            }
        }

    }
}
