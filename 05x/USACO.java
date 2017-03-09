import.java.io.File;
import.java.io.FileNotFoundException;
import.java.util.Scanner;

public class USACO{
  public int bronze(String filename) throws FileNotFoundException{
    File input = new File(filename);
    Scanner reader = new Scanner(input);
    String line = reader.nextline();
    
    int[][] pasture = new int[Integer.parseInt(line.split(" ")[0])][Interger.parseInt(line.split(" ")[1])];
    int E = Integer.parseInt(line.split(" ")[2]);
    int N = Integer.parseInt(line.split(" ")[3]);
    
    for (int r = 0; r<pasture.length; r++){
      line = reader.nextLine();
      for (int c = 0; c<pasture[r].length; c++){
        pasture[r][c] = Integer.parseInt(line.split(" ")[c]);
      }
    }
    for (int instructions = 0; instructions < N; instructions++){
      line.nextLine();
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
  
      
  }
  //public int silver(String filename);
  