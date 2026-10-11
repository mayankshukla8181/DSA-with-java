public class climbingstairs {
    static int climbStairs(int n){
        // base case
        if(n==0  || n==1)
        return 1;
        // recursive call
        int ans = climbStairs(n-1)+climbStairs(n-2);
        return ans;
    }
    public static void main(String[] args) {
        int ans = climbStairs(5);
        System.out.println(ans);
    }
}