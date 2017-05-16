public class FrontierPriorityQueue implements Frontier{
    public PriorityHeap PQueue;

    public FrontierPriorityQueue(){
	PQueue = new PriorityHeap(){};
    }
