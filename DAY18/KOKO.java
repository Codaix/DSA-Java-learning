package DAY18;

//By the time I solved this, the guards came back and Koko couldn't eat any of the bananas...

import java.util.*;

class Speed{
// no need just go for pile length public static long max = (int) 1e4;
// no need to store carry public static long carry[] = new long[(int) max];
public boolean kokoSpeed(long[] pile, long k, int h) {
    long bananaCount = 0;
    for(int i = 0; i<pile.length; i++){
        // no need for if(pile[i]-k <= 0){
            bananaCount += (pile[i]+k-1)/k;// this is the maths behind the hours.... take pile[i] = 20 and k as 6 to understand better.. it directly gives the greater decimal value or the ceil value.
    }
    if(bananaCount<=h){
        return true;
    }
        return false;
    }
}

public class KOKO {
    Scanner sc= new Scanner(System.in);
    int h = sc.nextInt();
    public static int max = (int) 1e9;
    long mid;
    long pile[] = new long [max];
    int high = max;
    int low = 1;
    Speed obj = new Speed();
    
    void process(){
        while (high-low > 1){
            mid = (high + low)/2;
            if(obj.kokoSpeed(pile, mid, h)){
                high = (int) mid;
            }
            else{
                low = (int) mid + 1;
            }
        }
        if(obj.kokoSpeed(pile, high, h)){
            System.out.println("Speed =" + high);
        }
        else{
            System.out.println("Speed = " + low);
        }
        sc.close();
    }
}
