public class QueenBoard{
    private int[][]board;
    private int solutionCount;
    
    public QueenBoard(int size){
	board = new int[size][size];
	clear();
	int solutionCount = -1;
    }

    clear(){
	for (int y = 0; y < board.length; y++){
	    for (int x = 0; x < board.length; x++){
		board[y][x] = -1;
	    }
	}
    }


    public boolean solve(){
	return solveH(0);
    }
    public boolean solveH(int col){
	boolean possible = false;
	int count = board.length;
	for (int y = 0; y < board.length; y++){
	    for (int x = 0; x < board.length; x++){
		if (board[x][y] == -1){
		    addQueen(x, y);
		    count - 1;
		}
	    }
	}
	if (count == 0){
	    possible = true;
	}
	return possible;
    }

    public int getSolutionCount(){
	return solutionCount;
    }
    public String toString(){
	return "";
    }

    public void addQueen(int x, int y){
	board[x][y] = 0;
	int a = x;
	int b = y;
	while(a > -1 && b > -1){
	    board[a-1][b] = 1;
	    board[a][b-1] = 1;
	    board[a-1][b-1] = 1;
	    a--;
	    b--;
	}
	while(
}
