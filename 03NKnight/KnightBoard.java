public class KnightBoard{
  private int[][]board;
  private int R;
  private int C;
  
  public KnightBoard(int rows,int cols){
    board = new int[rows][cols];
    int R = rows;
    int C = cols;
    clear();
  }
  
  public void clear(){
    for (int y = 0; y < board.length; y++){
      for (int x = 0; x < board.length; x++){
        board[y][x] = 0;
      }
    }
  }
  
  
  public boolean solve(){
    return solveH(0, 0, 1);
  }
  public boolean solveH(int row, int col, int rank){
    if (rank >= R*C){
      return true;
    }
    for (int b = row; b < R; b++){
      for (int i = col; i < C; i++){
        try (if (board[b-2][i-2] == 0){
          board[b][i] = rank;
          if (solveH(b-2, i-2, rank++)){
            return true;
          }else{
            board[b][i] = 0;
          }
        }
             catch(IndexOutOfBoundsException()
              
              
        
    }
    return false;
  }
  
  
  public String toString(){
    String s = "";
    for (int x = 0; x < board.length; x++){
      for (int y = 0; y < board.length; y++){
        s = s + " " + board[x][y];
      }
      s+="\n";
    }
    return s;
  }
}
