//time complexity:O(n)
//space complexity:O(1)

public class MaximumProduct {
    public static int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        
        for (int num : nums) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }
            
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }
        
        int maxProduct = max1 * Math.max(max2 * max3, min1 * min2);
        int minProduct = min1 * min2 * max1;
        
        return Math.max(maxProduct, minProduct);
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(maximumProduct(nums));
    }
}
