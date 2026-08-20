public class EkoSpoj {
     static boolean isValidAns(int[] trees , int m , int maxheight ) {
        int totalwoodCollected  = 0;
       for(int i = 0; i < trees.length; i++){
        if(trees[i] > maxheight){
            totalwoodCollected += trees[i] - maxheight;
            totalwoodCollected += trees[i] - maxheight;
        }
       }
       if(totalwoodCollected >= m){
        return true;
       }
       else{
        return false;
       }
    }
public int maxSawHeight(int[] trees, int m) {
    int s = 0;
    int n = trees.length;
    int maxi = -1;
    for(int i = 0; i < n; i++){
       if(trees[i] > maxi){
        maxi = trees[i];
       }
    }
    int e = maxi;
    int ans = -1;

    while (s <= e) {
        int mid = s + (e - s) / 2;

        if (isValidAns(trees, m, mid)) {
            ans = mid;
            s = mid + 1;
        } else {
            e = mid - 1;
        }
    }
    return ans;
}
         public static void main(String[] args) {
        int[] trees = {20, 15, 10, 17};
        int m = 7;
        EkoSpoj eko = new EkoSpoj();
        System.out.println(eko.maxSawHeight(trees, m));
         }
}