package DAY22;
// we need to check for redundant pair of brackets in the expression or not.
// 
// when we don't have a pair : (a+b) or (a+b)*c
// when we have a pair : ((a+b)) or (a+b)*(c+d) this is a redundant pair of brackets because 
// it can be removed without changing the meaning of the expression.
// the approach is to use a stack and check for the brackets. if we find a pair of brackets
// we will check if there is any operator in between them. if there is an operator then we will
// return false. if there is no operator then we will return true.
import java.util.Stack;

public class que {
    public static boolean checkRedundantBrackets(String expression) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : expression.toCharArray()) {
            if (ch == ')') {
                boolean hasOperator = false;
                while (!stack.isEmpty() && stack.peek() != '(') {
                    char top = stack.pop();
                    if (top == '+' || top == '-' || top == '*' || top == '/' || top == '%') {
                        hasOperator = true;
                    }
                }
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                if (!hasOperator) {
                    return true;
                }
            } else {
                stack.push(ch);
            }
        }
        return false;
    }
}
