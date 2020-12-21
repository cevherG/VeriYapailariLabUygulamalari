package hafta11.BinaryTree;

public class InfixToPostfix {

    String output;
    String input;

    public InfixToPostfix(String input) {
        this.input=input;
        output="";
    }
    
    public int op(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }

    public String doPostfix() {
        Stack stack=new Stack(input.length());
        for (int i = 0; i < input.length(); ++i) {
            char c = input.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                output += c;
            } else if (c == '(') {
                stack.pushChar(c);
            } else if (c == ')') {
                while (!stack.isEmptyChar()
                        && stack.peekChar() != '(') {
                    output += stack.popChar();
                }
                stack.pop();
            } else {
                while (!stack.isEmptyChar() && op(c)
                        <= op(stack.peekChar())) {
                    output += stack.pop();
                }
                stack.pushChar(c);
            }
        }
        while (!stack.isEmptyChar()) {
            if (stack.peekChar() == '(') {
                return "Eksik parantez";
            }
            output += stack.pop();
        }
        return output;
    }

}
