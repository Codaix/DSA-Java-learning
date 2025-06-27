package DAY16;
// e.g. we need to gind factorial of a number, for which we need to have 
// an if statement, factorial recursive call and need to multiply the number.
// so we have c1, c2, c3 as our total times.
// => T(n) = C1 + C2 + C3 => C + T(n-1)
// Similarly, we can get the T(n-1) = C + T(n-2)  ...(1)
//                     :
//                     :
//                     :
//                     T(1) = C
// Now, solving equation ...(1), and adding all the equation, we get 
// T(n) + t(n-1) +T(n-2)+....+T(1) = nC + (n-1) + (n-2) +...+T(1)
// solving it, we have T(n) = nC
// => T(n) = O(n).
public class RecursiveTime {
    
}
