package stackCalc.commands.one_arg;


public class Square extends OneArgumentPattern {

    @Override
    public String commandName() {
        return "square";
    }

    @Override
	public double solve(double a) {
        return a * a;
    }

}
