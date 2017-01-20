import DataStructure.Node;

/**
 * Created by Yiding Liu on 1/19/2017.
 */
public class OverlapRectangle {
    public static boolean hasOverlap(Node A, Node B, Node C, Node D)
    {
        int Xmax=Math.max(A.x,C.x);
        int Xmin=Math.min(B.x,D.x);

        int Ymax=Math.max(A.y,C.y);
        int Ymin=Math.min(B.y,D.y);

        if(Xmin<Xmax||Ymin<Ymax) return false;
        return true;
    }
}
