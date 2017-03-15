import java.util.*;

public class Quiz2Redux{  
  public Quiz2Redux(){}
  
  public static ArrayList<String> combinations(String s){
      ArrayList<String> words = new ArrayList<String>();
      help(words, 0, s, "");
      Collections.sort(words);
      return words;
  }
  
  private static void help(ArrayList<String> words, int start, String s, String zel){
    if(start == 0){
      words.add(zel);
    }
    for(int index = start; index < s.length(); index++){
      start++;
      help(words, start, s, zel);
      zel += s.charAt(index);
      words.add(zel);
    }
  }
    
    public static void main(String[] args){
      Quiz2Redux bah = new Quiz2Redux();
      System.out.println(bah.combinations("abcd"));
  }
  
  
  
  
  
}