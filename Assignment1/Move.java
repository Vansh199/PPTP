//time complexity:O(n)
//space complexity:O(1)

public class Move {
    public static void moveZeroes(int[] nums) {
        int a=0;
        int temp;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                temp=nums[i];
                nums[i]=nums[a];
                nums[a]=temp;
                a++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        moveZeroes(nums);
    }
}
