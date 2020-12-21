package hafta11.BinaryTree;

public class InfixToPostfix {

    private String input;
    private String output;
    private Stack stack;

    public InfixToPostfix(String input) {
        this.input = input;
        this.output = "";
        this.stack = new Stack(this.input.length());
    }

    public String doPostfix() {
        char ch;
        for (int i = 0; i < this.input.length(); i++) {
            ch = this.input.charAt(i);
            switch (ch) {
                case '+':
                case '-':
                    this.gotOper(ch, 1);
                    break;
                case '*':
                case '/':
                    this.gotOper(ch, 1);
                    break;
                case '(':
                    this.stack.pushChar(ch);
                    break;
                case ')':
                    this.gotParen(ch);
                    break;
                default:
                    this.output += ch;
                    break;
            }
        }
        while (!stack.isEmpty()) {
            output = output + stack.popChar();
        }
        return output;
    }

    public void gotOper(char opThis, int a1) {
        while (!this.stack.isEmpty()) {
            char operatorTop = this.stack.popChar();
            if (operatorTop == '(') {
                this.stack.pushChar(operatorTop);
                break;
            } else {
                int a2;
                if (operatorTop == '+' || operatorTop == '-') {
                    a2 = 1;
                } else {
                    a2 = 2;
                }
                if (a2 < a1) {
                    stack.pushChar(operatorTop);
                    break;
                } else {
                    output = output + operatorTop;
                }
            }
        }
        stack.pushChar(opThis);
    }

    public void gotParen(char ch) {
        while (!this.stack.isEmpty()) {
            char ch2 = this.stack.popChar();
            if (ch2 == '(') {
                break;
            } else {
                this.output += ch2;
            }
        }
    }
}

