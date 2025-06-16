package DAY2;
/*DAY2of method overloading:
when we want to use multiple api's, we dont need to use different names
api's, indtead we use same name api and use method overloading saving the 
integrity of the code. 

varargs:
 *  helps us to use indefinite number of variables of the same type without
 * having the issue of specifying the number of variables.

anonymous methods:
 * methoods having no name.
 * arrow functions "()->" a.k.a lambda function.

recursive methods:
 * a technique where method calls itself with the smaller set of problem in 
 order to solve bigger problem. e.g.: we standing in a queue of n people. if someone asks
 the total number of people, we ask the person behind. this continues till the last person
 and the answer turns out to be 1. making the loop smaller each time.

 * steps: 
 * 1) write a base case: situation where to stop making further call
 * 2) recursive call and expect it to do its job. We assume it will solve the problem.
 * 3) our part in the condition.(interchangeable with step 2.)
 
 * 
 */
// recursive code
//iterative:
public class MethodOverloading{
    int returnNoOfDigit(int n){
    int c = 0;
    while(n>0){
    c++;
    n/=10;
    }
    return c;
    }
//recursive:
int returnNoOfDigitRec(int n){ // here we used with the overall n's...
    //use step 1 and get a base case:
    if(n >= 0 && n<=9) return 1;
    // use step2: recursive call:
    int d = returnNoOfDigitRec(n/10);/*here we reduced the n by 10 parts... 
    and recurse it until the n is reduced to one digit...
    making it impossible to do any furher recursive call.*/

    //use our part:
    return d+1;
}
    /*que: integer value, return the sum of all the digits. answer is 4:*/
    //iterative:
    int returnSumOfDigits(int n){
        int sum = 0;
        while(n>0){
            sum  += n%10;
            n/=10;
        }
        return sum;
    }
    //recursive:
    int returnSumOfDigitsRec(int n){
        //step 1: use a base case:
        if(n<=0) return 0;
        //step2: get a recursive call:
        int d = n%10 + returnSumOfDigitsRec(n/10);
        //our part;
        return d;
    }
    /*que: integer value n, return reverse of the number. e.g if n=123, result = 321 */

    //iterative:
    int returnReverse(int n){
        int rev = 0;
        while(n>0){
            int d = n%10;
            rev *= 10;
            rev += d;
            n /= 10;
        }
        return rev;
    }
    //global variable (if want to use)
    //int rev = 0;
    //with local parameter
    int returnReverseRec(int n, int rev){
        //s1: use base case
        if(n==0)return rev;
        //our part
        rev *= 10;
        rev += n%10;
        //step2: recursive
        return returnReverseRec(n/10, rev);
    }
}