import java.util.*;
class fibonacci {
    
    public static int fib(int n, int[] dp) {
        for(int i=0;i<=n;i++) {
            if(i<=1)
                dp[i] = i;
            else
                dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        System.out.println(fib(n, dp));
    }
}
