class Solution {
    public boolean exist(char[][] board, String word) {
        boolean vis[][] = new boolean[board.length][board[0].length];
        for(int i = 0 ; i < board.length ; i++)
        {
            for(int j = 0 ; j < board[i].length ; j++)
            {
                if(board[i][j] == word.charAt(0) && vis[i][j] == false)
                {
                    if(recur(board,word,i,j,1,vis))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean recur(char[][] board, String word, int i , int j ,int counter,boolean [][] vis)
    {
        if(counter == word.length())
        {
            return true;
        }

        vis[i][j] = true;

        int di[] = {0,1,-1,0};
        int dj[] = {1,0,0,-1};

        for(int ind = 0 ; ind < 4 ; ind++)
        {
            int ni = i+di[ind];
            int nj = j+dj[ind];

            if(ni < 0 || nj < 0 || ni >= board.length || nj >= board[0].length || vis[ni][nj] || board[ni][nj] != word.charAt(counter)) continue;

            if(recur(board,word,ni,nj,counter+1,vis))
            {
                return true;
            }
        }
        vis[i][j] = false;
        return false;
    }
}