package com.b;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Vector v=new Vector();
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		
		Iterator itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
				
				
	}

}
