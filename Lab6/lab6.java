/**
 * Innerlab6
 * We will be solving another problem on graphs together! Here's the problem statement:

There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.

For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.

Return true if you can finish all courses. Otherwise, return false.

Constraints:

1 <= numCourses <= 2000
0 <= prerequisites.length <= 5000
prerequisites[i].length == 2
0 <= ai, bi < numCourses
All the pairs prerequisites[i] are unique.
 */

// top down approach to solve this, almost like the breakfast problem
// first check which course is first by seeing if anything has it as a prerequisite
// check which one is last by seeing what has the most prereqs connected
import java.util.*;

public class lab6 {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        
        int [] indegrees = new int[numCourses];
        ArrayList<LinkedList<Integer>> prereq = new ArrayList<>(numCourses);

        for(int i = 0; i < numCourses; i++) //holder for end of topologically sorted list
        {
            prereq.add(new LinkedList<>());
        }

        for(int [] holder: prerequisites )
        {
            //[1, 0], [2, 0], [2, 1], [3, 1]
            indegrees[holder[0]]++; //increments the amount of things pointing at it
            prereq.get(holder[1]).add(holder[0]);
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegrees[i] == 0) {
                q.add(i);
            }
        }

        int ctr = 0;
        while (!q.isEmpty()) {
            int node = q.remove();
            ctr++;
            // Decrease indegree of adjacent vertices as the
            // current node is in topological order
            for (int adjacent : prereq.get(node)) {
                indegrees[adjacent]--;
                // If indegree becomes 0, push it to the
                // queue
                if (indegrees[adjacent] == 0)
                    q.add(adjacent);
            }
        }
 
        // Check for cycle
       return ctr == numCourses;
    }



    public static void main(String[] args)
    {
        int[][] holder = {{1,0}, {2, 0}, {3, 1}};
        System.out.println(canFinish(4, holder));

    }
}
