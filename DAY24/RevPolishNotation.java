package DAY24;
// ((a + b) * c) -> ab+c*
// ((a + b) * (c - d)) -> ab+c-d*
// we need to convert infix expression to postfix expression. using queue

//rules: ( -> push to stack
//        ) -> pop out all elements from stack until ( is found
// operand will be appended in answer string.
// if we have + or - then pop out all elements from stack until we find * or / or ( and then push the current element to stack.
// if we have * or / then pop out all elements from stack until we find ( and then push the current element to stack.
import java.util.*;
public class RevPolishNotation {
    String RevPolishNotation(String exp){
        Stack<Character> stk = new Stack<>();
        String op = "+-*?^%";
        String ans = "";
        for(int i = 0; i < exp.length(); i++){
            if(exp.charAt(i) == '(' || op.indexOf(exp.charAt(i)) != -1){
                if(op.indexOf(exp.charAt(i)) != -1){
                    if(!stk.empty() && op.indexOf(stk.peek()) != -1){
                        //evaluate the precidence
                        //assignment
                    }
                    else stk.push(exp.charAt(i));
                }
                else {
                    stk.push(exp.charAt(i));
                }
            }
            else {
                if(exp.charAt(i) == ')'){
                    while(!stk.isEmpty() && stk.peek() != '('){
                        ans += stk.pop();
                    }
                    stk.pop();
                }
                else ans += exp.charAt(i);
            }
        }
        while(!stk.isEmpty()){
            ans += stk.pop();
        }
        return ans;
    }
}