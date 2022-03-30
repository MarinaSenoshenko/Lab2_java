package stackCalc.commands;

import stackCalc.Context;
import stackCalc.StackCalc;

public class Comment implements CommandInterface {

    @Override
    public void doCommand(StackCalc st, Context context) {
    	st.read.comment();
    	st.log1.info(commandName());
    }

    @Override
    public String commandName() {
        return "comment";
    }
}
