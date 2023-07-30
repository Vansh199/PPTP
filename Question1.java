import java.util.ArrayList;
import java.util.List;

public class Question1{
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
       List<Integer> result = new ArrayList<>();
        int left = 0;
        int right = arr.length - 1;

        // Find the closest element to x using binary search
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        // Initialize left and right pointers for the k closest elements
        left = right - 1;
        right = right;

        // Extend the window towards both ends to find k closest elements
        while (k > 0) {
            if (left >= 0 && right < arr.length) {
                int diffLeft = Math.abs(arr[left] - x);
                int diffRight = Math.abs(arr[right] - x);
                if (diffLeft <= diffRight) {
                    result.add(0, arr[left]);
                    left--;
                } else {
                    result.add(arr[right]);
                    right++;
                }
            } else if (left >= 0) {
                result.add(0, arr[left]);
                left--;
            } else if (right < arr.length) {
                result.add(arr[right]);
                right++;
            }
            k--;
        }

        return result; 
    }
    public static void main(String[] args) {
        
    }
}