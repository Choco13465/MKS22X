import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class USACO{
  public USACO(){}
  public static int bronze(String filename) throws FileNotFoundException{
    File input = new File(filename);
    Scanner reader = new Scanner(input);
    String line = reader.nextLine();
    
    int[][] pasture = new int[Integer.parseInt(line.split(" ")[0])][Integer.parseInt(line.split(" ")[1])];
    int E = Integer.parseInt(line.split(" ")[2]);
    int N = Integer.parseInt(line.split(" ")[3]);
    
    for (int r = 0; r<pasture.length; r++){
      line = reader.nextLine();
      for (int c = 0; c<pasture[r].length; c++){
        pasture[r][c] = Integer.parseInt(line.split(" ")[c]);
      }
    }
    for (int instructions = 0; instructions < N; instructions++){
      line = reader.nextLine();
      pasture = cowStomp(Integer.parseInt(line.split(" ")[0])-1, Integer.parseInt(line.split(" ")[1])-1,Integer.parseInt(line.split(" ")[2]), pasture);
    }
    
    int total = 0;
    for (int r = 0; r < pasture.length; r++){
      for (int c = 0; c < pasture.length; c++){
        if(E-pasture[r][c] > 0){
          total += pasture[r][c];
        }
      }
    }
    return total*72*72;
  }
  
  private static int[][] cowStomp(int r, int c, int d, int[][] pasture){
    int max = pasture[r][c];
    for (int row = 0; row < 3; row++){
      for (int col = 0; col < 3; col++){
        if (pasture[r+row][c+col] > max){
          max = pasture[r+row][c+col];
        }
      }
    }
    max -= d;
    for (int row = 0; row < 3; row++){
      for (int col = 0; col < 3; col++){
        if (pasture[r+row][c+col] > max){
          pasture[r+row][c+col] = max;
        }
      }
    }
    return pasture;
  }
  
  
  public int silver(String filename) throws FileNotFoundException{
    File input = new File(filename);
    Scanner reader = new Scanner(input);
    String line = reader.nextLine();
    
    int[][] pasture = new int[Integer.parseInt(line.split(" ")[0])][Integer.parseInt(line.split(" ")[1])];
    int T = Integer.parseInt(line.split(" ")[2]);
    
    for (int r = 0; r<pasture.length+1; r++){
      line = reader.nextLine();
      for (int c = 0; c<pasture[r].length+1; c++){
        if ((line.split(" ")[c]).equals(".")){
          pasture[r][c] = 0;
        }
        else{
          pasture[r][c] = -1;
        }
      }
    }
    
    line = reader.nextLine();
    int R1 = Integer.parseInt(line.split(" ")[0]);
    int C1 = Integer.parseInt(line.split(" ")[1]);
    int R2 = Integer.parseInt(line.split(" ")[2]);
    int C2 = Integer.parseInt(line.split(" ")[3]);
    pasture[R1][C1] = 1;
    
    for (int instructions = 0; instructions <= T; instructions++){
      move(pasture);
    }
    
    return pasture[R2][C2];
  }
  
  private static int[][] move(int[][] pasture){
    int[][] temp = new int[pasture.length][pasture[0].length];
    for (int r = 0; r < pasture.length; r++){
      for (int c = 0; c < pasture.length; c++){
        if (r-1 >= 0 && c-1 >= 0){
          if(pasture[r-1][c-1] != -1){
            temp[r][c] += pasture[r-1][c-1];
          }
        }
        if (r-1 >= 0 && c+1 < pasture[c].length){
          if(pasture[r-1][c+1] != -1){
            temp[r][c] += pasture[r-1][c+1];
          }
        }
        if (r+1 < pasture[r].length && c-1 >= 0){
          if(pasture[r+1][c-1] != -1){
            temp[r][c] += pasture[r+1][c-1];
          }
        }
        if (r+1 < pasture[r].length && c+1 < pasture[c].length){
          if(pasture[r+1][c+1] != -1){
            temp[r][c] += pasture[r+1][c+1];
          }
        }
      }
    }
    pasture = temp;
    return pasture;
  }
}

  