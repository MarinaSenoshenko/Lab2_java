package stackCalc.commands.one_arg;

public class Cos extends OneArgumentPattern {

    @Override
    public String commandName() {
        return "cos";
    }

    @Override
	public double solve(double a) {
        return Math.cos(a);
    }
}
