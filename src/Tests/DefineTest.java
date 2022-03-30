package Tests;


import java.io.IOException;


import org.junit.Assert;
import org.junit.Test;

import stackCalc.commands.define.Define;
import stackCalc.commands.define.DefineElement;

public class DefineTest {

	@Test
    public void exec() throws IOException
    {		
		DefineElement a = new DefineElement("a", 4);
		Define b = new Define();
		b.createNew(a);
        Assert.assertTrue((int)Define.searchDefine("a") == 4);
    }

}
