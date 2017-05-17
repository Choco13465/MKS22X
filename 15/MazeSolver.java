public class MazeSolver{
    public String filename;
    public boolean animate;

    public Maze maze;


    public MazeSolver(String filen){
	this(filename,false);
    }
    public MazeSolver(String filen, boolean ani){
	maze = new Maze(filen, ani);
	filename = filen;
	animate = ani;
    }


    public void solve(){
	solve(1);
    }
    public void solve(int style){
	switch (style){
	case 0: //DFS
	    break;
	case 1: //BFS
	    break;
	case 2: //BestFirst
	    break;
	case 3: //Astar
	    break;
	default: break;
	}
    }

    public String toString(){
	return maze.toString();
    }
}
