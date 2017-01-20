import java.util.Scanner;

/**
 * Created by dean on 1/14/2017.
 */
public class mainApp {
    public static void main(String args[]){
        Solution s=new Solution();
        System.out.println(s.computeArea(-2,-2,2,2,-1,-1,1,1));
    }
}
class Solution {
    class Node {
        public int x;
        public int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        return hasOverlap(new Node(A,B),new Node(C,D),new Node(E,F),new Node(G,H));
    }
    public int hasOverlap(Node A, Node B, Node C, Node D)
    {
        int Xmax=Math.max(A.x,C.x);
        int Xmin=Math.min(B.x,D.x);
        int x=Xmin-Xmax;

        int Ymax=Math.max(A.y,C.y);
        int Ymin=Math.max(B.y,D.y);
        int y=Ymin-Ymax;

        int a1=(B.x-A.x)*(B.y-A.y);
        int a2=(D.x-C.x)*(D.y-C.y);

        if(x<0||y<0) return a1+a2;
        return a2-(x*y)+a1;
    }
}