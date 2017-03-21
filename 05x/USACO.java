import java.io.*;
import java.util.*;
import java.lang.*;

public class USACO{
  public int[][] pasture;
  public int Row, Col, E, N, R1, R2, C1, C2;
  
  public USACO(){}
  
  public int bronze(String filename){
    try{
    File input = new File(filename);
    Scanner reader = new Scanner(input);
    
    Row = reader.nextInt();
    Col = reader.nextInt();
    E = reader.nextInt();
    N = reader.nextInt();
    pasture = new int[Row][Col];
    
    for (int r = 0; r < pasture.length; r++){
      for (int c = 0; c < pasture[r].length; c++){
        pasture[r][c] = reader.nextInt();
      }
    }
    for (int instructions = 0; instructions < N; instructions++){
      pasture = cowStomp(reader.nextInt()-1, reader.nextInt()-1,reader.nextInt(), pasture);
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
  
    catch(FileNotFoundException e){
      return -1;
    }
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
  
  
  public int silver(String filename){
    try{
    File input = new File(filename);
    Scanner reader = new Scanner(input);
    
    Row = reader.nextInt();
    Col = reader.nextInt();
    pasture = new int[Row][Col];
    int T = reader.nextInt();
    
    for (int r = 0; r<pasture.length+1; r++){
      for (int c = 0; c<pasture[r].length+1; c++){
        if ((reader.next()).equals(".")){
          pasture[r][c] = 0;
        }
        else{
          pasture[r][c] = -1;
        }
      }
    }
    
    R1 = reader.nextInt();
    C1 = reader.nextInt();
    R2 = reader.nextInt();
    C2 = reader.nextInt();
    pasture[R1][C1] = 1;
    
    for (int instructions = 0; instructions <= T; instructions++){
      pasture = move(pasture);
    }
    
    return pasture[R2][C2];
    }
    catch(FileNotFoundException e){
      return -1;
    }
  }
  
  private static int[][] move(int[][] pasture){
    int[][] temp = new int[pasture.length][pasture[0].length];
    for (int r = 0; r < pasture.length; r++){
      for (int c = 0; c < pasture.length; c++){
        if (r-1 >= 0 && c-1 >= 0){
          if(pasture[r-1][c-1] != -1){
            temp[r-1][c-1] += 1;
          }
        }
        if (r-1 >= 0 && c+1 < pasture[c].length){
          if(pasture[r-1][c+1] != -1){
            temp[r-1][c+1] += 1;
          }
        }
        if (r+1 < pasture[r].length && c-1 >= 0){
          if(pasture[r+1][c-1] != -1){
            temp[r+1][c-1] += 1;
          }
        }
        if (r+1 < pasture[r].length && c+1 < pasture[c].length){
          if(pasture[r+1][c+1] != -1){
            temp[r+1][c+1] += 1;
          }
        }
        temp[r][c] = 0;
      }
    }
    return temp;
  }
}

  