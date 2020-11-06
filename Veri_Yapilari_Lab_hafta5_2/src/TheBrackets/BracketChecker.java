package TheBrackets;

public class BracketChecker {

    private String input;

    public BracketChecker(String input) {
        this.input = input;
    }

    public void check() {
        int size = this.input.length();
        Stack stack = new Stack(size);
        for(int i = 0; i < this.input.length(); i++) {
            char ch = this.input.charAt(i);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    stack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if (!stack.isEmpty()) {
                        char ch2 = stack.pop();
                        if ((ch == '}' && ch2 != '{') || (ch == ']' && ch2 != '[') || (ch == ')' && ch2 != '(')) {
                            System.out.println("Error: " + ch + " at " + i+1);
                        }
                    } else {
                        System.out.println("Error: " + ch + " at " + i+1);
                    }
                    break;
                default:
                    break;
            }
        }
        if (!stack.isEmpty()) {
            System.out.println("Error: missing right delimiter");
        }
        else{
            System.out.println("succesfull");
        }
    }

}
