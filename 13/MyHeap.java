import java.util.Arrays;
import java.util.ArrayList;

public class MyHeap{

    private int size;
    private int constant;
    private ArrayList<String> list;

    public MyHeap(){
        list = new ArrayList<String>();
	size = 1;
	list.add("0");
	constant = 1;
    }

    public MyHeap(boolean boo){
        list = new ArrayList<String>();
	size = 1;
	list.add("0");

	if (boo){
	    constant = 1;
	}else{
	    constant = -1;
	}
    }

    public void add(String s){
	size++;
	list.add(s);
	pushUp(size-1);
    }
    
    private void pushUp(int i){
	while (i >= 2 && (constant * ((list.get(i)).compareTo(list.get((int)(i/2))))) > 1){
	    swap(i, (int)i/2);
	    i = (int)i/2;
	}
    }

    private void swap(int i, int parent){
	String temp = list.get(i);
	list.set(i, list.get(parent));
	list.set(parent, temp);
    }

    public String peek(){
	return list.get(1);
    }

    public String toString(){
	return "" + list;
    }

    public static void main(String[] args){
	boolean b = false;
	String[] stuff = {"a", "d", "h", "w", "b", "e", "i"};
	String[] sorted = new String[stuff.length];
	MyHeap alpha = new MyHeap(b);
	for (int i = 0; i < stuff.length; i++){
	    alpha.add(stuff[i]);
	    System.out.println(alpha.toString());
	}
    }
}

		    
	    
		    
