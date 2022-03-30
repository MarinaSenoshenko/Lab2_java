package Tests;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import stackCalc.Context;
import stackCalc.commands.one_arg.Sqrt;
import stackCalc.exceptions.CalculatorExceptions;
import stackCalc.exceptions.arithmetic.NegativeRootException;

public class SqrtTest {
	@Test
    public void exec1() throws IOException, ClassNotFoundException, CalculatorExceptions  
    {
		Context context = new Context();
        Sqrt a = new Sqrt();
        
        context.getData().push((double)361);

        double elem = context.getData().pop();
        
        Assert.assertTrue(a.solve(elem) == 19);
    }
	
	@Test(expected = NegativeRootException.class)
	public void exec2() throws IOException, ClassNotFoundException, CalculatorExceptions 
	{
		 Context context = new Context();
	     Sqrt a = new Sqrt();
	        
	     context.getData().push((double)-361);

	     double elem = context.getData().pop();
	        
	     a.solve(elem);
	}
}
