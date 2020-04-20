package leetcode.simple;

/**
 * 给定二叉搜索树（BST）的根节点和一个值。 你需要在BST中找到节点值等于给定值的节点。 返回以该节点为根的子树。 如果节点不存在，则返回 NULL。
 * <p>
 * 例如，
 * <p>
 * 给定二叉搜索树:
 * <p>
 * 4
 * /  \
 * 2    7
 * /  \
 * 1    3
 * <p>
 * 和值: 2
 * 你应该返回如下子树:
 * <p>
 * 2
 * / \
 * 1   3
 * 在上述示例中，如果要找的值是 5，但因为没有节点值为 5，我们应该返回 NULL。
 */
public class SearchBST {

    public static void main(String[] args) {
        TreeNode rootNode = new TreeNode(4);
        TreeNode twoLeft = new TreeNode(2);
        TreeNode twoRight = new TreeNode(7);
        rootNode.left = twoLeft;
        rootNode.right = twoRight;
        twoLeft.left = new TreeNode(1);
        twoLeft.right = new TreeNode(3);
        TreeNode t = searchBST(rootNode, 2);
        if (t == null) {
            System.out.println("null");
        } else {
            System.out.println(t.val);
        }
    }

    private static TreeNode searchBST(TreeNode root, int val) {
        if (root != null) {
            Integer value = root.val;
            if (val == value) {
                return root;
            }
            if (val > value) {
                return searchBST(root.right, val);
            }
            return searchBST(root.left, val);
        }
        return null;
    }
}
