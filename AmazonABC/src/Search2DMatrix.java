/**
 * Created by Yiding Liu on 1/19/2017.
 */
public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0||matrix==null) return false;
        int column=matrix[0].length;

        int l=0,r=matrix[0].length*matrix.length-1;

        while(l<=r){
            int m=l+(r-l)/2;
            int i=m/column;
            int j=m%column;

            if(matrix[i][j]==target) return true;
            else if(matrix[i][j]>target) r=m-1;
            else l=m+1;
        }
        return false;
    }
}
