package mooc.vandy.java4android.calculator.logic;

import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    
    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
        
    }

    

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {
        // TODO - Put your code here.
        if (operation == 1)
        {
            //addition
            Add a1 = new Add(argumentOne,argumentTwo);
            mOut.print(a1.toString());
        }
        else if (operation == 2)
        {
            //subtraction
            Subtract s1 = new Subtract(argumentOne,argumentTwo);
            mOut.print(s1.toString());
        }
        else if (operation == 3)
        {
            //multiplication
            Multiply m1 = new Multiply(argumentOne,argumentTwo);
            mOut.print(m1.toString());
        }
        else //operation == 4
        {
            //division
            Divide d1 = new Divide(argumentOne,argumentTwo);
            mOut.print(d1.toString());
        }
    }
}
