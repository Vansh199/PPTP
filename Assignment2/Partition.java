//time complexity:O(n log n)
//space complexity:O(1)

import java.util.Arrays;

public class Partition {
    public static int arrayPairSum(int[] nums) {
         // Sort the array in ascending order
        Arrays.sort(nums);
        
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        
        return sum;
    }
    public static void main(String[] args) {
        int[] nums={1,4,3,2};
        System.out.println(arrayPairSum(nums));
    }   
}