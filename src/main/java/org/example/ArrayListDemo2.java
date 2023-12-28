package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
    public static void main(String args[]) {

        ArrayList arrayList = new ArrayList();

        arrayList.add("X");
        arrayList.add("Y");
        arrayList.add("Z");
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        ArrayList newArrayList = new ArrayList();

        newArrayList.addAll(arrayList);

        System.out.println(newArrayList);

        newArrayList.remove(arrayList);
        System.out.println("the new arraylist after remove the arraylist collection from it");
//        System.out.println(newArrayList.removeAll(arrayList));
//        System.out.println(newArrayList);

        // sort arraylist using collections class

        Collections.sort(newArrayList);
        System.out.println(newArrayList);
        Collections.sort(newArrayList, Collections.reverseOrder());// to order in reverse order

        System.out.println(newArrayList);

        // shuffling the elements

        Collections.shuffle(newArrayList);
        System.out.println(newArrayList);

    }
}
