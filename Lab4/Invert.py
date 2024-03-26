class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def invertTree(root):
    if root and root.left and root.right:
        temp = root.left
        root.left = root.right
        root.right = temp
        invertTree(root.left)
        invertTree(root.right)
    return root

if __name__ == "__main__":
    root = TreeNode(4)
    root.left = TreeNode(3)
    root.right = TreeNode(8)
    root.left.left = TreeNode(1)
    root.left.right = TreeNode(10)
    root.right.left = TreeNode(5)
    root.right.right = TreeNode(9)

    holder = invertTree(root)
    print(holder.val)
    print(holder.left.val, holder.left.left.val, holder.left.right.val)
    print(holder.right.val, holder.right.left.val, holder.right.right.val)
