package leetcode.simple;


/**
 * 给定有序数组: [-10,-3,0,5,9],
 * <p>
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 * <p>
 * 0
 * / \
 * -3   9
 * /   /
 * -10  5
 */
public class SortedArrayToBST {

    public static void main(String[] args) {
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode r = sortedArrayToBST(nums);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null) {
            return null;
        }
        TreeNode t = handle(0, nums.length - 1, nums);
        return t;


       /* TreeNode t2 = helper(nums,0, nums.length - 1);
        return t2;*/
    }

    private static TreeNode handle(Integer start, Integer end, int[] arr) {
        if (end - start < 0) {
            return null;
        }
        Integer middlePosition = (end + start) / 2;
        TreeNode t = new TreeNode(arr[middlePosition]);
        t.left = handle(0, middlePosition - 1, arr);
        t.right = handle(middlePosition + 1, end, arr);
        return t;
    }

    private static TreeNode helper(int[] nums, int left, int right) {
        if (left > right)
            return null;
        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, left, mid - 1);
        node.right = helper(nums, mid + 1, right);
        return node;
    }

}
