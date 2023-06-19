import java.util.*;
//time complexity:O(n)
//space complexity:O(n)
public class TwoSum{
    public static int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        int[] result = new int[2];
        for(int i=0;i<n;i++){
            if(nums[i]==target && map.containsKey(0)){
                result[0]=i;
                result[1]=map.get(0);
                return result;
            }
            else if(map.containsKey(target-nums[i])){
                if(map.get(target-nums[i]) > i){
                    result[0]=i;
                    result[1]=map.get(target-nums[i]);
                    return result;
                }
            }
        } 
        return null;
    }
    public static void main(String[] args) {
       int[] nums = {2,7,11,15};
       int target = 9;
       System.out.println(twoSum(nums,target));
    }
}