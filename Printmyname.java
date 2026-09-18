public class Printmyname {
public static void main(int n ) {
        if(n==0){
            return ;   
        }
        System.out.println("mayank");

        Printmyname.main(n-1);  

    }
    public static void main(String[] args) {
        Printmyname.main(10);
    }
}