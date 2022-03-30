package Tests;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import org.junit.Assert;
import org.junit.Test;

import stackCalc.Context;
import stackCalc.StackCalc;
import stackCalc.commands.Push;
import stackCalc.commands.define.Define;
import stackCalc.commands.define.DefineElement;
import stackCalc.exceptions.CalculatorExceptions;
import stackCalc.exceptions.stack.NoDefineException;
import stackCalc.read.FileRead;

public class PushTest {
	
	@Test
    public void exec1() throws IOException, ClassNotFoundException, CalculatorExceptions 
    { 
		Context context = new Context();
		StackCalc st = new StackCalc();
		Push a = new Push();
		
        PrintStream stream = new PrintStream(new File("test"));
        stream.print("4\n" );
        stream.close();
    
        st.read = new FileRead("test");  
        
        a.doCommand(st, context); 
                  
        Assert.assertTrue(context.getData().peek() == 4);
    }
	
	@Test
    public void exec2() throws IOException, ClassNotFoundException, CalculatorExceptions 
    { 
		Context context = new Context();
		StackCalc st = new StackCalc();
		DefineElement c = new DefineElement("a", 4);
		Define b = new Define();
		b.createNew(c);
		
		Push a = new Push();
		
        PrintStream stream = new PrintStream(new File("test"));
        stream.print("a\n" );
        stream.close();
    
        st.read = new FileRead("test");  
        
        a.doCommand(st, context); 
                  
        Assert.assertTrue(context.getData().peek() == 4);
    }
	
	@Test(expected = NoDefineException.class)
    public void exec3() throws IOException, ClassNotFoundException, CalculatorExceptions 
    {
		Context context = new Context();
		StackCalc st = new StackCalc();
		
		Push a = new Push();
		
        PrintStream stream = new PrintStream(new File("test"));
        stream.print("e\n" );
        stream.close();
    
        st.read = new FileRead("test"); 
        
        a.doCommand(st, context); 
                       
    }
		
}
