package stackCalc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Context {
	 private Stack<Double> data = new Stack<>();;
	 private HashMap<String, Class<?>> operations = new HashMap<String, Class<?>>();
	 
	 public Context() throws FileNotFoundException, ClassNotFoundException {
		 ScanOperation();
	 }
	 
	 public Stack<Double> getData() {
		 return data;
	 }
	 
	 public HashMap<String, Class<?>> getHashMap() {
		 return operations;
	 }
	 
	 private void ScanOperation() throws FileNotFoundException, ClassNotFoundException {
	     Scanner scan = new Scanner(new File("config"));
         while (scan.hasNext()) {
             String op, classPath;
             op = scan.next().toLowerCase();
             classPath = scan.next();
             operations.put(op, Class.forName(classPath));
         } 
         scan.close();
   }	 
}
