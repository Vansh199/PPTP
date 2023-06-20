//time complexity:O(n)
//space complexity:O(1)

public class Flowers {
     public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0){
            return true;
        }
       int count = 0;  // Count of flowers that can be planted
        int i = 0;

        while (i < flowerbed.length) {
            // Check if the current plot is empty and its adjacent plots are also empty
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;  // Plant a flower
                count++;  // Increment the count of planted flowers

                if (count >= n) {
                    return true;  // Reached the required number of flowers
                }
            }

            i++;
        }

        return false;  // Cannot plant the required number of flowers
    }
    public static void main(String[] args) {
        int[] flowerbed={1,0,0,0,1};

        System.out.println(canPlaceFlowers(flowerbed, flowerbed.length));
    }
}
