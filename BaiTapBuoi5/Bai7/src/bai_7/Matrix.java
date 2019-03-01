/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_7;

/**
 *
 * @author ThuyLinh
 */
public class Matrix {

/**
 *
 * @author ThuyLinh
 */

    private int col;
    private int row;
    private int[][] value;
    public Matrix() {
        this.col = 3;
        this.row = 3;
        this.value = new int[3][3];
    }
    public Matrix(int col, int row, int[][] value){
        this.col = col;
        this.row = row;
        this.value = value;
                
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int[][] getValue() {
        return value;
    }

    public void setValue(int[][] value) {
        this.value = value;
    }
    public Matrix add(Matrix m) {
         Matrix result = new Matrix(this.col, this.row, this.value);
        for(int i = 0;i<this.row;i++) {
            for(int j = 0;j<this.col;j++){
                result.value[i][j] = m.value[i][j] + this.value[i][j];
            }
        }
        return result;
    }
    
    public void print() {
        for(int i = 0;i<this.row;i++) {
            for(int j = 0;j<this.col;j++){
                System.out.println(this.value[i][j]+"");
            }
            System.out.println("");
        }
    }

    boolean checkDX() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    

