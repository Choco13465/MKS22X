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
	while (s.compareTo(list.get((int)(size/2))))
		    
