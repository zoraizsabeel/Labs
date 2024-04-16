# highlevel approach
- using topdown sorting
- hence kahns algorithm
# kahns algorithm:
- create a array that holds, per index, how many indegrees a node has (kind of like counting sort)
- convert preRequisite 2d array to adjacent list
- create a queue that holds only the indegrees that have value of 0
- while queue is not empty: create a counter that will increment whenever a node is being taken out of the queue
  - a loop shall find all adjacent nodes and deplete indegree array unless the index at the adjacent value is equal to 0
- based on this you can check when if the function is true if all num values, matches with counter.
