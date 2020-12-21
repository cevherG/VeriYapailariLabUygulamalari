package Hafta6;

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
                    this.stack.push(ch);
                    break;
                case ')':
                    this.gotParen(ch);
                    break;
                default:
                    this.output += ch;
                    break;
            }//end switch
        }//end for
        /*
        while (!stack.isEmpty()) {
            output = output + stack.popChar();
        }
        return output;*/
        return this.output += this.stack.pop();
    }//end method

    public void gotOper(char opThis, int a1) {
        while (!this.stack.isEmpty()) {
            char operatorTop = this.stack.pop();
            if (operatorTop =='(') {
                this.stack.push(operatorTop);
                break;
            } else {
                int a2;
                if (operatorTop == '+' || operatorTop == '-') {
                    a2 = 1;
                } else {
                    a2 = 2;
                }
                if (a2 < a1) {
                    stack.push(operatorTop);
                    break;
                } else {
                    output = output + operatorTop;
                }
            }
        }
        stack.push(opThis);
    }

    public void gotParen(char ch) {
        while (!this.stack.isEmpty()) {
            char ch2 = this.stack.pop();
            if (ch2 == '(') {
                break;
            } else {
                this.output += ch2;
            }
        }
    }//end method
}//end class
