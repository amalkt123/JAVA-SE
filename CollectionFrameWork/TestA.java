package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestA {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(12);
	al.add(22.5);
	al.add("chinnu");
	al.add(true);
	al.add(null);
	al.add('A');
	System.out.println(al);
	System.out.println(al.get(2));
	for(int i=0;i<6;i++) {
		Object obj=al.get(i);
		System.out.println(obj);
	}
}
}
