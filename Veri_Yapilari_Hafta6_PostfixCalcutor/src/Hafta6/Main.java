package Hafta6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        System.out.print("Enter postfix notation : ");
        String input = br.readLine();

        PostfixCalculator p = new PostfixCalculator(input);
        int a = p.doCalculate();

        System.out.println(" " + a);
    }

}
