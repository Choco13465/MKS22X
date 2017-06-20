public class QueenBoard{
  private int[][]board;
  private int solutionCount;
  
  public QueenBoard(int size){
    board = new int[size][size];
    clear();
    solutionCount = -1;
  }
  
  public void clear(){
    for (int y = 0; y < board.length; y++){
      for (int x = 0; x < board.length; x++){
        board[y][x] = 0;
      }
    }
  }
  
  
  public boolean solve(){
    clear();
    return solveH(0, false);
  }
  public boolean solveH(int b, boolean ret){
    if (b >= board.length){
      if (ret){
        solutionCount++;
        return false;
      }else{
        return true;
      }
    }
    for (int i = 0; i < board.length && b < board.length; i++){
      if (board[i][b] == 0){
        addQ(i, b);
        if (solveH(b+1, ret)){
          return true;
        }else{
        removeQ(i, b);
        }
      }
    }
    return false;
  }
  
  public void addQ(int b, int a){
    board[b][a] = 1;
    for (int i = 1; (b-i) > -1 && (a+i) < board.length; i++){
      board[b-i][a+i] += 2;
    }
    for (int i = 1; (a+i) < board.length; i++){
      board[b][a+i] += 2;
    }
    for (int i = 1; (b+i) < board.length && (a+i) < board.length; i++){
      board[b+i][a+i] += 2;
    }
    for (int i = 1; (b+i) < board.length; i++){
      board[b+i][a] += 2;
    }
  }
  public void removeQ(int b, int a){
    board[b][a] = 0;
    for (int i = 1; (b-i) > -1 && (a+i) < board.length; i++){
      if (board[b-i][a+i] == 2){
        board[b-i][a+i] = 0;
      }else{
        board[b-i][a+i] -= 2;
      }
    }
    for (int i = 1; (a+i) < board.length; i++){
      if (board[b][a+i] == 2){
        board[b][a+i] = 0;
      }else{
        board[b][a+i] -= 2;
      }
    }
    for (int i = 1; (b+i) < board.length && (a+i) < board.length; i++){
      if (board[b+i][a+i] == 2){
        board[b+i][a+i] = 0;
      }else{
        board[b+i][a+i] -= 2;
      }
    }
    for (int i = 1; (b+i) < board.length; i++){
      if (board[b+i][a] == 2){
        board[b+i][a] = 0;
      }else{
        board[b+i][a] -= 2;
      }
    }
  }
  
  public int getSolutionCount(){
    return solutionCount;
  }
  
  public void countSolutions(){
    solutionCount = 0;
    clear();
    solveH(0, true);
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
  /*
  public static void main(String[] args){
    QueenBoard blah = new QueenBoard(2);
    System.out.println(blah.toString());
    System.out.println(blah.getSolutionCount());
    System.out.println(blah.toString());
  }
  */
}
