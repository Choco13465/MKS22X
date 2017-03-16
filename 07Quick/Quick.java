public class Quick{
  public Quick(){}
  
  public static int quickselect(int[] data, int k){
    return part(data, 0, data.length-1, k);
  }
  public static int part(int[] data, int start, int end, int k){
    int ran = Math.random(end - start);
    int zel = data[ran];
    int index = start-1;
    int eindex = end+1;
    
    while (index < eindex){
      for(index++; a[index] < zel; index++);
      for(eindex; a[eindex] > zel; end--);
      if (data[index] < data[eindex]){
        zel = data[index];
        data[index] = data[eindex];
        data[eindex] = zel;
      }
    }
    if (index = k){
      return data[index];
    } else {
      if (index < k){
        part(data, index, end, k);
      } else {
        part(data, start, index, k);
      }
    }
  }
}
