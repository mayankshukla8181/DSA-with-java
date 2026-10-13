public class factorial{
    static int fact(int n){
        // case base 
        if (n==0 || n==1)
        return 1 ;
        // recursive call
        int ans = n *fact(n-1);
        return ans ;

    }
    public static void main (String[] args){
        int ans = fact(5);
        System.out.println(ans); 

    }
}