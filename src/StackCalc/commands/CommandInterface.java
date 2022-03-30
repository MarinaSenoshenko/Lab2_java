package stackCalc.commands;
import stackCalc.Context;
import stackCalc.StackCalc;


public interface CommandInterface {
	    void doCommand(StackCalc st, Context context) throws Throwable;
	    String commandName();
}


