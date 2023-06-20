//time complexity:O(n)
//space complexity:O(n)

import java.util.HashMap;

public class Harmonious {
    public static int findLHS(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Count the frequency of each number in nums
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int maxSubsequenceLength = 0;
        
        // Iterate over nums again and find the maximum subsequence length
        for (int num : nums) {
            int currentFrequency = frequencyMap.get(num);
            int nextFrequency = frequencyMap.getOrDefault(num + 1, 0);
            
            if (nextFrequency > 0) {
                int subsequenceLength = currentFrequency + nextFrequency;
                maxSubsequenceLength = Math.max(maxSubsequenceLength, subsequenceLength);
            }
        }
        
        return maxSubsequenceLength;
    }

   public static void main(String[] args) {
    int[] nums = {1,3,2,2,5,2,3,7};

    System.out.println(findLHS(nums));
   } 
}
