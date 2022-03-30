package stackCalc.commands.one_arg;

public class Sin extends OneArgumentPattern {
    @Override
	public double solve(double a) {
        return Math.sin(a);
    }

    @Override
    public String commandName() {
        return "sin";
    }
}
