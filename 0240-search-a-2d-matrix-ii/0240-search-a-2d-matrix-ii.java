class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int totalRow= matrix . length ;
       int totalcol = matrix[0] . length;
       int row = 0;
    int col = totalcol - 1;
    // check krte time jis index peh ho aur uska number target se chota hua toh move to left agr bada hua toh move to down 
    
       while(row < totalRow && col >= 0){
        if(matrix[row][col] == target){
            return true ;
        }
        else if(matrix[row][col] > target){
            col --;
        }
        
        else {
            // matrix[rowes][cols] < target
            row ++;
        }
       }
        return false ;
       }
    }
