#high level approach
  - go through the tree and check if left is less than root and right is more than root
  - if so, return true, if not, return false
#rercursive
  - condition: if the root is not found --> return true because nothing is ordered
  - condition: check if left and right are null or contain attributes given above --> return function of left and function of right
  - else return false
