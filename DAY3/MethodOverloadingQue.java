package DAY3;
/* important data structure: tree, graph, Dynamic programming, try error.  
 * Hands On Practice on recursion:
 * 
 * 
 *
 * Que: n is provided and we need to find a factorial of it.
 * e.g.: n=5 result= 5*4*3*2*1 = 120
*/

public class MethodOverloadingQue {
    //iterative method:
    int returnFact(int n){
        int factorial = 0;
        while(n>=1){
            factorial = n * n-1;
            n--;
        
        }
        return factorial;
    }
    //recursive method:
    int returnFactRec(int n){
        // base
        if(n <= 1)return 1;
        // reursion
        int p = n*returnFactRec(n-1);
        // our part
        return p;
    }
    /*
     * Que: Fibbonacci series:
     * We are given n as the number and we need to return the nth fibonacci number.
     */
    // iterative
    int returnFibo(int n){
        int a = 0;
        int b = 1;
        while(n>1){
            
            for(int i = 3; i<=n; i++){
                int c = a+b;
                a = b;
                b = c;

            }
            
            
        }
        return b;
    }
    //recursive:
    int returnFiboRec(int n){
        if(n<=1)return 1;
        int sum1 = returnFiboRec(n-1);
        int sum2 = returnFiboRec(n-2);
        return sum1+sum2;
    
    }
    /*Que:
     * we have given string. we need to return the number occurance of a given character c.
     * e.g. if we have abcabcabc and char is c then result = 2
     *                 012345678
     */
    //iteractive
    int returnCharRec(String str, char c){ 
    for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                return i;  // return as soon as the first match is found
            }
        }
        return -1;  // return -1 if the character is not found
    }
    int returnCharRec(String str, char c, int i){
        //if(str.charAt(0)== 0)return 0; // only works if empty string
        //instead use:
        if(i>= str.length())return -1;
        if(str.charAt(i) == c)return i;
        //recursive: 
        int index = returnCharRec(str, c, i+1);
        // our part;
        return index;

    }
    // Homework: return the last occurance of a character in a sequence.
    int returnLastCharRec(String str, char c, int i){
        //here i = str.length()-1;
        if(i < 0||i>= str.length())return -1;
        if(str.charAt(i) == c)return i;
        int index = returnLastCharRec(str, c, i-1);
        return index;
    }
}

