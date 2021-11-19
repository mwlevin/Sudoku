/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author michael
 */
public class Solver 
{
    public static boolean SOLVE = true;
    
    private Square[][] squares;
    private List<Group> groups;
    
    
    public Solver(int[][] starting)
    {
        squares = new Square[9][9];
        
        for(int r = 0; r < 9; r++)
        {
            for(int c = 0; c < 9; c++)
            {
                squares[r][c] = new Square(r, c);
                
                if(starting[r][c] != 0)
                {
                    squares[r][c].setValue(starting[r][c]);
                }
 
            }
        }
        
        groups = new ArrayList<>();
        
        // boxes
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                Square[] g = new Square[9];
 
                
                for(int r = 0; r < 3; r++)
                {
                    for(int c = 0; c < 3; c++)
                    {
                        g[r*3+c] = squares[i*3+r][j*3+c];
                    }
                }
                
                groups.add(new Group(g));
            }
        }
        
        // rows
        
        for(int r = 0; r < 9; r++)
        {
            Square[] g = new Square[9];
            
            for(int c = 0; c < 9; c++)
            {
                g[c] = squares[r][c];
                
            }
            
            groups.add(new Group(g));
        }
        
        // columns
        
        for(int c = 0; c < 9; c++)
        {
            Square[] g = new Square[9];
            
            for(int r = 0; r < 9; r++)
            {
                g[r] = squares[r][c];
            }
            
            
            Group group = new Group(g);
            groups.add(group);
            
        }
        
        
        for(int r = 0; r < 9; r++)
        {
            for(int c = 0; c < 9; c++)
            {
                if(starting[r][c] != 0)
                {
                    squares[r][c].setValue(starting[r][c]);
                }
 
            }
        }
        
        /*
        for(int r = 0; r < squares.length; r++)
        {
            for(int c = 0; c < squares[r].length; c++)
            {
                if(squares[r][c].getNumPossible() == 1 && squares[r][c].isSet()== false)
                {
                    System.out.println(r+" "+c+" "+squares[r][c].resolve());
                }
            }
        }
        */

        //System.out.println(Arrays.toString(squares[0][6].getPossible()));
        
    }
    
    public void solve()
    {
        
    }
    
    public int[][] getSolved()
    {
        int[][] output = new int[squares.length][squares[0].length];
        
        for(int r = 0; r < squares.length; r++)
        {
            for(int c = 0; c < squares[r].length; c++)
            {
                output[r][c] = squares[r][c].getValue();
            }
        }
        
        return output;
    }
    
    public void print()
    {
        int[][] solved = getSolved();
        
        for(int r = 0; r < solved.length; r++)
        {
            for(int c = 0; c < solved[r].length; c++)
            {
                if(solved[r][c] > 0)
                {
                    System.out.print(solved[r][c]+" ");
                }
                else
                {
                    System.out.print("  ");
                }
                
                if((c+1) % 3 == 0)
                {
                    System.out.print(" ");
                }
            }
            
            if((r+1)%3 == 0)
            {
                System.out.println();
            }
            System.out.println();
        }
    }
}
