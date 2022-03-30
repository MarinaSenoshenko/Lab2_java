package Tests;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import stackCalc.Context;
import stackCalc.StackCalc;
import stackCalc.commands.Print;
import stackCalc.exceptions.CalculatorExceptions;
import stackCalc.exceptions.stack.EmptyStackException;

public class PrintTest {
	@Test
    public void exec1() throws IOException, ClassNotFoundException, CalculatorExceptions 
    {
		Context context = new Context();
		StackCalc st = new StackCalc();
		context.getData().push((double)9);
        Print a = new Print();
        
        a.doCommand(st, context);
        
        Assert.assertTrue(Print.result() == 9);
    }
	
	@Test(expected = EmptyStackException.class)
    public void exec2() throws IOException, ClassNotFoundException, CalculatorExceptions
    { 
		Context context = new Context();
		StackCalc st = new StackCalc();
        Print a = new Print();
        
        a.doCommand(st, context);
       
    }
}
