/**
 * 
 */
/**
 * @author bharat
 *
 */
package com.collections.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Demo {
	public static void main(String args[]) {
		/**
		 * Hash Set 1.Unique values are stored 2.Execution time of add remove contains
		 * is constant 3.Does not guarantee order of its elements 4.Backed by HashMap,
		 * implemented using hashtable 5.It is not synchronized that means it is not
		 * thread safe
		 * 
		 */
		ArrayList al = new ArrayList();
		al.add(121);
		HashSet hs = new HashSet(al);
		hs.add(null);
		hs.add(null);
		hs.add("Bharat");
		hs.add("Shruti");
		hs.add("Pradnya");
		hs.add("Dhanashri");
		hs.add("Hemangi");
		hs.add("Snehals");
		hs.add("bharat");
		System.out.println("Hash Set : " + hs.toString());
		System.out.println("Hash Set : " + hs.size());
		/**
		 * Linked Hash Set 1.Unique values are stored 2.Execution time of add remove
		 * size contains is constant 3.It maintains insertion order of its elements
		 */

		LinkedHashSet lhs = new LinkedHashSet(al);
		lhs.add("Bharat");
		lhs.add("Shruti");
		lhs.add("Pradnya");
		lhs.add("Dhanashri");
		lhs.add("Hemangi");
		lhs.add("Snehal");
		lhs.add("Bharat");
		System.out.println("Linked Hash Set : " + lhs.toString());
		System.out.println("Linked Hash Set : " + lhs.size());
		/**
		 * TreeSet 1.Unique values are stored 2.Execution time of add remove contains is
		 * more compared to hashset 2.Does not allow null values 3.Backed by TreeMap,
		 * implemented using self balancing binary search tree(Red Black Tree) 4.TreeSet
		 * maintains sorted order 5.TreeSet does not allow insertion of Heterogeneous
		 * elements 6.It is not synchronized that means it is not thread safe
		 */
		TreeSet<String> ts = new TreeSet<String>();
//		ts.add(null); Does not allow null values
		ts.add("Chetan");
		ts.add("Chetan");
		ts.add("Gopal");
		ts.add("Gaurav");
		ts.add("Renu");
		ts.add("Antara");
		ts.add("antara");
//		ts.add(12); Does not allow insertion of hetrogeneneius elements
		System.out.println("Tree Set : " + ts.toString());
		System.out.println("Tree Set : " + ts.size());
	}

}