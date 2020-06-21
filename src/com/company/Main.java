package com.company;

/*
 *
 *
 * Classname: Main
 * Date: 21.06.2020
 * @author: Stavnichuk Dmytro
 * @version: 1.0
 *
 * Task:
 * 1. Create ArrayList and LinkedList containing  100 000 Integer elements.
 * Compare time intervals.
 * 2. Insert  new 1000 elements  on the  beginning, on  the middle  and on the end of ones.
 * Compare time intervals.
 * 3. Update 1000 elements  from the  beginning, from  the middle  and from the end of ones.
 * Compare time intervals.
 * 4. Delete 1000 elements  from the  beginning, from  the middle  and from the end of ones.
 * Compare time intervals.
 */

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {



    public static void main(String[] args) {
        //randomizer for 100 elements
        Random rand = new Random();
        int pick;
        // creating arraylist with 10000 integer values
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=1; i<=100000; i++) {
            list.add(i);
        }
        LocalDateTime startInserting = LocalDateTime.now();
        // inserting 100 new elements into array
        for(int newEl=0; newEl<=1000; newEl++){
            pick = rand.nextInt(1000);
            // adding elements
            list.add(newEl, pick); // adding first 1000
            list.add(list.size() / 2, pick); // adding mid 1000
            list.add(pick); // adding last 1000
        }
        LocalDateTime finishInserting = LocalDateTime.now();
        System.out.println("Adding elements in ArrayList: ");
        System.out.println("Time to insert on the start/middle/end of  ArrayList - "
                + ChronoUnit.MILLIS.between(startInserting,
                finishInserting) +" ms");

        // updating 100  first/middle/last elements in array List
        LocalDateTime startUpdating = LocalDateTime.now();
        for(int newEl=0; newEl<=1000; newEl++){
            pick = rand.nextInt(1000);
            // adding elements
            list.set(newEl, pick); // updating first 1000
            list.set(list.size() / 2, pick); // updating mid 1000
            list.set(99000,pick); // updating last 1000
        }
        LocalDateTime finishUpdating = LocalDateTime.now();
        System.out.println("Updating elements in ArrayList: ");
        System.out.println("Time to updating on the start/middle/end of  ArrayList - "
                + ChronoUnit.MILLIS.between(startUpdating,
                finishUpdating) +" ms");

        // deleting 100  first/middle/last elements in array List
        LocalDateTime startDeleting = LocalDateTime.now();

        for(int newEl=0; newEl<1000; newEl++){
            // deleting elements
            list.remove(newEl); // deleting first 1000
            list.remove(99000); // deleting last 1000
            list.remove(49500 +newEl); // deleting first 1000
        }
        LocalDateTime finishDeleting = LocalDateTime.now();
        System.out.println("Deleting elements from ArrayList: ");
        System.out.println("Time to deleting on the start/middle/end of  ArrayList - "
                + ChronoUnit.MILLIS.between(startDeleting,
                finishDeleting) +" ms");



        // creating linkedlist with 100000 integer values
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        for (int i=1; i<=100000; i++)
        {
            list1.add(i);
        }

        LocalDateTime startInsertingLinked = LocalDateTime.now();
        // inserting 100 new elements into linked list
        for(int newEl=0; newEl<=1000; newEl++){
            pick = rand.nextInt(1000);
            // adding elements
            list1.add(newEl, pick); // adding first
            list1.add(list.size() / 2, pick); // adding middle
            list1.add(pick); // adding last
        }

        LocalDateTime finishInsertingLinked = LocalDateTime.now();
        System.out.println("Adding elements in LinkedList: ");
        System.out.println("Time to insert on the start/middle/end of  LinkedList - "
                + ChronoUnit.MILLIS.between(startInsertingLinked,
                finishInsertingLinked) +" ms");

        // updating 1000  first/middle/last elements in LinkedList
        LocalDateTime startUpdatingLinked = LocalDateTime.now();
        for(int newEl=0; newEl<=1000; newEl++){
            pick = rand.nextInt(1000);
            // updating elements
            list1.set(newEl, pick); // updating first
            list1.set(49500+ newEl, pick); //updating middle
            list1.set(99000,pick); // updating end
        }
        LocalDateTime finishUpdatingLinked = LocalDateTime.now();
        System.out.println("Updating elements in LinkedList: ");
        System.out.println("Time to update on the start/middle/end of  LinkedList - "
                + ChronoUnit.MILLIS.between(startUpdatingLinked,
                finishUpdatingLinked) +" ms");

        // deleting 1000  first/middle/last elements in Linked List
        LocalDateTime startDeletingLinked = LocalDateTime.now();

        for(int newEl=0; newEl<1000; newEl++){
            // deleting elements
            list1.remove(newEl); // deleting first 1000
            list1.remove(99000); // deleting last 1000
            list1.remove(49500 +newEl); // deleting first 1000
        }
        LocalDateTime finishDeletingLinked = LocalDateTime.now();
        System.out.println("Deleting elements from LinkedList: ");
        System.out.println("Time to deleting on the start/middle/end of  LinkedList - "
                + ChronoUnit.MILLIS.between(startDeletingLinked,
                finishDeletingLinked) +" ms");

    }
}
