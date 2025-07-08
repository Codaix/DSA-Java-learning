package DAY23;
// we are in fst and have list of price in array. we need to tell the stock panning time of the ith stock and return the answer.
// stock spanning time :  number of days for which a current price is consecutively max.
// e.g. [100, 80, 70, 60, 75] for 70 if it was the max price then 1 will be the answer. now we check price before it. so its 60 so 70 is again the max so value goes up to 2.
// so we need to check the prices before and then say if it is max for how many days.
// we can use stack to keep a track of prices and their indices.
// from the array we will check the price and if it is less than the top of the stack then we will pop the stack and check for the next price.
// e.g. [100, 80, 70, 60, 75] for 75 we will check the stack and see that 60 is the top of the stack and it is less than 75 so we will pop it and check for the next price.
// we will keep popping the stack until we find a price that is greater than or equal to the current price.
// if we find a price that is greater than or equal to the current price then we will calculate the span.
// e.g. if the current price is 75 and the top of the stack is 60 then we will pop the stack and check for the next price.
// if the next price is 70 then we will pop the stack and check for the next price.
// if the next price is 80 then 80 is greater than 75. so, we stop and get out of the loop.
// if the next price is 100 then we will pop the stack and check for the next price.
// now we have reached the end of the stack and we will calculate the span.
// the span will be the difference between the current index and the index of the price that is greater than or equal to the current price.
import java.util.*;
public class FSTque {
    Stack<Integer> st = new Stack<>();
    public int[] maxSpan(int[] price){
        int[] span = new int[price.length];
        for(int i = 0; i < price.length; i++){
            if(st.isEmpty() || price[i] > price[st.peek()]){
                st.push(i);
                span[i] = i + 1;
            } else {
                while(!st.isEmpty() && price[i] <= price[st.peek()]){
                    st.pop();
                }
                if(st.isEmpty()){
                    span[i] = i + 1;
                } else {
                    span[i] = i - st.peek();
                }
            }
        }
        return span;
// this code calculates the stock span for each price in the array from the start to the end.
// it uses a stack to keep track of the indices of the prices and calculates the span based on the prices in the stack.
    }
}
