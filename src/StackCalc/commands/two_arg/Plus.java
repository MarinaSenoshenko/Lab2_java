package stackCalc.commands.two_args;


public class Plus extends TwoArgumentsPattern {

    @Override
    public String commandName() {
        return "plus";
    }

    @Override
	public double solve(double a, double b) {
        return a + b;
    }

}
