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
public class Square 
{
    private boolean[] possible;
    private int val;
    private List<Group> groups;
    
    private int numPossible;
    private int r, c;
    
    private boolean set;
    
    public Square(int r, int c)
    {
        this.r = r;
        this.c = c;
        
        possible = new boolean[9];
        
        for(int i = 0; i < possible.length; i++)
        {
            possible[i] = true;
        }
        numPossible = 9;
        
        groups = new ArrayList<>();
    }
    
    public boolean[] getPossible()
    {
        return possible;
    }
    
    public void addGroup(Group g)
    {
        groups.add(g);
    }
    
    public int getValue()
    {
        return val;
    }
    
    public void setValue(int val)
    {
        this.set = true;
        this.val = val;
        for(int i = 0; i < possible.length; i++)
        {
            possible[i] = (i == val-1);
        }
        numPossible = 1;
        
        // update group
        updateGroups();
    }
    
    public void updateGroups()
    {
        if(val > 0)
        {
            for(Group g : groups)
            {
                g.exclude(val, new Square[]{this});
            }
        }
    }
    
    public boolean isSet()
    {
        return set;
    }
    
    public int getRow()
    {
        return r;
    }
    
    public int getCol()
    {
        return c;
    }
    
    public void exclude(int num)
    {
        if(possible[num-1])
        {
            numPossible--;
            possible[num-1] = false;
            
            if(Solver.SOLVE)
            {
                checkSolved();
            }
        }

        
        
    }
    
    public void checkSolved()
    {
        if(numPossible == 1)
        {
            // determine value
            
            for(int i = 0; i < possible.length; i++)
            {
                if(possible[i])
                {
                    val = i+1;
                    // update group
                    updateGroups();
                }
            }
        }
    }
    
    public int resolve()
    {
        if(numPossible == 1)
        {
            // determine value
            
            for(int i = 0; i < possible.length; i++)
            {
                if(possible[i])
                {
                    return i+1;
                }
            }
        }
        
        return 0;
    }
    
    public int getNumPossible()
    {
        return numPossible;
    }
    
    public String toString()
    {
        return "("+r+","+c+")";
    }
}
