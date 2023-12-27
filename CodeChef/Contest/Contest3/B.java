/*
 * Status: Time Limit Exceeded
 * Contest: STARTERS 114
 * Platform: Codechef
 */

package CodeChef.Contest.Contest3;

import java.util.*;
import java.lang.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            int size = Integer.parseInt(br.readLine());
            int arr[] = new int[size];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int count = 0;

            for (int i = 0; i < size - 1; i++) {
                int right = i + 1;
                while (right < size && arr[right] < arr[i] && arr[i] != -1) {
                    arr[right] = -1;
                    right += 1;
                    count += 1;
                }
            }
            sb.append(count).append("\n");
        }

        System.out.print(sb.toString());
    }
}