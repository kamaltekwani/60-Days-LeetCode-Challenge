/*
 * Problem Link : https://leetcode.com/problems/number-of-islands/
 * Solution Link : https://leetcode.com/problems/number-of-islands/solutions/56359/very-concise-java-ac-solution/
 *
 * Time Complexity : O(M * N)
 * Space Complexity : O(1)
 */

class Q200_Number_of_Islands 
{
    public void dfs(char grid[][], int m, int n, int row, int column)
    {
        if(row<0 || row>=m || column<0 || column>=n || grid[row][column] == '0')
            return;

        grid[row][column] = '0';

        dfs(grid, m, n, row-1, column);

        dfs(grid, m, n, row, column+1);

        dfs(grid, m, n, row+1, column);

        dfs(grid, m, n, row, column-1);
    }

    public int numIslands(char[][] grid) 
    {
        int m = grid.length;
        int n = grid[0].length;
        int islands = 0;

        for(int i=0 ; i<m ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(grid[i][j] == '1')
                {
                    dfs(grid, m, n, i, j);
                    islands++;
                }
            }
        }

        return islands;
    }
}
