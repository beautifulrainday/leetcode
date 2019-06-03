package leetcode.simple;

/**
 * 给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。
 * 二叉搜索树保证具有唯一的值。
 * <p>
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class RangeSumBST {
    public static void main(String[] args) {
        //System.out.println(rangeSumBST());
    }

    static int sum;

    public static int rangeSumBST(TreeNodeBST root, int L, int R) {
        //int sum = 0;
        if (null != root) {
            if (root.val >= L && root.val <= R) {
                sum += root.val;
            }
            // sum += rangeSumBST(root.left, L, R);
            // sum += rangeSumBST(root.right, L, R);
            rangeSumBST(root.left, L, R);
            rangeSumBST(root.right, L, R);
        }
        return sum;
    }
}

class TreeNodeBST {
    int val;
    TreeNodeBST left;
    TreeNodeBST right;

    TreeNodeBST(int x) {
        val = x;
    }
}