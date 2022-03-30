package Tests;

import java.io.IOException;
import org.junit.Test;

import stackCalc.Context;
import stackCalc.StackCalc;
import stackCalc.commands.Exit;
import stackCalc.exceptions.CalculatorExceptions;
import stackCalc.exceptions.stack.ExitException;

public class ExitTest {
	@Test(expected = ExitException.class)
    public void exec() throws IOException, ClassNotFoundException, CalculatorExceptions
    {   
		Context context = new Context();
		StackCalc st = new StackCalc();
		Exit a = new Exit();
        a.doCommand(st, context); 
    }
}
