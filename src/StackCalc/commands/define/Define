package stackCalc.commands.define;


import stackCalc.commands.CommandInterface;

import java.util.ArrayList;

import stackCalc.Context;
import stackCalc.StackCalc;


public class Define implements CommandInterface {

    private static ArrayList<DefineElement> array = new ArrayList<>();

    @Override
    public void doCommand(StackCalc st, Context context) {
        String tmpStr = st.read.readString();
        double tmpDouble = st.read.readDouble();
        st.log1.debug(commandName() + " " + tmpStr + " " + tmpDouble);

        createNew(new DefineElement(tmpStr, tmpDouble));
    }

    @Override
    public String commandName() {
        return "define";
    }

    public void createNew(DefineElement element) {
        if (search(element)) {
            array.add(element);
        }

    }

    public static double searchDefine(String name) {

        for (int i = 0; i < array.size(); i++) {
            var tmp = array.get(i);
            if (tmp.name.equals(name)) {
                return tmp.value;
            }
        }
        return Double.NaN;
    }

    private boolean search(DefineElement element) {

        for (int i = 0; i < array.size(); i++) {
            var tmp = array.get(i);
            if (tmp.name.equals(element.name)) {
                tmp.value = element.value;
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for (var tmp : array) {
            str.append(tmp.toString() + "\n");
        }
        return str.toString();
    }
}
