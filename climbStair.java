public class climbStair {
    static int climb(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return climb(n-1)+climb(n-2);
        }
    }
    public static void main(String[] args) {
        int ans=climb(5);
        System.out.println(ans);
    }
}