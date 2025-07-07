package DAY22;
import java.util.*;
public class BalanceString {
    boolean valid(String str){
        Stack<Character>stk = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                stk.push(str.charAt(i));
            }else{

                if(!stk.empty()){
                    if(check(stk.peek(), str.charAt(i))) stk.pop();
                    else return false;
                }else return false;
            }
        }
        return stk.isEmpty();
    }

    // Method to check if the opening and closing brackets match
    boolean check(Character open, char close) {
        if (open == '(' && close == ')') return true;
        if (open == '{' && close == '}') return true;
        if (open == '[' && close == ']') return true;
        return false;
    }
// follow up: if its false, we need to check after how many reversal we are supposed to do in order to make it balance?
// e.g.: if str = {({{[({(()}]}})} -> then we need to change only 1 and count = 1
//                {({{[({)()}]}})}
//                       ^          
    void balance(String str){
        //if we have balance string, at the last, we will have an empty stack
        //if stack is not empty, if the brakcet is open, we will push... if it is closing and no match is found, we will atill push.
        //the resultant stack will give pairs of bracket.. so, if we have like ))i.e. are same, only one traversal is required.
        // else if it is like )( then travelsal will be two.
    }

    int balanceParan(String str){
        Stack<Character> stk = new Stack<>();
        for(int i =0; i<str.length();i++){
            if(str.charAt(i) == '(') stk.push(str.charAt(i));
            else{
                if(!stk.empty() && stk.peek() == '(') stk.pop();
                else stk.push(str.charAt(i));
            }
        }
        int c = 0;
        while(!stk.empty()){
            char ch1 = stk.pop();
            char ch2 = stk.pop();
            if(ch1 == ch2) c++;
            else c+=2;
        }
        return c;
    }
}
