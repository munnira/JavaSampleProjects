package com.munni.stackQueueExamples;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class BalancedExpression {
	private int sp;
	private int[] theStack;
	private static final int MAX_STACK_SIZE = 6;
	
	public BalancedExpression() // Default Constructor
	{
		sp = 0; // the stack pointer
		theStack = new int[MAX_STACK_SIZE];
	}

	public void push(int value) // Method to push an expression into the stack
	{
		if (!full())
			theStack[sp++] = value;
	}

	public int pop() // Method to pop an expression out of the stack
	{
		if (!empty())
			return theStack[--sp];

		else
			return -1;
	}

	public boolean full() // Method to determine if the stack is full
	{
		if (sp == MAX_STACK_SIZE)
			return true;

		else
			return false;
	}

	public boolean empty() // Method to determine if the stack is empty
	{
		if (sp == 0)
			return true;

		else
			return false;
	}

	public static boolean checkExpression(String ex) // Method to check
														// Expression in stack
	{
		BalancedExpression stExpression = new BalancedExpression();
		for (int i = 0; i < MAX_STACK_SIZE; i++) {
			char ch = ex.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[')
				stExpression.push(ch);
			else if (ch == ')' && !stExpression.empty()
					&& stExpression.equals('('))
				stExpression.pop();
			else if (ch == '}' && !stExpression.empty()
					&& stExpression.equals('{'))
				stExpression.pop();
			else if (ch == ']' && !stExpression.empty()
					&& stExpression.equals('['))
				stExpression.pop();
			else if (ch == ')' || ch == '}' || ch == ']')
				return false;
		}
		if (!stExpression.empty())
			return false;
		return true;
	}
}

public class BalanceBraces1 {

	public static void main(String[] args) {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader console = new BufferedReader(reader);

		BalancedExpression exp = new BalancedExpression();
		String expression = "";

		do {
			try {
				System.out.print("Enter an Expression: ");
				expression = console.readLine();

				if ("$".equals(expression))
					break;

			} catch (Exception e) {
				System.out.println("IO error:" + e);
			}

		} while (!expression.equals(""));// End of while loop
	}
}// End of class ExpressionChecker