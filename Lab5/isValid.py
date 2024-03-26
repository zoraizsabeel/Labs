class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def isValidBST(root):
    if root is None:
        return True
    if (root.left is None or root.left.val < root.val) and (root.right is None or root.right.val > root.val):
        return isValidBST(root.left) and isValidBST(root.right)
    return False

if __name__ == "__main__" :
    root = TreeNode(4)
    three = root.left = TreeNode(3)
    eight = root.right = TreeNode(8)
    one = root.left.left = TreeNode(1)
    ten = root.left.right = TreeNode(10)
    five = root.right.left = TreeNode(5)
    nine = root.right.right = TreeNode(9)

    holder = isValidBST(root)
    print(holder)
