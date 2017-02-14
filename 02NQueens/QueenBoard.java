public class QueenBoard{
  private int[][]board;
  private int solutionCount;
  
  public QueenBoard(int size){
    board = new int[size][size];
    clear();
    int solutionCount = -1;
  }
  
  public void clear(){
    for (int y = 0; y < board.length; y++){
      for (int x = 0; x < board.length; x++){
        board[y][x] = -1;
      }
    }
  }
  
  
  public boolean solve(){
    return solveH();
  }
  public boolean solveH(){
    boolean possible = false;
    for (int a = 0; a < board.length - 1 || possible == false; a++){
      clear();
      for (int b = 0; b < board.length - 1 || possible == false; b++){
        if (board[b][a] == -1){
          possible = fill(b, a);
        } else {
          board[b][a] = 1;
        }
      }
    }
    return possible;
  }
  public boolean fill(int x, int y){
    int count = board.length;
    for (int a = y; a < board.length; a++){
      for (int b = x; b < board.length; b++){
        if (board[b][a] == -1){
          addQ(b, a);
          count--;
          b+=board.length;
        }
      }
    }
    return count == 0;
  }
  public void addQ(int b, int a){
    board[b][a] = 0;
    int x = b;
    int y = a;
    while (x > 0){
      x-=1;
      y+=1;
      board[x][y] = 1;
    }
    x = b;
    y = a;
    while (y < board.length -1){
      y++;
      board[x][y] = 1;
    }
    x = b;
    y = a;
    while (x < board.length -1){
      x++;
      y++;
      board[x][y] = 1;
    }
  }
  
  public int getSolutionCount(){
    return solutionCount;
  }
  public String toString(){
    return "";
  }

  public static void main(String[] args){
    QueenBoard s = new QueenBoard(1);
    QueenBoard t = new QueenBoard(2);
    System.out.println(s.solve());
    System.out.println(t.solve());
  }
}
