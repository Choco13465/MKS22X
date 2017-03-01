public class KnightBoard{
  private int[][]board;
  
  public KnightBoard(int rows,int cols){
    board = new int[rows][cols];
    clear();
  }
  
  public void clear(){
    for (int rows = 0; rows < board.length; rows++){
      for (int cols = 0; cols < board[rows].length; cols++){
        board[rows][cols] = 0;
      }
    }
  }
  
  
  public boolean solve(){
    return solveH(0, 0, 1);
  }
  public boolean solveH(int row, int col, int rank){
    if (rank >= board.length*board[row].length){
      return true;
    }
    for (int b = row; b < board.length; b++){
      for (int i = col; i < board[row].length; i++){
        if (b-2 >= 0 && i-1 >= 0){
          if (board[b-2][i-1] == 0){
            board[b][i] = rank;
            if (solveH(b-2, i-1, rank++)){
              return true;
            }else{
              board[b][i] = 0;
            }
          }
        }
        if (b-1 >= 0 && i-2 >= 0){
          if (board[b-1][i-2] == 0){ 
            board[b][i] = rank;
            if (solveH(b-1, i-2, rank++)){
              return true;
            }else{
              board[b][i] = 0;
            }
          }
        }
        if (b+1 <= board.length && i-2 >= 0){
          if (board[b+1][i-2] == 0){ 
            board[b][i] = rank;
            if (solveH(b+1, i-2, rank++)){
              return true;
            }else{
              board[b][i] = 0;
            }
          }
        }
        if (b+2 <= board.length && i-1 >= 0){
          if (board[b+2][i-1] == 0){ 
            board[b][i] = rank;
            if (solveH(b+2, i-1, rank++)){
              return true;
              }else{
                board[b][i] = 0;
              }
          }
        }
        if (b+2 <= board.length && i+1 >= 0){
          if (board[b+1][i+2] == 0){ 
            board[b][i] = rank;
            if (solveH(b+1, i+2, rank++)){
              return true;
            }else{
              board[b][i] = 0;
            }
          }
        }
        if (b+1 <= board.length && i+2 >= 0){
          if (board[b+1][i+2] == 0){ 
            board[b][i] = rank;
            if (solveH(b+1, i+2, rank++)){
              return true;
            }else{
              board[b][i] = 0;
            }
          }
        }
        if (b-1 <= board.length && i+2 >= 0){
          if (board[b-1][i+2] == 0){ 
            board[b][i] = rank;
            if (solveH(b-1, i+2, rank++)){
              return true;
            }else{
              board[b][i] = 0;
            }
          }
        }
        if (b-2 <= board.length && i+1 >= 0){
          if (board[b-2][i+1] == 0){ 
            board[b][i] = rank;
            if (solveH(b-2, i+1, rank++)){
              return true;
            }else{
              board[b][i] = 0;
            }
          }
        }
        if (b != 0 || i != 0){
          return false;
        }
      }
    }
    return false;
  }
  
  
  public String toString(){
    String s = "";
    for (int rows = 0; rows < board.length; rows++){
      for (int cols = 0; cols < board[rows].length; cols++){
        if (board[rows][cols] < 10){
          s = s + "  " + board[rows][cols];
        }else{
          s = s + " " + board[rows][cols];
        }
      }
      s+="\n";
    }
    return s;
  }
  
  public static void main(String[] args){
    KnightBoard blah = new KnightBoard(1,5);
    System.out.println(blah.toString());
    System.out.println(blah.solve());
    System.out.println(blah.toString());
  }
}
