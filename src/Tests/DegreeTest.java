package Tests;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import stackCalc.Context;
import stackCalc.commands.two_args.Degree;

public class DegreeTest {
	@Test
    public void exec() throws IOException, ClassNotFoundException 
    { 
		Context context = new Context();
        Degree a = new Degree();
        
        context.getData().push((double)3);
        context.getData().push((double)2);

        double elem1 = context.getData().pop();
        double elem2 = context.getData().pop();
        
        
        Assert.assertTrue(a.solve(elem1,elem2) == 8);
    }
	

}
