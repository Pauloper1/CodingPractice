package Codeforces.Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class capital {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        sb.replace(0, 1, Character.toString(sb.charAt(0)).toUpperCase());
        System.out.println(sb.toString());
    }
}
