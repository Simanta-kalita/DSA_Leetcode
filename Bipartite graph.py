class Solution:
    def isBipartite(self, graph: List[List[int]]) -> bool:
        n = len(graph)
        colors = [-1]*n

        def dfs(index,c):
            colors[index] = c
            for neighbour in graph[index]:
                if colors[neighbour] == -1:
                    if not dfs(neighbour, 1 - c):
                        return False
                elif colors[neighbour] == c:
                    return False
            return True

        for i in range(n):
            if colors[i] == -1:
                if not dfs(i,0):
                    return False
        return True
