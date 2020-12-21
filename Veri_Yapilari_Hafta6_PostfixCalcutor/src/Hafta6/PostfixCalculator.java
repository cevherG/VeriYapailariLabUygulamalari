package Hafta6;

import Hafta6.Stack;

public class PostfixCalculator {

    private String input;
    private Stack stack;

    public PostfixCalculator(String input) {
        this.input = input;
        stack = new Stack(input.length());
    }

    public int doCalculate() {

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int a2 = stack.pop();
                int a1 = stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(a1 + a2);
                        break;

                    case '-':
                        stack.push(a1 - a2);
                        break;

                    case '/':
                        stack.push(a1 / a2);
                        break;

                    case '*':
                        stack.push(a1 * a2);
                        break;
                }
            }
        }
        return stack.pop();
    }
}

