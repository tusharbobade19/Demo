package com.b;
import java.util.*;
public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashSet h=new HashSet();
        h.add("B");
        h.add("C");
        h.add("D");
        h.add("Z");
        h.add(null);
        h.add(10);
        System.out.println(h.add("Z"));
        System.out.println(h);
	}

}
