package ReverseApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        String input="cevher";        
        Reverser r =new Reverser(input);
        System.out.println(r.doReverse());
        
    }

}
