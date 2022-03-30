package stackCalc.commands;

import stackCalc.commands.define.Define;
import stackCalc.exceptions.CalculatorExceptions;
import stackCalc.exceptions.stack.NoDefineException;

import stackCalc.Context;
import stackCalc.StackCalc;


public class Push implements CommandInterface {

    @Override
    public String commandName() {
        return "push";
    }

    @Override
    public void doCommand(StackCalc st, Context context) throws CalculatorExceptions {
        try {
            String data1 = st.read.readString();
            double value = Define.searchDefine(data1);
            if ( Double.isNaN(value) ) {
                value = Double.parseDouble(data1);
            } 
            st.log1.debug(commandName() + " " + value);
            context.getData().push(value);
            
        } catch (NumberFormatException e) {
            throw new NoDefineException();
        }
    }
}
