package com.qniyaz.mycalc;

public class PostfixEvaluator {

    public int evaluate(char[] postfix) {
        int n, r = 0;
        n = postfix.length;
        Stack<Integer> a = new Stack<Integer>();

        for (int i = 0; i < n; i++) {
            char ch = postfix[i];

            if (ch >= '0' && ch <= '9')
                a.push(ch - '0');
            else if (ch == ' ')
                continue;
            else {
                int x = a.pop();
                int y = a.pop();
                switch (ch) {
                    case '+':
                        r = x + y;
                        break;
                    case '-':
                        r = y - x;
                        break;
                    case '*':
                        r = x * y;
                        break;
                    case '/':
                        r = y / x;
                        break;
                    default:
                        r = 0;
                }
                a.push(r);
            }
        }
        r = a.pop();
        return (r);
    }
}