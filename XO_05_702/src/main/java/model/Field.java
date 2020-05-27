package model;

public class Field {
    private int[][] fieldArr ;

    public Field(int n) {
        this.fieldArr = new int[n][n];
    }

    public int[][] getFieldArr() {
        return fieldArr;
    }
}