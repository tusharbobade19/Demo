package com.b;

import java.util.Iterator;
import java.util.Stack;

public class Stacktest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> s=new Stack<>();
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		s.push("E");
		
		s.pop();
	
		Iterator itr=s.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

}
