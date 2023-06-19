//time complexity:O(n)
//space complexity:O(1)

public class MisMatch {
    public static int[] findErrorNums(int[] nums){
    int n = nums.length;
    int xorResult = 0;
    for (int i = 1; i <= n; i++) {
        xorResult ^= i; // XOR of numbers from 1 to n
    }
    for (int num : nums) {
        xorResult ^= num; // XOR of nums and numbers from 1 to n
    }
    
    int rightmostSetBit = xorResult & -xorResult; // Get the rightmost set bit
    
    int missingNum = 0;
    int duplicatedNum = 0;
    for (int num : nums) {
        if ((num & rightmostSetBit) != 0) {
            duplicatedNum ^= num; // XOR of numbers with the rightmost set bit
        } else {
            missingNum ^= num; // XOR of numbers without the rightmost set bit
        }
    }
    for (int i = 1; i <= n; i++) {
        if ((i & rightmostSetBit) != 0) {
            duplicatedNum ^= i; // XOR of numbers from 1 to n with the rightmost set bit
        } else {
            missingNum ^= i; // XOR of numbers from 1 to n without the rightmost set bit
        }
    }
    
    for (int num : nums) {
        if (num == duplicatedNum) {
            return new int[]{duplicatedNum, missingNum};
        }
    }
    
    return new int[]{missingNum, duplicatedNum};
}
    public static void main(String[] args) {
        int[] nums={1,2,2,4};
        System.out.println(findErrorNums(nums));
    }
}
