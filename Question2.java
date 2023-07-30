public class Question2 {
    private static final int MOD = 1000000007;
    public int numOfWays(int[] nums) {
        int n = nums.length;
        long[][] dp = new long[n + 1][n + 1];
        
        // Base case: there's only one way to reorder an empty array.
        dp[0][0] = 1;
        
        // Fill the dp array using dynamic programming.
        for (int i = 1; i <= n; i++) {
            dp[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % MOD;
            }
        }
        
        // Calculate the total number of ways to reorder nums and get the same BST.
        int totalWays = 0;
        for (int i = 0; i < n; i++) {
            int leftSubtreeSize = i;
            int rightSubtreeSize = n - i - 1;
            
            // Calculate the number of ways to reorder the left and right subtrees.
            long leftWays = dp[leftSubtreeSize][i];
            long rightWays = dp[rightSubtreeSize][i];
            
            // Calculate the number of ways to reorder the entire array.
            long waysForRoot = (leftWays * rightWays) % MOD;
            
            // Update the total number of ways.
            totalWays = (totalWays + (int) waysForRoot) % MOD;
        }
        
        return totalWays;
    }
}
