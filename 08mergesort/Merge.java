public class Merge{
    public static void mergesort(int[] data){
	if ((data.length-1)%2 == 1){
	    int a = (data.length-2)/2;
	}
	int[] zel = new int[data.length-a];
	int[] ran = new int[data.length-a+1];
	mergesort(
