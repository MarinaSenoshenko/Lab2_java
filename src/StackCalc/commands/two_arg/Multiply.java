package stackCalc.commands.two_args;

public class Multiply extends TwoArgumentsPattern {

    @Override
	public double solve(double a, double b) {
        return a * b;
    }

    @Override
    public String commandName() {
        return "multiply";
    }
}
