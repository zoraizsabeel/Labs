from collections import deque

def canFinish(numCourses, prerequisites):
    indegrees = [0] * numCourses
    prereq = [[] for _ in range(numCourses)]

    for holder in prerequisites:
        indegrees[holder[0]] += 1
        prereq[holder[1]].append(holder[0])

    q = deque()
    for i in range(numCourses):
        if indegrees[i] == 0:
            q.append(i)

    ctr = 0
    while q:
        node = q.popleft()
        ctr += 1
        for adjacent in prereq[node]:
            indegrees[adjacent] -= 1
            if indegrees[adjacent] == 0:
                q.append(adjacent)

    return ctr == numCourses


def main():
    holder = [[1, 0], [2, 0], [3, 1]]
    print(canFinish(4, holder))


if __name__ == "__main__":
    main()
