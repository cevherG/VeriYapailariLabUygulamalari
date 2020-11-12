package Hafta6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        System.out.print("Enter infix notation :");
        String input = br.readLine();

        InfixToPostfix intopost = new InfixToPostfix(input);

        String postfix = intopost.doPostfix();
        System.out.println("postfix : " + postfix);


    }

}
