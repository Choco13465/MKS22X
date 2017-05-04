public class MyHeap{

    private int size;
    private int constant;
    private ArrayList<String> list;

    public MyHeap(){
	size = 1;
	list.add(0);
	constant = 1;
    }

    public MyHeap(boolean boo){
	size = 1;
	list.add(0);

	if (boo){
	    constant = 1;
	}else{
	    constant = -1;
	}
    }

    public void add(String s){
	size++;
	list.add(s);
	pushUp(size);
    }
    
    private void pushUp(int i){
	while ((constant * (s.compareTo(list.get((int)(i/2))))) > 1 && i > 1){
	    swap(i, (int)i/2);
	    i = (int)i/2;
	}
    }

    private void swap(int i, int parent){
	String temp = list.get(i);
	list.set(i, list.get(parent));
	list.set(parent, temp);
    }

private 

    public static void main(String[] args){
	boolean b = false;
	String[] stuff = {"34", "23", "45", "20", "56", "17", "12"};
	String[] sorted = new String[stuff.length];
	MyHeap alpha = new MyHeap(b);
	for (int i = 0; i < stuff.length; i++){
	    alpha.add(stuff[i]);
	    System.out.println(alpha.peek(i));
	}
    }
}

		    
	    
		    
