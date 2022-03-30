package stackCalc.commands.one_arg;

import stackCalc.commands.CommandInterface;
import stackCalc.exceptions.CalculatorExceptions;
import stackCalc.exceptions.arithmetic.NegativeRootException;
import stackCalc.exceptions.stack.EmptyStackException;
import stackCalc.Context;
import stackCalc.StackCalc;


public abstract class OneArgumentPattern implements CommandInterface {

    protected abstract double solve(double a) throws CalculatorExceptions;

    public abstract String commandName();

    @Override
    public void doCommand(StackCalc st, Context context) throws CalculatorExceptions {
        errorCheck(st, context);
    }

    private void errorCheck(StackCalc st, Context context) throws CalculatorExceptions {
        double a = 0;

        if (context.getData().empty()) {
            throw new EmptyStackException();
        }

       try {
            a = context.getData().pop();
            Double tmp = solve(a);
            st.log1.debug(commandName() + " " + a);
            context.getData().push(tmp);
         

       } catch (NegativeRootException e) {
            
            context.getData().push(a);
             throw new NegativeRootException();
        }
    }
}
