package Codeforces.Problems.Contest.RoundGoodBy2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            int m = Integer.parseInt(br.readLine());
            int[] num = new int[m];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int i = 0;
            while (st.hasMoreTokens()) {
                num[i] = Integer.parseInt(st.nextToken());
                if (i != 0) {
                    if (num[i] % 2 < 0.5) {
                        num[i] = Math.floorDiv((num[i] + num[i - 1]), 2) * 2;
                    } else {
                        num[i] = Math.ceilDiv((num[i] + num[i - 1]), 2) * 2;
                    }

                }
                ++i;
            }

            for (int j : num) {
                System.out.printf("%d ",j);
            }
            System.out.println();
        }
    }
}
