/**
 * List Interface Examples
 * It represents an ordered sequence of objects
 * List implementation classes :ArrayList, LinkedList, Vector, Stack 
 * Both ArrayList and LinkedList are not synchronized, which means you can not share them between multiple threads without external synchronization.
 * @author bharat
 *
 */
package com.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo{
	public static void main(String args[]) {
		
		/**
		 * ArrayList
		 * 1.Elements can be iterated in order
		 * 2.Allows null values in list
		 * 3.ArrayList is implimented as Array
		 * 4.Operations of get and set are faster as compare to LinkedList
		 * 5.ArrayList grows 50% of its size each time
		 */
		List<String> lt = new ArrayList<String>();
		 //1.append element at end of list
		lt.add("Tiger");
		lt.add("Lion");
		lt.add("Cheeta");
		//2.add element at specified location
		lt.add(1,"Monkey");
		//3.null values are allowed in list
		lt.add(null);
		lt.add(null);
		System.out.println("Array List :"+lt.toString());
		List<String> lt1 = new ArrayList<String>();
		lt1.add("Peacock");
		lt1.add("penguin");
		 //4.add elements from another collection
		lt.addAll(lt1);
		System.out.println("Array List :"+lt.toString());
		//5.Access element by index
		System.out.println(" Element at index 1:"+lt.get(1));
		//6.Find index of element in list "Cheeta"
		System.out.println("Index of \"Chetta\" in list :"+lt.indexOf("Cheeta1")); //returns -1 if element not found
		System.out.println("Last index of : "+lt.lastIndexOf(null));
		//7.Check if element present in List
		if(lt.contains(null))
			System.out.println("Element present");
		else
			System.out.println("Element not Present");
		List<Integer> lt2 = new ArrayList<Integer>();
		lt2.add(1);
		lt2.add(2);
		lt2.add(3);
		lt2.add(null);
		lt2.add(null);		
		//8.Remove element from list
		lt2.remove(new Integer(1));
		System.out.println(lt2.toString());
		List<String> lt4 = new ArrayList<String>();
		lt4.add("Cheeta");
		lt4.add("Tiger");
		//9.Retain all in collection passed as paramter, intersection of list
//		lt.retainAll(lt4); 
		System.out.println(lt.toString());
		List<String> sublist = lt.subList(0, 3);
		System.out.println("sublist: "+  sublist);
		//10.Convert List to Array
		String objarr[] = lt.toArray(new String[0]);
		for(String obj:objarr) {
			System.out.println(obj+ " ");
		}
		//11.Collections.sort(lt); can not sort with null values
		System.out.println("Sorted  List: " +lt.toString());
		
		/**
		 * LinkedList
		 * 1.It is an ordered collection of Objects
		 * 2.null values are allowed in LinkedList
		 * 3.Performance is good for operation add remove compared to ArrayList
		 */
		List list = new LinkedList();
		list.add(null);
		list.add(null);
		
		System.out.println("LinkedList :"+list.toString());
		
	}
	
	
}