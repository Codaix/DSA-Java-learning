package DAY18;
import java.util.*;

class Speed{
public boolean minWeight(long[] weights, long maxW, int days) {
    long weightCount = 0;
    int d = 1;
    for(int i = 0; i<weights.length; i++){
            if(weightCount + weights[i] < maxW){
                d++;
                weightCount = weights[i];
            }
            else{
                weightCount += weights[i];
            }
        }
        return d <= days;
}

public class Que {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        long[] weights = new long[n];
        int maxW = 0;
        for(int i = 0; i<n; i++){
            weights[i] = sc.nextLong();
            maxW = (int)Math.max(maxW, weights[i]);
        }
        int days = sc.nextInt();
        long low = 1;
        long high = maxW;
        long mid;
        Speed obj = new Speed();
        while (high - low >= 1){
            mid = (high + low)/2;
            if(obj.minWeight(weights, maxW, days)){
                high = mid;
            }
            else{
                low = mid +1;
            }
        }
        System.out.println("Min weight: "+ high);
        sc.close();
    }
}
}
