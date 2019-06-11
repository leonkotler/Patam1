package server_side.solver;

import java.util.Objects;

public class Node implements Comparable{

    private int row;
    private int col;
    private int value;
    private String moved;

    public Node(int row, int col, int value, String moved) {
        this.row = row;
        this.col = col;
        this.value = value;
        this.moved = moved;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getMoved() {
        return moved;
    }

    public void setMoved(String moved) {
        this.moved = moved;
    }

    @Override
    public int compareTo(Object o) {
        Node node = (Node)o;

        return (this.value - node.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return row == node.row &&
                col == node.col;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, col);
    }


}
