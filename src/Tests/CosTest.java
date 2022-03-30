package Tests;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import stackCalc.Context;
import stackCalc.commands.one_arg.Cos;

public class CosTest {
	
	@Test
    public void exec() throws IOException, ClassNotFoundException 
    {      
		Context context = new Context();
        Cos a = new Cos();
        
        context.getData().push((double)0);

        double elem = context.getData().pop();
        
        Assert.assertTrue(a.solve(elem) == 1);
    }
	
}
