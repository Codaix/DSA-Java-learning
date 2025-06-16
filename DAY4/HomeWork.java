package DAY4;

public class HomeWork{
//previous day3 homework
    // Homework: return the last occurance of a character in a sequence.
    int returnLastCharRec(String str, char c, int i){
        //here i = str.length()-1;
        if(i < 0||i>= str.length())return -1;
        if(str.charAt(i) == c)return i;
        int index = returnLastCharRec(str, c, i-1);
        return index;
    }
    //other method:
    // base:
    int returnLastCharRec2(String str, char c, int i){
    if(i>= str.length()) return -1;//checks if the integer is greater than the length.
    int index = returnLastCharRec(str,c,i+1);//checks if the character c matches with any charcter at str from i+1 to n-1 and returns the last occurance.
    if(index == -1 && str.charAt(i) == c) index = i;//checks only when we do not find the charcter in the string. and checks if the character is at index i
    return index;

}
}