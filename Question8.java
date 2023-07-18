import java.util.ArrayList;

public class Question8 {
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        int i = 0, j = 0, k = 0;
        ArrayList<Integer> result = new ArrayList<>();
        
        while (i < n1 && j < n2 && k < n3) {
            if (A[i] == B[j] && B[j] == C[k]) {
                if (result.isEmpty() || A[i] != result.get(result.size() - 1)) {
                    result.add(A[i]);
                }
                i++;
                j++;
                k++;
            } else if (A[i] <= B[j] && A[i] <= C[k]) {
                i++;
            } else if (B[j] <= A[i] && B[j] <= C[k]) {
                j++;
            } else {
                k++;
            }
        }
        
        return result;
    
    }
    public static void main(String[] args) {
        
    }
}
