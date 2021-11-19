/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author michael
 */
public class Group 
{
    private Square[] squares;
    
    public Group(Square[] squares)
    {
        this.squares = squares;
        
        for(Square s : squares)
        {
            s.addGroup(this);
        }
    }
    
    public Group(List<Square> list)
    {
        squares = new Square[9];
        
        for(int i = 0; i < list.size(); i++)
        {
            squares[i] = list.get(i);
        }
        
        for(Square s : squares)
        {
            s.addGroup(this);
        }
    }
    
    public void exclude(int val, Square[] identified)
    {
        
        outer: for(Square s : squares)
        {
            for(Square j : identified)
            {
                if(s == j)
                {
                    continue outer;
                }
            }
            
            s.exclude(val);
            
            /*
            if(s.getRow() == 0 && s.getCol() == 6)
            {
                System.out.println("excluding "+val+" from "+identified[0]);
            }
            */
        }
    }
    
    public String toString()
    {
        String output = "";
        
        for(Square s : squares)
        {
            output += "("+s.getRow()+","+s.getCol()+") ";
        }
        
        return output;
    }
}
