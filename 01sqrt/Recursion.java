import java.util.*;

public class Recursion{ 
  public static String name(){
    return "Wang,Emily";
  }
  public static double sqrt(double n){
    if (n < 0){
      throw new IllegalArgumentException("n is less than 0!");
    }
    return wrap(n, n / 2);
  }
  public static double wrap(double n, double a){
    if (((Math.abs((a * a) - n)) / n) * 100 <= 0.0001){
      return a;
    }
    else {
      return wrap(n, (n / a + a) / 2);
    }
  }
}