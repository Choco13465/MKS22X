import java.util.*;

public class Recursion{ 
  public static String name(){
    return "Wang,Emily";
  }
  public static double sqrt(double n){
    if (n < 0){
      throw new IllegalArgumentException();
    }
    if (n == 0){
      return n;
    }
    return wrap(n, n / 2);
  }
  public static double wrap(double n, double a){
    double b = ((n/a)+a) / 2;
    if(Math.abs(b*b)-n < 0.00000000001){
      return b;
    }
    else {
      return wrap(n, b);
    }
  }
}
