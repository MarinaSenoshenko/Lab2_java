package stackCalc.commands.two_args;
import stackCalc.exceptions.CalculatorExceptions;
import stackCalc.exceptions.arithmetic.DivideByZeroException;

public class Divide extends TwoArgumentsPattern {

    @Override
	public double solve(double a, double b) throws CalculatorExceptions {
        if (a == 0) {
            throw new DivideByZeroException();
        }
        return b / a;
    }

    @Override
    public String commandName() {
        return "divide";
    }
}
