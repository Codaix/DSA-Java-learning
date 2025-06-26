package DAY15;
// time complexity is the amount of time an algorithm will take to perform a function on a set of input
// ways to calculate: 2
// 1. experimental: giving different ranges of input and checking what si the average time it takes
// 2. theoretical : we use certain rules. 
//                                       1. use big O always
//                                       2. Always us ethe worst case
//                                       3. Biggest time complexity a program has.

// let's say we need to get a factorial n! = n*n-1*n-2*n-3*....*1
// if we wirte an algo using looping for it, we get total time taken = nC where C is constant.
// we ignore the C and wirte the complexity as  O(n).
// the real problem is with time complexity of recursive algo for which we need to get a recurrance relation.
// for which master's theoram helps.
