/*
 * Problem Link : https://leetcode.com/problems/rotting-oranges/
 * Solution Link : https://leetcode.com/problems/rotting-oranges/solutions/1517522/java-tc-o-m-n-sc-o-m-n-optimized-bfs-solution/
 * 
 * Time Complexity : O(M * N)
 * Space Complexity : O(M * N)
 */

class Q994_Rotting_Oranges 
{
    public int orangesRotting(int[][] grid) 
    {
        int freshOranges = 0;
        Queue<int []> queue = new LinkedList<int []>();
        int dx[] = {-1, 0, 1, 0};
        int dy[] = {0, 1, 0, -1};

        int m = grid.length;
        int n = grid[0].length;

        for(int i=0 ; i<m ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(grid[i][j] == 1)
                    freshOranges++;
                else if(grid[i][j] == 2)
                    queue.add(new int[]{i,j});
            }
        }

        int steps = 0;

        while(!queue.isEmpty() && freshOranges>0)
        {
            int size = queue.size();
            while(size-- > 0)
            {
                int coordinate[] = queue.poll();

                for(int index=0 ; index<4 ; index++)
                {
                    int row = coordinate[0] + dx[index];
                    int column = coordinate[1] + dy[index];

                    if(row<0 || row>=m || column<0 || column>=n || grid[row][column] != 1)
                        continue; 

                    grid[row][column] = 2;
                    queue.add(new int[]{row, column});
                    freshOranges--;
                }
            }
            steps++;
        }
        
        return freshOranges == 0 ? steps : -1 ;
    }
}
