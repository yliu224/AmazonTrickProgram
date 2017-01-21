import DataStructure.TreeNode;

/**
 * Created by dean on 1/20/17.
 */
public class BSTMinimun {
    public int DFS(TreeNode root)
    {
        if(root == null) return 0;
        else return root.val + Math.min(DFS(root.left), DFS(root.right));
    }
}
