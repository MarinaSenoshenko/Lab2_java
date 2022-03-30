package Tests;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import stackCalc.Context;
import stackCalc.commands.one_arg.Sin;

public class SinTest {
	
	@Test
    public void exec() throws IOException, ClassNotFoundException 
    {
		Context context = new Context();
        Sin a = new Sin();
        
        context.getData().push((double)0);

        double elem = context.getData().pop();
        
        Assert.assertTrue(a.solve(elem) == 0);
    }
}
