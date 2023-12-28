package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

    public static void main(String[] args) {
        // declare arraylist
        //ArrayList<String> arrayList1=new ArrayList<String>(); // accept only String
        //List<Integer> arrIntegers =new ArrayList<Integer>(); // declare arraylist using List Interface
        ArrayList arrayList = new ArrayList(); // accept any type of data

        arrayList.add(100);
        arrayList.add("azza");
        arrayList.add(true);
        arrayList.add('A');
        arrayList.add(15.5);
        System.out.println(arrayList); // display the arraylist
        System.out.println("the size of the arraylist is " + arrayList.size()); // display the size of the arraylist

        arrayList.remove(1); // it will remove the second element  which is azza here
        //arrayList.remove("azza"); // remove by object name
        System.out.println(arrayList); // display only four elements after remove the second item
        arrayList.add(1, "fayrouz");
        System.out.println(arrayList);
        System.out.println(arrayList.get(3)); // get specific element
        arrayList.set(0, "antar"); // change or replace specific element
        System.out.println(arrayList);

        System.out.println(arrayList.contains("antar")); // search for a specific element

        System.out.println(arrayList.isEmpty()); // check if the arraylist is empty or not

        // reading elements of the arraylist

        // using for loop
        System.out.println("Reading elements using for loop ....");
        for (int i = 0; i < arrayList.size(); i++) {

            System.out.println(arrayList.get(i));
        }

        // using for..each loop
        System.out.println("Reading elements using for..each loop ....");
        for (Object e : arrayList) {
            System.out.println(e);
        }

        // using iterator

        System.out.println("Reading elements using Iterator....");

        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
