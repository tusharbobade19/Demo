package com.b;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList l=new ArrayList();
          l.add("A");
          l.add("10");
          l.add("A");
          l.add(null);
          System.out.println(l);
          l.remove(2);
          System.out.println(l);
          l.add(2,"M");
          l.add("N");
          System.out.println(l);
	}

}
