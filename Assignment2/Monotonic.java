//time complexity:O(n)
//space complexity:O(1)

import java.net.Socket;

public class Monotonic {
    public static boolean isMonotonic(int[] nums) {
         boolean isIncreasing = true;
        boolean isDecreasing = true;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                isDecreasing = false;
            } else if (nums[i] < nums[i - 1]) {
                isIncreasing = false;
            }
            
            if (!isIncreasing && !isDecreasing) {
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        int[] nums={1,2,2,3};
        System.out.println(isMonotonic(nums));
        
    }
}
