
import Hafta6.Stack;

public class InfixToPostfix2 {

    String output;
    String input;

    public InfixToPostfix2(String input) {
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
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty()
                        && stack.peek() != '(') {
                    output += stack.pop();
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && op(c)
                        <= op(stack.peek())) {
                    output += stack.pop();
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                return "Eksik parantez";
            }
            output += stack.pop();
        }
        return output;
    }

}
