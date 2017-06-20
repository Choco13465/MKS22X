import java.util.Random;

public class Quick{
  public Quick(){};
  
  public static void quicksort(int[] a){
    quicksorter(a, 0, a.length-1);
  }
  public static void quicksorter(int[] a, int start, int end){
    if (start < end){
      int[] c = part(a, start, end);
      int p1 = c[0];
      int p2 = c[1];
      quicksorter(a, start, p1-1);
      quicksorter(a, p2+1, end);
    }
  }
  public static int[] part(int[] a, int start, int end){
    Random rand = new Random();
    int ran = rand.nextInt(end-start) + start;
    int zel = a[ran];
    //swap(a, ran, 0);
    
    int i = start;
    int lt = start;
    int gt = end;
    
    while (i < gt){
      if (a[i] == zel){
        i++;
      } else {
        if (a[i] < zel){
          a = swap(a, i, lt);
          lt++;
          i++;
        } else {
          a = swap(a, i, gt);
          gt--;
        }
      }
    }
    int[] axel = new int[2];
    axel[0] = lt;
    axel[1] = gt;
    return axel;
  }
  
  public static int[] swap(int[] a, int i, int swap){
    int zel = a[i];
    a[i] = a[swap];
    a[swap] = zel;
    return a;
  }
  
  
  /*
  public static int quickselect(int[] a, int k){
    return quickselector(a, 0, a.length-1, k);
  }
  
  public static int quickselector(int[] a, int start, int end, int k){
    Random rand = new Random();
    int ran = rand.nextInt(end) + start;
    int zel = a[ran];
    swap(a, ran, 1);
    
    int i = start;
    int lt = start;
    int gt = end;
    
    while (i < gt){
      if (a[i] == zel){
        i++;
      } else {
        if (a[i] < zel){
          swap(a, i, lt);
          lt++;
          i++;
        } else {
          swap(a, i, gt);
          gt--;
        }
      }
    }
    
    if (lt >= k && gt <= k){
      return a[lt];
    } else {
      if (lt < k){
        quickselector(a, gt, end, k);
      } else {
        quickselector(a, start, lt, k);
      }
    }
    return -1;
  }
  */

  
  public static void main(String[] args){
    int[] blah = new int[5];
    for(int i = 0; i < blah.length; i++){
      blah[i] = 5-i;
    }
    Quick s = new Quick();
    s.quicksort(blah);
    String a = "";
    for(int i = 0; i < blah.length; i++){
      a += " " + blah[i];
    }
    System.out.println(a);
    
  }
  
}