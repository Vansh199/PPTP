//time complexity:O(n)
//space complexity:O(n)

import java.util.HashSet;

public class Candies {
     public static int distributeCandies(int[] candyType) {
         HashSet<Integer> uniqueCandies = new HashSet<>();
        
        for (int i = 0; i < candyType.length; i++) {
            uniqueCandies.add(candyType[i]);
        }
        
        return Math.min(uniqueCandies.size(), candyType.length / 2);
    }
    public static void main(String[] args) {
        int[] candyType = {1,1,2,2,3,3};
        System.out.println(distributeCandies(candyType));
    }
}
