class Solution {

    public class pair{
        int ro;
        int cl;
        int tm;

        pair(int ro , int cl , int tm){
            this.ro = ro;
            this.cl = cl;
            this.tm = tm;
        }
    }

    public int orangesRotting(int[][] grid) {
        Queue<pair> qu = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;

        int visit[][] = new int[n][m];
        int fcnt = 0;

        int rowmove[] = {-1 , 0 , 1 , 0};
        int colmove[] = {0 , 1 , 0 , -1};

        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(grid[i][j] == 2){
                    visit[i][j] = 2;
                    qu.add(new pair(i , j , 0));
                }

                else if(grid[i][j] == 1){
                    fcnt++;
                }
                else {
                    visit[i][j] = 0;
                }
            }
        }

        int time = 0;
        int cnt = 0;

        while(!qu.isEmpty()){
            pair current = qu.poll();
            int row = current.ro;
            int col = current.cl;
            int tm = current.tm;

            time = Math.max(time , tm);

            for(int i = 0 ; i < 4 ; i++){
                int newrow = row + rowmove[i];
                int newcol = col + colmove[i];

                if(newrow >= 0 && newrow < n && newcol >= 0 && newcol < m && visit[newrow][newcol] == 0 && grid[newrow][newcol] == 1){
                    visit[newrow][newcol] = 2;
                    qu.add(new pair(newrow , newcol , tm+1));
                    cnt++;
                }
            }
        }

        if(cnt != fcnt) return -1;
        else return time;
    }
}