package com.aakash.collections;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String args[]) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
	      al.add(1);
	      al.add(88);
	      al.add(9);
	      al.add(17);
	      al.add(17);
	      al.add(9);
	      al.add(17);
	      al.add(91);
	      al.add(27);
	      al.add(1);
	      al.add(1799);

	    System.out.println("Array List 1 "+ al);
	    
	    System.out.println("Stash ");
	    
	    ArrayList<Integer> al2 = new ArrayList<Integer>();
	    al2.add(1);
	    al2.add(88);
	    al2.add(9);
	    al2.add(17);
	    al2.add(17);
	    al2.add(9);
	    al2.add(147);
	    al2.add(91);
	    al2.add(27);
	    al2.add(1);
	    al2.add(187);
	     
	   System.out.println("Array List 2 "+ al2);
	   
	   for (Integer _al1 : al) {
		   
		   String output = al2.contains(_al1) ? "True" : "False";
		   System.out.println(output);
		   
	   }
	   
	   
	   ArrayList<String> al1= new ArrayList<String>();
       al1.add("hi");
       al1.add("How are you");
       al1.add("Good Morning");
       al1.add("bye");
       al1.add("Good night");

       ArrayList<String> al22= new ArrayList<String>();
       al22.add("Howdy");
       al22.add("Good Evening");
       al22.add("bye");
       al22.add("Good night");

       //Storing the comparison output in ArrayList<String>
       ArrayList<String> al3= new ArrayList<String>();
       for (String temp : al1)
           al3.add(al22.contains(temp) ? "Yes" : "No");
       System.out.println(al3);

       //Storing the comparison output in ArrayList<Integer>
       ArrayList<Integer> al4= new ArrayList<Integer>();
       for (String temp2 : al1)
            al4.add(al22.contains(temp2) ? 1 : 0);
       System.out.println(al4);
	   
	      
	}

}
