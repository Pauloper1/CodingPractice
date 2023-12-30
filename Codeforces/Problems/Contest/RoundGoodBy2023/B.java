package Codeforces.Problems.Contest.RoundGoodBy2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            BigInteger a = new BigInteger(st.nextToken());
            BigInteger b = new BigInteger(st.nextToken());
            int compareResult = a.compareTo(b);
            BigInteger i = BigInteger.valueOf(2);
            if (compareResult > 0) {
                for (; i.compareTo(a) < 0; i = i.add(BigInteger.ONE)) {
                    BigInteger mulResult = a.multiply(i);
                    if (mulResult.remainder(b).intValue() == 0) {
                        System.out.println(mulResult);
                        break;
                    }

                }
            } else {
                for (; i.compareTo(b) <= 0; i = i.add(BigInteger.ONE)) {
                    BigInteger mulResult = b.multiply(i);
                    if (mulResult.remainder(a).intValue() == 0) {
                        System.out.println(mulResult);
                        break;
                    }

                }

            }
        }
    }
}
