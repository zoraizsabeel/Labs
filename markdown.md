# high level approaches for invert
  - go through the tree
  - for each node, swap pointer
# recursive: 
  - mmake temp Tree
  - Condition: if both child nodes != null --> swap and call function recursively with left/right as params
  - return root (if root is null or at end)
