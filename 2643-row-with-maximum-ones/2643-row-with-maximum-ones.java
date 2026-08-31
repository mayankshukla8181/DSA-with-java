
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {

        int maxOnes = 0;
        int maxRowIndex = 0;
            // Ye rows ko traverse karega.
        for (int i = 0; i < mat.length; i++) {

            int count = 0;
               //Ye current row ke columns ko traverse karega.
            for (int j = 0; j < mat[i].length; j++) {
               // i-th row aur j-th column ki value
                if (mat[i][j] == 1) {
                    count++;
                }
            }

            /*Agar current row mein ones ki quantity ab tak ke maximum se zyada hai, to maximum ko update karo.*/
            if (count > maxOnes) {
                maxOnes = count;
                maxRowIndex = i;
            }
        }

        return new int[]{maxRowIndex, maxOnes};
    }
}