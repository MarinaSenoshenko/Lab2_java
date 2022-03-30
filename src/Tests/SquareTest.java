package Tests;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import stackCalc.Context;
import stackCalc.commands.one_arg.Square;

public class SquareTest {
	@Test
    public void exec() throws IOException, ClassNotFoundException
    { 
		Context context = new Context();
        Square a = new Square();
        
        context.getData().push((double)16);

        double elem = context.getData().pop();
        
        Assert.assertTrue(a.solve(elem) == 256);
    }
}
