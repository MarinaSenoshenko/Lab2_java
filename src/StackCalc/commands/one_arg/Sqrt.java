package stackCalc.commands.one_arg;

import stackCalc.exceptions.CalculatorExceptions;
import stackCalc.exceptions.arithmetic.NegativeRootException;

public class Sqrt extends OneArgumentPattern {

    @Override
    public String commandName() {
        return "sqrt";
    }

    @Override
	public double solve(double a) throws CalculatorExceptions {
        if (a < 0) {
        	throw new NegativeRootException();
        }
        return Math.sqrt(a);
    }

}
