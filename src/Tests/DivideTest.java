package Tests;

import java.io.IOException;

import org.junit.Assert;


import org.junit.Test;

import stackCalc.Context;
import stackCalc.commands.two_args.Divide;
import stackCalc.exceptions.CalculatorExceptions;
import stackCalc.exceptions.arithmetic.DivideByZeroException;

public class DivideTest {
	@Test
    public void exec1() throws IOException, ClassNotFoundException, CalculatorExceptions 
    {
		Context context = new Context();
        Divide a = new Divide();
        
        context.getData().push((double)90);
        context.getData().push((double)90);

        double elem1 = context.getData().pop();
        double elem2 = context.getData().pop();
        
        Assert.assertTrue(a.solve(elem1,elem2) == 1);
    }
	

	@Test(expected = DivideByZeroException.class)
    public void exec2() throws IOException, ClassNotFoundException, CalculatorExceptions 
    {     
		Context context = new Context();
        Divide a = new Divide();
        
        context.getData().push((double)90);
        context.getData().push((double)0);

        double elem1 = context.getData().pop();
        double elem2 = context.getData().pop();
        a.solve(elem1,elem2);
        
    }
}
