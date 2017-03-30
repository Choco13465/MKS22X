public class MyLinkedList{
    public LNode start;
    public LNode end;
    public int size;

    public MyLinkedList(){
	start = null;
	end = null;
	size = 0;
    }

    public String toString(){
	String s = "[";
	LNode a = start;
	while (size != 0){
	    s += a.value + ", ";
	}
s+="]"
    temp = temp.next;
if temp == null break out

	
    public void add(int zel){
	addH(zel, start);
    }

    public void addH(int zel, LNode a){
	if (a.next = null){
	   a.next = new LNode(zel);
	   size++;
	}else{
	    addH(zel, a.next);
	}
    }

    private class LNode{
	private int value;
	private LNode next;
	
	public LNode(int e){
	    value = e;
	    next = null;
	}
    }
}

