package stackCalc.commands.two_args;

public class Degree extends TwoArgumentsPattern {

    @Override
    public String commandName() {
        return "degree";
    }

    @Override
	public double solve(double a, double b) {
        return Math.pow(a, b);
    }
}
