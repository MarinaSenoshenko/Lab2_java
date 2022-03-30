package Tests;

import java.io.File;
import java.io.PrintStream;


import org.junit.Assert;
import org.junit.Test;

import stackCalc.Context;
import stackCalc.StackCalc;
import stackCalc.commands.Print;
import stackCalc.read.FileRead;


public class StackCalcTest {
	
	@Test
    public void execute() throws Throwable
    {
		Context context = new Context();
		StackCalc st = new StackCalc();

        PrintStream stream = new PrintStream(new File("test"));
        stream.print("DEFINE a 4\n" +
                     "PUSH a\n" +
                     "PUSH 4\n" +
                     "DefinE b 13\n" +
                     "PUSH b\n" +
                     "PUSH 33\n" +
                     "PUSH 16\n" +
                     "#PUSH 16\n" +
                     "sqrt\n" +
                     "PUawSH 4\n" +
                     "minus\n" +
                     "plus\n" +
                     "push 2\n" +
                     "divide\n" +
                     "push 3\n" +
                     "divide\n" +
                     "multiply\n" +
                     "plus\n" +
                     "PRINT");
        stream.close();
    
        st.read = new FileRead("test");

        st.Calc(context);

        Assert.assertTrue(Print.result() == 32);
    }

}
