/*
 *  Sample code for "+" and "-" arithmetic calculator *   
 */
public class Calculator {

	public static void main(String[] args) {			
	        int    operand1 = Integer.parseInt(args[0]); //parseInt(string s) will return int
	        String operator = args[1];
	        int    operand2 = Integer.parseInt(args[2]);
	        
	        if ( operator.equals("+") ) {
	           System.out.println( operand1 + operand2 );
	        } else if ( operator.equals("-") ) {
	           System.out.println( operand1 - operand2 );
	        } else {
	           System.out.println("Invalid operator: " + operator);
	 	     } // end if
	    } // end main
}
