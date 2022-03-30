package stackCalc.commands.two_args;


public class Minus extends TwoArgumentsPattern {

    @Override
    public String commandName() {
        return "minus";
    }

    @Override
	public double solve(double a, double b) {
        return b - a;
    }

}
