package stackCalc.commands;

import stackCalc.Context;
import stackCalc.StackCalc;
import stackCalc.exceptions.CalculatorExceptions;
import stackCalc.exceptions.stack.EmptyStackException;

public class Print implements CommandInterface {
    
    public static double tmpString;
   
    @Override
    public String commandName() {
        return "print";
    }

    @Override
    public void doCommand(StackCalc st, Context context) throws CalculatorExceptions {

    	try {
            tmpString = context.getData().peek();  
		    st.log1.debug(commandName() + " " + tmpString);
		    st.out.print(tmpString);
    	}
    	catch (Exception e) {
    		 throw new EmptyStackException();
    	}
    }
    
    public static double result() {
    	
		return tmpString;
    }
}
