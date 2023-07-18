public class Question2 {
    public int[] searchRange(int[] nums, int target) {
        int firstOccurrence = findFirstOccurrence(nums, target);
        
        if (firstOccurrence == -1) {
            return new int[]{-1, -1};
        }
        
        int lastOccurrence = findLastOccurrence(nums, target);
        
        return new int[]{firstOccurrence, lastOccurrence};
    }
    
    private int findFirstOccurrence(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int firstOccurrence = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] >= target) {
                right = mid - 1;
                if (nums[mid] == target) {
                    firstOccurrence = mid;
                }
            } else {
                left = mid + 1;
            }
        }
        
        return firstOccurrence;
    }
    
    private int findLastOccurrence(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int lastOccurrence = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] <= target) {
                left = mid + 1;
                if (nums[mid] == target) {
                    lastOccurrence = mid;
                }
            } else {
                right = mid - 1;
            }
        }
        
        return lastOccurrence;
    }
}
    public static void main(String[] args) {
        
    }
}
