import java.util.HashSet;
//time complexity:O(n)
//space complexity:O(n)
public class Duplicates {
    public static boolean containsDuplicate(int[] nums) {
         HashSet<Integer> set = new HashSet<>();
    for (int num : nums) {
        if (set.contains(num)) {
            return true; // Found a duplicate
        }
        set.add(num);
    }
    return false;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        System.out.println(containsDuplicate(nums));

    }
}
