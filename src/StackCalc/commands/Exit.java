package stackCalc.commands;

import stackCalc.Context;
import stackCalc.StackCalc;
import stackCalc.exceptions.CalculatorExceptions;
import stackCalc.exceptions.stack.ExitException;

public class Exit implements CommandInterface {
	
    @Override
    public void doCommand(StackCalc st, Context context) throws CalculatorExceptions {
        throw new ExitException();
    }

    @Override
    public String commandName() {
        return "exit";
    }
}
