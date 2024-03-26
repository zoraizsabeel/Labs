public class isValid {
    public static boolean isValidBST(TreeNode root)
    {

        if(root == null)
        {
            return true;
        }
        if((root.left == null || root.left.val < root.val) && (root.right == null || root.right.val > root.val))
        {
            return isValidBST(root.left) && isValidBST(root.right);

        }
        return false;
    }
    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(4);
            TreeNode three = root.left = new TreeNode(3);
            TreeNode eight = root.right = new TreeNode(8);
            TreeNode one = root.left.left = new TreeNode(1);
            TreeNode ten = root.left.right = new TreeNode(10);
            TreeNode five = root.right.left = new TreeNode(5);
            TreeNode nine = root.right.right = new TreeNode(9);

            boolean holder = isValidBST(root);
            System.out.println(holder);

    }
}
