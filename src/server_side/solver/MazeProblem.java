package server_side.solver;

import java.util.Arrays;

public class MazeProblem {

    private int[][] maze;

    private int startRow;
    private int startCol;
    private int finishRow;
    private int finishCol;

    public MazeProblem(int[][] maze, int startRow, int startCol, int finishRow, int finishCol) {
        this.maze = maze;
        this.startRow = startRow;
        this.startCol = startCol;
        this.finishRow = finishRow;
        this.finishCol = finishCol;
    }

    public MazeProblem() {
    }

    public int[][] getMaze() {
        return maze;
    }

    public void setMaze(int[][] maze) {
        this.maze = maze;
    }

    public int getStartRow() {
        return startRow;
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    public int getStartCol() {
        return startCol;
    }

    public void setStartCol(int startCol) {
        this.startCol = startCol;
    }

    public int getFinishRow() {
        return finishRow;
    }

    public void setFinishRow(int finishRow) {
        this.finishRow = finishRow;
    }

    public int getFinishCol() {
        return finishCol;
    }

    public void setFinishCol(int finishCol) {
        this.finishCol = finishCol;
    }

    @Override
    public String toString() {
        return "MazeProblem{" +
                "maze=" + Arrays.toString(maze) +
                ", startRow=" + startRow +
                ", startCol=" + startCol +
                ", finishRow=" + finishRow +
                ", finishCol=" + finishCol +
                '}';
    }
}
