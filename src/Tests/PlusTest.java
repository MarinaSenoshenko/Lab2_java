package Tests;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import stackCalc.Context;
import stackCalc.commands.two_args.Plus;
import stackCalc.exceptions.arithmetic.DivideByZeroException;

public class PlusTest {
	@Test
    public void exec() throws DivideByZeroException, IOException, ClassNotFoundException 
    {
		Context context = new Context();
        Plus a = new Plus();
        
        context.getData().push((double)17);
        context.getData().push((double)95);

        double elem1 = context.getData().pop();
        double elem2 = context.getData().pop();
        
        Assert.assertTrue(a.solve(elem1,elem2) == 112);
    }
}
