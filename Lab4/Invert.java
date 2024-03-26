public class Invert 
{
    public static TreeNode invertTree(TreeNode root)
    {
        TreeNode temp;
        if(root.left != null & root.right != null)
        {
            temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
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

        TreeNode holder = invertTree(root);
        System.out.println(holder.val);
        System.out.println(holder.left.val + " " + holder.left.left.val + " " + holder.left.right.val);
        System.out.println(holder.right.val + " " + holder.right.left.val + " " + holder.right.right.val);
    }
}
