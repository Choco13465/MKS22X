public class Location implements Comparable<Location>{
    private int row, col;
    private int distToGoal, distToStart;
    private Location previous;
    private boolean aStar;

    public Location(int r, int c, Location pre, int dTS, int dTG, boolean aS){
	row = r;
	col = c;
	previous = pre;
	distToStart = dTS;
	distToGoal = dTG;
	aStar = aS;
    }
    
    public int grow(){
	return row;
    }
    public int gcol(){
	return col;
    }
    public int gdTG(){
	return distToGoal;
    }
    public int gdTS(){
	return distToStart;
    }
    public Location gprev(){
	return previous;
    }
    public boolean gaStar(){
	return aStar;
    }

    public int compareTo(Location other){
	if (gaStar()){
	    return (gdTS()+gdTG()) - (other.gdTS()+other.gdTG());
	}
	else{
	    return gdTG()-other.gdTG();
	}
    }
}


