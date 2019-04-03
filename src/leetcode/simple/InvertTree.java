package leetcode.simple;

/**
 * 翻转一棵二叉树。
 */
public class InvertTree {

    public static void main(String[] args) {
        invertTree(new TreeNode(1));
    }

    public static TreeNode invertTree(TreeNode root) {
        TreeNode temp;
        if (null == root) return null;
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
