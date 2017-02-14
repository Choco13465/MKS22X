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
    for (int a = 0; a < board.length -1 || possible == false; a++){
      for (int b = 0; b < board.length -1 || possible == false; b++){
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
    for (int x = b; x > 0; x--){
      for (int y = a; y < board.length -1; y++){
      board[x-1][y+1] = 1;
      }
    }
    for (int y = a; y < board.length -1; y++){
      board[b][y+1] = 1;
    }
    for (int x = b; x < board.length -1; x++){
      for (int y = a; y < board.length - 1; y++){
        board[x][y] = 1;
      }
    }
  }
  
  public int getSolutionCount(){
    return solutionCount;
  }
  public String toString(){
    String s = "";
    for (int x = 0; x < board.length; x++){
      s+="\n";
      for (int y = 0; y < board.length; y++){
        s = " " + board[x][y];
      }
    }
    return s;
  }

  public static void main(String[] args){
    QueenBoard s = new QueenBoard(2);
    QueenBoard t = new QueenBoard(4);
    System.out.println(s.toString());
    System.out.println(s.solve());
    System.out.println(s.toString());
    System.out.println(t.toString());
    System.out.println(t.solve());
    System.out.println(t.toString());
    
  }
}
