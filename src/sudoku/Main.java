/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author michael
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        /*
        int[][] starting = new int[][]
        {
          new int[]{0, 0, 9, 0, 0, 0, 0, 0, 0},
          new int[]{4, 0, 0, 0, 0, 5, 1, 0, 0},
          new int[]{2, 6, 3, 0, 0, 0, 9, 0, 0},
          new int[]{0, 0, 0, 0, 8, 9, 0, 0, 3},
          new int[]{0, 0, 1, 0, 6, 0, 2, 0, 0},
          new int[]{5, 0, 0, 1, 4, 0, 0, 0, 0},
          new int[]{0, 0, 2, 0, 0, 0, 5, 9, 8},
          new int[]{0, 0, 8, 9, 0, 0, 0, 0, 6},
          new int[]{0, 0, 0, 0, 0, 0, 4, 0, 0}
        };
        */
        /*
        int[][] starting = new int[][]
        {
          new int[]{0, 0, 9, 0, 0, 0, 0, 0, 0},
          new int[]{4, 0, 0, 0, 0, 5, 1, 0, 0},
          new int[]{2, 6, 3, 0, 0, 0, 9, 0, 0},
          new int[]{0, 0, 0, 0, 8, 9, 0, 0, 3},
          new int[]{0, 0, 1, 0, 6, 0, 2, 0, 0},
          new int[]{5, 0, 0, 1, 4, 0, 0, 0, 0},
          new int[]{0, 0, 2, 0, 0, 0, 5, 9, 8},
          new int[]{0, 0, 8, 9, 0, 0, 0, 0, 6},
          new int[]{0, 0, 0, 0, 0, 0, 4, 0, 0}
        };
        */
        /*
        int[][] starting = new int[][]{
          new int[]{0, 0, 0, 0, 0, 9, 3, 0, 6},
          new int[]{0, 0, 3, 0, 0, 0, 7, 0, 9},
          new int[]{0, 0, 0, 8, 0, 6, 0, 0, 5},
          new int[]{9, 0, 1, 3, 0, 0, 0, 0, 0},
          new int[]{0, 0, 2, 0, 0, 0, 8, 0, 0},
          new int[]{0, 0, 0, 0, 0, 2, 1, 0, 3},
          new int[]{1, 0, 0, 7, 0, 5, 0, 0, 0},
          new int[]{6, 0, 4, 0, 0, 0, 9, 0, 0},
          new int[]{3, 0, 8, 1, 0, 0, 0, 0, 0}
        };
*/
        int[][] starting = new int[][]{
          new int[]{0, 0, 9, 0, 2, 3, 0, 0, 0},
          new int[]{0, 7, 6, 0, 0, 0, 0, 4, 3},
          new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1},
          new int[]{0, 0, 0, 0, 0, 6, 0, 0, 7},
          new int[]{0, 0, 0, 1, 8, 4, 0, 0, 0},
          new int[]{8, 0, 0, 7, 0, 0, 0, 0, 0},
          new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0},
          new int[]{5, 6, 0, 0, 0, 0, 9, 8, 0},
          new int[]{0, 0, 0, 8, 3, 0, 4, 0, 0}
            
        };
        
        
        Solver test = new Solver(starting);
        
        test.print();
    }
    
}
