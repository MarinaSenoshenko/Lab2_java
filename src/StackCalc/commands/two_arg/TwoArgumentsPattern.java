package stackCalc.commands.two_args;

import stackCalc.commands.CommandInterface;
import stackCalc.exceptions.CalculatorExceptions;
import stackCalc.exceptions.arithmetic.DivideByZeroException;
import stackCalc.exceptions.stack.EmptyStackException;
import stackCalc.Context;
import stackCalc.StackCalc;


public abstract class TwoArgumentsPattern implements CommandInterface {

    protected abstract double solve(double a, double b) throws CalculatorExceptions;

    public abstract String commandName();

    @Override
    public void doCommand(StackCalc st, Context context) throws CalculatorExceptions {
        errorCheck(st, context);
    }

    private void errorCheck(StackCalc st, Context context) throws CalculatorExceptions {
        double a = 0;
        double b = 0;
        if (context.getData().empty()) {
            throw new EmptyStackException();
        }

        try {
            a = context.getData().pop();
            b = context.getData().pop();
            Double tmp = solve(a, b);
            st.log1.debug(commandName() + " " + a + " " + b);
            context.getData().push(tmp);

        } catch (DivideByZeroException e) {
            context.getData().push(b);
            context.getData().push(a);
            throw new DivideByZeroException();

        } catch (java.util.EmptyStackException e) {
            context.getData().push(a);
            throw new EmptyStackException();

        }
    }
}
