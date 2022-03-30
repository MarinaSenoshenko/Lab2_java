package stackCalc.exceptions.stack;

public class NoDefineException extends StackException {

	public NoDefineException() {
        super("This DEFINE isn't exists!");
    }
}