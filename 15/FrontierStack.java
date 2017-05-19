import java.util.Stack;

public class FrontierStack{
    Stack<Location> fstack;

    public FrontierStack(){
	fstack = new Stack<Location>;
    }

    public void add(Location loc){
	fstack.push(loc);
    }

    public Location next(){
	fstack.pop();
    }

    public boolean hasNext(){
	return !fstack.empty();
    }
}

