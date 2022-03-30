package stackCalc;

import out.ConsoleOut;
import out.Out;
import stackCalc.commands.CommandInterface;
import stackCalc.exceptions.CalculatorExceptions;
import stackCalc.exceptions.stack.ExitException;
import stackCalc.read.ConsoleReader;
import stackCalc.read.FileRead;
import stackCalc.read.Reader;

import java.io.FileNotFoundException;
import org.apache.log4j.Logger; 

public class StackCalc {
    public Reader read = new ConsoleReader();
    public Out out = new ConsoleOut();
    public Logger log1 = Logger.getLogger(StackCalc.class.getName());   
 
    
    public void Calc(Context context) throws Throwable {
   
    	try {         
            while (read.hasNext()) {
                String str = read.readString().toLowerCase();
            
            	if (str.charAt(0) == '#') {
            		str = "#";			
            	}
            	
            	if (context.getHashMap().containsKey(str)) {
            	   CommandInterface command = (CommandInterface)getOperationClass(str, context).getConstructor().newInstance();
           	       command.doCommand(this, context);
           	    }
 
            	
            	else {
            		log1.info("Unknown command: " + str);
                    out.print("Unknown command ");
                    read.comment();            	
                }            	
            } 
    	}
     
    	catch (CalculatorExceptions e) {
    		log1.error(e.getMessage());
            out.print(e);
    	}
    }    	



    public static void main(String[] args) throws Throwable {    	
           
    	   StackCalc st = new StackCalc();
           System.out.println("Print path for file with commands:");
           String fileName = st.read.readString();
           

           try (Reader fileRead = new FileRead(fileName)) {
               st.read = new FileRead(fileName); 	

           } catch (FileNotFoundException e) {

               System.out.println("File not found. Print commands for console:");
           }  
           Context context = new Context();
               
           st.Calc(context);
    }
    
    public Class<?> getOperationClass(String name, Context context) throws CalculatorExceptions
    {
        name = name.toLowerCase();
        if (context.getHashMap().containsKey(name)) {
            return context.getHashMap().get(name);
        }    
        else {
            throw new ExitException();
        }
     }
    
}
