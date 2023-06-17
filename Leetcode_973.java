class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] res = new int[k][2];
         PriorityQueue<int[]> indices = new PriorityQueue<>((x,y) -> (x[0]*x[0] + x[1]*x[1]) - (y[0]*y[0] + y[1]*y[1]));

         for(int[] p: points){
             indices.add(p);
         }

         for(int i=0; i < k; i++){
             res[i] = indices.poll();
         }

         return res;
    }
}
