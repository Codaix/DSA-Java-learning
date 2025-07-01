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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of piles: ");
        int n = sc.nextInt();

        long[] pile = new long[n];
        int maxPile = 0;
        System.out.println("Enter the piles:");
        for (int i = 0; i < n; i++) {
            pile[i] = sc.nextLong();
            maxPile = (int)Math.max(maxPile, pile[i]);
        }
        System.out.print("Enter number of hours (h): ");
        int h = sc.nextInt();   
        long low = 1;
        long high = maxPile;
        long mid;
        Speed obj = new Speed();      
        while (high - low >= 1) {
        mid = (high + low) / 2;
        if (obj.kokoSpeed(pile, mid, h)) { 
            high = mid;
            } else {
                low = mid + 1;
            }
            }

    System.out.println("Minimum speed = " + high);
    sc.close();
}
}
