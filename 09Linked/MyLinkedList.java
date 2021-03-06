import java.util.Iterator;

public class MyLinkedList// implements Iterable<Integer>{
{
    /* public Iterable<Integer> iterator(){
	return new Iterator(start);
    }

     public class MYLLIterator{
	public LNode curr;
	public MYLLIterator(LNode temp){
	    curr = temp;
	}

	public boolean hasNext(){
    */



    private class LNode{
	private int value;
	private LNode next, prev;
	
	public LNode(int e){
	   this.value = e;
	}
	public String toString(){
	    return value + "";
	}
    }

    public LNode start, end;
    public int size;

    public MyLinkedList(){
	start = null;
	end = null;
	size = 0;
    }

    public int size(){
	return size;
    }

    public String toString(){
	String s = "[";
	LNode temp = start;
	while (temp!=null){
	    s += temp.toString();
	    temp = temp.next;
	}
	return s + "]";
    }

	
    public void add(int value){
	LNode zel = new LNode(value);
	addH(zel, start);
    }

    public void addH(LNode node, LNode a){
	if (a != null){
	    if (a.next == null){
		a.next = node;
		size++;
	    }else{
		addH(node, a.next);
	    }
	}else{
	    a = node;
	    size++;
	}
    }
    /*
  private LNode getNthNode(int n){}
  private void addAfter(LNode location, LNode toBeAdded){ }
  private void remove(LNode target){}
  public int get(int index){}
  public int set(int index, int value){}
  public int indexOf(int value){}
  public int remove(int index){}
  public void add(int index,int value){}
    */

    public static void main(String [] args){
	MyLinkedList a = new MyLinkedList();
	System.out.println(a.toString());
	a.add(1);
	System.out.println(a.size());
	System.out.println(a.toString());
    }

}

