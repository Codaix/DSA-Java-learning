package DAY17;
class GetNum {
    int Square(int num) {
        if (num <= 3) return 1;
        int left = 1, right = num / 2;
        int ans = 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid; 
            if (square == num) {
                return mid;
            } else if (square < num) {
                ans = mid;
                left= mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}

public class sqrtQue {
    
}
