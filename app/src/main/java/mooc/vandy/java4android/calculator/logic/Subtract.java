package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract {
    // TODO - add your solution here.
    private int arg1 = 0;
    private int arg2 = 0;

    public Subtract(int argumentOne,int argumentTwo)
    {
        arg1 = argumentOne;
        arg2 = argumentTwo;
    }

    public String toString()
    {
        if (arg1 >= arg2)
        {
            return String.valueOf(arg1 - arg2);
        }
        else
        {
            return String.valueOf(arg2 - arg1);
        }
    }
}
