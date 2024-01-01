package Codeforces.Problems.Contest.PinelyD1D2;

/*
 * Platform: Codeforces
 * Contest: Pinely Round 3 (Div. 1 + Div. 2)
 * Status: Test 2 failed
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int sp = Integer.parseInt(br.readLine());
            int[] quadrants = new int[] { 0, 0, 0, 0 };
            while (sp-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                if (x >= 0 && y >= 0) {
                    quadrants[0] = 1;
                } else if (x <= 0 && y >= 0) {
                    quadrants[1] = 1;
                } else if (x <= 0 && y <= 0) {
                    quadrants[2] = 1;
                } else if (x >= 0 && y <= 0) {
                    quadrants[3] = 1;
                }

            }
            int sum = 0;
            for (int i = 0; i < quadrants.length; i++) {
                if (quadrants[i] == 1) {
                    sum += 1;
                }
            }
            if (sum > 2) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
