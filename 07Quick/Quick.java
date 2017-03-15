public class Quick{
    public Quick(){}
    
    public static int quickselect(int[] data, int k){
	//return the value that is the kth smallest value of the array
	//use your partition method to help you accomplish this
    }
    public static int part(int[] data, int start, int end, int k){
	int pivot = Math.random(end - start);

	int zel = data[pivot];
	data[pivot] = data[start];
	data[start] = zel;
 
	int index = start+1;
	int eindex = end;
	while (index < eindex){
	for(int index = start+1; index < end; index++){
	    for(int eindex = end; eindex > index; end--){
		if (data[index] < data[eindex]){
		    data[

	    //When done returns index of the final of the pivot element
	}
}
