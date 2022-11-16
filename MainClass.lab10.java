package Lab;

import java.util.Stack;

public class MainClass
{
   public static void main(String[] args) {
	   System.out.println("Hello lab 09!");
   }
   
   public static Boolean inBalanced(String expression) {
	   
	   char[] exp = expression.toCharArray();
	   Stack<Character> stack = new Stack();

	   for(int i = 0; i<exp.length; i++ ) {
		   if(exp[i] == '(') {
			   stack.push('(');
		   }
		   if (exp[i] == ')') {
			   if(stack.isEmpty()) {
				   return false;
			   }
			   stack.pop();
		   }
	   }
	   
	   return true;
   }
   
   
   
   
   
   
}
