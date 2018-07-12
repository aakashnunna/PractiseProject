package com.aakash.collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class HashTableExample<S> {
	

	
	
	public static void main(String args[]) {
		
		
		Supplier<String> i = () -> "Car";
		Consumer<String>  c = x -> System.out.println(x.toLowerCase());
		Consumer<String> d = x -> System.out.println(x.toUpperCase());
		c.andThen(d).accept(i.get());
		System.out.println();
		
		
		String e = "1";
		System.out.println(("1" != e) ? "true" : "false");
		
		Double d1 = null;
		System.out.println((d1 instanceof Double) ? "true" : "false");
		
		int c2 = 0;
		System.out.println((0 == c2++) ? "true" : "false");
		
		
		Hashtable<Integer, String> _hashTable = new Hashtable<>();
		
		_hashTable.put(1, "Aakash");
		_hashTable.put(2, "Aakash N 2 ");
		_hashTable.put(3, "Aakash  3  N");
		_hashTable.put(5, "Aakash N  5 ");
		_hashTable.put(2323, "Aakash N 2323");
		_hashTable.put(null, "Aakash N 2323");
		
		// _hashTable.put(null, "Aakash"); // java.lang.NullPointerException At Run Time
		
		
		Set<Integer> set = _hashTable.keySet();
		
		Iterator<Integer> iterator =  set.iterator();
		
		while(iterator.hasNext()) {
			
			Integer key = iterator.next();
			
			System.out.println(_hashTable.get(key));
			
			
		}
		
	}

}
