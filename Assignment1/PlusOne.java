//time complexity:O(n)
//space complexity:O(n)


public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] new_number=new int[digits.length+1];
        new_number[0]=1;
        return new_number;
    }
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        System.out.println(plusOne(digits));
    }
}
