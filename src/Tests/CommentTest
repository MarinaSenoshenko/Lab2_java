package Tests;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;

import stackCalc.Context;
import stackCalc.StackCalc;
import stackCalc.commands.Comment;
import stackCalc.read.FileRead;

public class CommentTest {
	@Test
    public void exec() throws IOException, ClassNotFoundException 
    {    
		Context context = new Context();
		StackCalc st = new StackCalc();
		Comment a = new Comment();
		
        PrintStream stream = new PrintStream(new File("test"));
        stream.print("#comment\n" );
        stream.close();
    
        st.read = new FileRead("test");  
        
        a.doCommand(st, context); 
        
        Assert.assertEquals(a.commandName(), "comment");

    }
}
