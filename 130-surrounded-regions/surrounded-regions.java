class Solution {
    public void solve(char[][] board) {
       
        for(int i = 0 ; i < board.length ; i++)
        {
            for(int j = 0 ; j < board[0].length ; j++)
            {
                if(i == 0 || j == 0 || i == board.length-1 || j == board[0].length-1)
                {
                    if(board[i][j] == 'O')
                    {
                        dfs(board,i,j);
                    }
                }
            }
        }

        for(int i = 0 ; i < board.length ; i++)
        {
            for(int j = 0 ; j < board[0].length ; j++)
            {
                if(board[i][j] == '.')
                {
                    board[i][j] = 'O';
                }
                else if(board[i][j] == 'O')
                {
                    board[i][j] = 'X';
                }
            }
        }
    }

    public void dfs( char[][] board, int i, int j)
    {
        
        board[i][j] = '.';

        int di[] = {-1,0,1,0};
        int dj[] = {0,1,0,-1};

        for(int ind = 0 ; ind < 4 ; ind++)
        {
            int ni = i+di[ind];
            int nj = j+dj[ind];

            if(ni >= 0 && ni < board.length && nj >= 0 && nj < board[0].length && board[ni][nj] != '.' && board[ni][nj] != 'X')
            {
                dfs(board,ni,nj);
            }
        }

    }
}