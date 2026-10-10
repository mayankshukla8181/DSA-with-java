public class fiboanccipractise {
    static int fib(int n){
        // base case
        if(n ==0)
        return 0;
     if(n==1)
        return 1;
        // recusive call
        int ans = fib(n-1)+fib(n-2);
        return ans ;
    }
    public static void main(String[] args) {
        int ans = fib(5);
        System.out.println(ans);
    }
}
