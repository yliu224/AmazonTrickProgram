import DataStructure.TreeNode;

/**
 * Created by dean on 1/20/17.
 */
public class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null) return true;
        else if(p==null||q==null) return false;
        else return p.val==q.val&&isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

    /**
     * Check if q is a subtree of p
     * @param p
     * @param q
     * @return
     */
    public boolean isSubTree(TreeNode p,TreeNode q){
        if(p==null) return false;

        if(q==null) return true;

        return isSameTree(p,q)||isSameTree(p.left,q)||isSameTree(p.right,q);
    }
}
