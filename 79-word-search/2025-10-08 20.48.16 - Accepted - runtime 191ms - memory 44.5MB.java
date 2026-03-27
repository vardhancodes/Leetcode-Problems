class Solution {
    public boolean exist(char[][] board, String word) {
        int il = 0;
       for(int i = 0 ; i < board.length ; i++)
       {
            for(int j = 0 ; j < board[i].length ; j++)
            {
                if(board[i][j] == word.charAt(il))
                {
                    if(recur(board,word,i,j,il))
                    {
                        return true;
                    }
                }
            }
       }
       return false;
        
    }
    public static boolean recur(char[][] board , String word , int i , int j, int il)
    {  
        if( i < 0 || i >= board.length ||  j < 0 || j >= board[i].length || board[i][j] != word.charAt(il) || board[i][j] == '0' ){
            return false;
        }

        //basecase
        if(il == word.length()-1)
        {
            return true;
        }

        int di[] = {1,0,0,-1};
        int dj[] = {0,-1,1,0};
        char orig = board[i][j];
        board[i][j] = '0';
        for(int ind = 0 ; ind < 4 ; ind++)
        { 
           
            if(recur(board,word,i+di[ind],j+dj[ind],il+1))
            {
                board[i][j] = orig;
                return true;
            }
        }
        board[i][j] = orig;
        return false;
        
    }
}