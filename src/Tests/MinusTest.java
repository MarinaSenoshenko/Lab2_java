package Tests;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import stackCalc.Context;
import stackCalc.commands.two_args.Minus;
import stackCalc.exceptions.arithmetic.DivideByZeroException;

public class MinusTest {
	@Test
    public void exec() throws DivideByZeroException, IOException, ClassNotFoundException  
    {
		Context context = new Context();
        Minus a = new Minus();
        
        context.getData().push((double)13);
        context.getData().push((double)71);

        double elem1 = context.getData().pop();
        double elem2 = context.getData().pop();
        
        Assert.assertTrue(a.solve(elem1,elem2) == -58);
    }
}
