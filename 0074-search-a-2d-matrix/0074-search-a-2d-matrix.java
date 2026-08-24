class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int TotalRows = matrix.length;
        int TotalCols = matrix[0].length;

        int n = TotalRows * TotalCols;

        int s = 0;
        int e = n - 1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            int ColIndex = mid % TotalCols;
            int RowIndex = mid / TotalCols;

            if (matrix[RowIndex][ColIndex] == target) {
                return true;
            }

            else if (matrix[RowIndex][ColIndex] > target) {
                // left
                e = mid - 1;
            }

            else {
                // right
                s = mid + 1;
            }
        }

        return false;
    }
}