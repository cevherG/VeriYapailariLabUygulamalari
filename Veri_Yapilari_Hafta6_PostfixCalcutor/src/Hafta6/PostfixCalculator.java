package Hafta6;

public class PostfixCalculator {

    private Stack stack;
    private String input;

    public PostfixCalculator(String input) {
        this.input = input;
        this.stack = new Stack(this.input.length());
    }

    public int doCalculate() {
        char ch;
        int num1, num2, sum;
        for (int i = 0; i < this.input.length(); i++) {
            ch = this.input.charAt(i);
            if (ch >= '0' && ch <= '9') {
                this.stack.push(Character.getNumericValue(ch));
            } else {
                num1 = stack.pop();
                num2 = stack.pop();
                switch (ch) {
                    case '+':
                        sum = num1 + num2;
                        break;
                    case '-':
                        sum = num1 + num2;
                        break;
                    case '*':
                        sum = num1 * num2;
                        break;
                    case '/':
                        sum = num1 / num2;
                        break;
                    default:
                        sum = 0;
                        break;
                }
                stack.push(sum);
            }//end else
        }//end for
        sum=stack.pop();
        return sum;
    }//end doCalculate method

}//end class
