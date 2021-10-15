package com.greatlearning.main;

import java.util.Stack;

public class BalancingBrackets {
	
	
	
	public static boolean isBalanced(String bracketExpression){
		
		Stack stack = new Stack();
		
		for(int i=0;i<bracketExpression.length();i++) {
			char c = bracketExpression.charAt(i);
			
			if(c=='('||c=='['||c=='{') {
				stack.push(c);
			}
			else {
				if(!stack.empty()) {
				
					char popped = (char)stack.pop(); 
					if(c=='}'&& popped!='{' ||c==']'&& popped!='[' ||c =='}'&& popped!='{') {
						return false;
					}
				}
				
				else {
					return false;
				}
			}
			
		}
		if(stack.empty()) {
		return true;
		}
		return false;

	}
	
	
	

	public static void main(String[] args) {
		String bracketExpression = "([[{}]])";
		
		
		if(isBalanced(bracketExpression)) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("Not Balanced");
		}

	}

}
