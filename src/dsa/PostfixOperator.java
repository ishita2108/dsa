package dsa;

//
//Question: Evaluate a postfix expression.
//
//Solution: Use a stack to store operands, and when encountering an operator, pop the necessary operands, perform the operation, and push the result.

import java.util.Stack;

public class PostfixOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   String postfixExpression = "231*+9-";  // Equivalent to: (2 + (3 * 1)) - 9
	        int result = evaluatePostfix(postfixExpression);
	        System.out.println("The result of the postfix expression is: " + result);  // Output: -4
	    }

	private static int evaluatePostfix(String postfixExpression) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int i = 0; i < postfixExpression.length(); i++) {
            char ch = postfixExpression.charAt(i);

            // If the character is a digit, push it to the stack
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');  // Convert char to int by subtracting '0'
            }else {
            	 // Pop two operands from the stack
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                // Perform the operation based on the operator
                switch (ch) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                }
            	
            }
            
		}
		return stack.pop();
	}

	}

