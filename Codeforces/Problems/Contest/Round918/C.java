package Codeforces.Problems.Contest.Round918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int bucket = Integer.parseInt(br.readLine());
            int sum = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                    sum += Integer.parseInt(st.nextToken());
            }
            double sqroot = Math.sqrt(sum);
            if (sqroot == Math.floor(sqroot)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
