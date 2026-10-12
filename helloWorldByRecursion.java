public class helloWorldByRecursion {
    static void printHelloWorld(int n){
        // base case
        if(n==0)
        return ;
        // recursive call
        System.out.println("Hello World");
        printHelloWorld(n-1);
    }
    public static void main(String[] args) {
        printHelloWorld(1000000);
    }
}