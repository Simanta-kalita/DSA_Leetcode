class Solution {
    List<Integer>[] adj;
    boolean[] visited;
    boolean[] marked;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        adj = new ArrayList[numCourses];
        for(int i=0; i < numCourses; i++){
            adj[i] = new ArrayList<>();
        }
        visited = new boolean[numCourses];
        marked = new boolean[numCourses];
        for(int i =0; i < prerequisites.length; i++){
            adj[prerequisites[i][0]].add(prerequisites[i][1]);
        }

        for(int i =0; i < numCourses; i++){
            if(!visited[i]){
                if(isCyclic(i)) return false;
            }
        }
        return true;
    }

    private boolean isCyclic(int i){
        visited[i] = true;
        for(int neighbour: adj[i]){
            if(!visited[neighbour]){
               if(isCyclic(neighbour)){
                return true;
              }
            } else if(!marked[neighbour]){
                return true;
            }
        }
        // after loop is over we can mark it as completed
        marked[i] = true;
        return false;
    }
}
