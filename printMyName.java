public class printMyName {
    static void printmyname(int n){
        // base case
        if(n==0)
        return;
        // recursive call
        printmyname(n-1);
        System.out.println("mayank");
    }
    public static void main(String[] args) {
        printmyname(10);
    }
}