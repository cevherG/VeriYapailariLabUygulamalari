
package TheBrackets;

public class Main {

    public static void main(String[] args) {
        String input2="a[s{h(m)k}p]z";
        String input="(";
        BracketChecker bc=new BracketChecker(input);
        bc.check();
    }
    
}
