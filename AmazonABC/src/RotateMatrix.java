/**
 * Created by dean on 1/20/17.
 */
public class RotateMatrix {
    public void rotate(int[][] matrix,int flag) {
        if(matrix==null||matrix.length<=1) return;

        int m=matrix.length,n=matrix[0].length;
        int[][] newM=new int[n][m];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(flag==1) {
                    //flag is 1,then right rotate
                    int newj = m - i - 1;
                    int newi = j;
                    newM[newi][newj] = matrix[i][j];
                }
                else{
                    //left rotate
                    int newi=n-j-1;
                    int newj=i;
                    newM[newi][newj]=matrix[i][j];
                }
            }
        }
        matrix=newM;
    }
}
