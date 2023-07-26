import java.util.ArrayList;
import java.util.List;

public class Question8 {
    private List<Integer> prefixProduct;
    public ProductOfNumbers() {
         prefixProduct = new ArrayList<>();
        prefixProduct.add(1);
    }
    
    public void add(int num) {
       if (num == 0) {
            prefixProduct.clear(); // Reset the prefix product list if encountering 0.
            prefixProduct.add(1); // Initialize with the product of 0 numbers (1).
        } else {
            int lastProduct = prefixProduct.get(prefixProduct.size() - 1);
            prefixProduct.add(lastProduct * num);
        } 
    }
    
    public int getProduct(int k) {
        int n = prefixProduct.size();
        if (k >= n) {
            return 0; // If k is larger than the stream size, the product will always be 0.
        }

        int lastProduct = prefixProduct.get(n - 1);
        int kStepsEarlierProduct = prefixProduct.get(n - k - 1);
        return lastProduct / kStepsEarlierProduct;
    }
    public static void main(String[] args) {
        
    }
}
