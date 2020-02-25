package leetcode.simple;

/**
 * 给定一个二叉树，找出其最大深度。
 * <p>
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 * <p>
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 * <p>
 * 3
 * /  \
 * 9   20
 * /  \
 * 15   7
 * 返回它的最大深度 3 。
 */
public class MaxDepth {

    private static TreeNode treeNode = new TreeNode(3);

    static {
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);
    }


    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int res;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        if (left > right) {
            left++;
            res = left;
        } else {
            right++;
            res = right;
        }
        //return left > right ? left + 1 : right + 1;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxDepth(treeNode));
    }
}
