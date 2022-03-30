package Tests;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import stackCalc.Context;
import stackCalc.commands.two_args.Multiply;

public class MultiplyTest {
	@Test
    public void exec() throws IOException, ClassNotFoundException
    {
		Context context = new Context();
		Multiply a = new Multiply();
        
        context.getData().push((double)7);
        context.getData().push((double)13);

        double elem1 = context.getData().pop();
        double elem2 = context.getData().pop();
        
        Assert.assertTrue(a.solve(elem1,elem2) == 91);
    }
}
