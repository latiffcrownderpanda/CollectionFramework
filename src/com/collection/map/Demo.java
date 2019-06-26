package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/***
 * Map: Interface
 * This interface is used when you want to store a collection of key-value pair
 * Classes that implement this interface:HashMap,TreeMap,AbstractMap,WeakHashMap,LinkedHashMap,IdentityHashMap
 * @author bharat
 *
 */
public class Demo {

	public static void main(String[] args) {
		/**
		 * HashMap
		 * 1.It is implemented using hash table.
		 * 2.Execution time of get() and put() is constant.
		 * 3.It stores unique key value
		 * 4.Null values are allowed as key and value
		 * 5.It can store heterogeneous key or heterogeneous values or heterogeneous key-value pairs
		 * 6.hashmap.entrySet(), returns an set of elements of type Map.Entry
		 * 7.put() method automatically replaces the preexisting value assoiciated with specified key with new value.
		 */
		HashMap hm = new HashMap();
		hm.put(1, "Sachin");
		hm.put(1, "SachinTendulkar");
		hm.put(2, "KuldeepYadav");
		hm.put(3, "Dhoni");
		hm.put(4, "Dhoni");
		hm.put(5, null);
		hm.put(null, "Dhoni");
		hm.put(6, 12);
		hm.put("one", 14);
//		System.out.println("HashMap : "+hm.toString());
		Set set = hm.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry entryset = (Map.Entry) iterator.next();
			System.out.println(entryset.getKey() +" : "+ entryset.getValue());			
		}
		/**
		 * TreeMap
		 * 1.It stores key-value pair in sorted order.
		 * 
		 */
		TreeMap tm = new TreeMap();
		tm.put("Raj", "DDLJ");
		tm.put("Hrithik", "KNPH");
		tm.put("Abhishek", "Dhoom");
		tm.put("", "");
		Set treeset = tm.entrySet();
		Iterator treeIterator = treeset.iterator();
		while(treeIterator.hasNext()) {
			Map.Entry entry = (Map.Entry)treeIterator.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		/**
		 * LinkedHashMap
		 * 1.It maintains insertion order
		 */
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(7, "Seven");
		lhm.put(3, "Three");
		lhm.put(5, "Five");
		lhm.put(0, "Zero");
		lhm.put(8, "Eight");
		
		Set lhmset= lhm.entrySet();
		Iterator linkedIterator = lhmset.iterator();
		while(linkedIterator.hasNext()) {
			Map.Entry entry = (Map.Entry)linkedIterator.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
