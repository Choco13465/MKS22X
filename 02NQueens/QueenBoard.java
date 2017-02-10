public class QueenBoard{
    private int[][]board;
    private int solutionCount;
    
    public QueenBoard(int size){
	board = new int[size][size];
	int solutionCount = -1;
    }

    public boolean solve(){
	return solveH(0, 0, board.length);
    }

    private boolean solveH(int row, int column, int QueenCount){
	if (QueenCount <= 0){
	    return true;
	}
	if (board[size - 1] >= -1 && QueenCount > 0){
	    return false;
	}
	nextQueen(row, column, QueenCount);
    }
