class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid==null||grid.length==0) return 0;
        int m=grid.length;
        int n=grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                }else if(grid[i][j]==1){
                    freshCount++;
                }
            }
        }
        if(freshCount==0) return 0;
        int min=0;
        int[][] dir={{-1,0},{1,0},{0,-1},{0,1}};
        while (!queue.isEmpty() && freshCount > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int row = current[0];
                int col = current[1];
                
                for (int[] dirs : dir) {
                    int newRow = row + dirs[0];
                    int newCol = col + dirs[1];
                    if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2; 
                        freshCount--;
                        queue.offer(new int[]{newRow, newCol});
                    }
                }
            }
            min++;
    }
    return freshCount==0?min:-1;
}
}