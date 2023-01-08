package com.git.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();

		list.add("Pune");
		list.add("Nagpur");
		list.add("Delhi");
		list.add("Bangolore");
		list.add("Mumbai");
		//System.out.println(list);
	Iterator<String> itr=list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}
	
	}

