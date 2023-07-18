public class Question5 {
    public int majorityElement(int[] nums) {
        int maj_ele=nums[0];
        int maj_count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==maj_ele){
                maj_count++;
            }
            else{
                maj_count--;
                if(maj_count==0){
                    maj_ele=nums[i];
                    maj_count=1;
                }
            }
        }
        return maj_ele;
    }
    public static void main(String[] args) {
        
    }
}
