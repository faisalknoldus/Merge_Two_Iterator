package com.knoldus.merge_iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class MergeIterator {

    //Method for Merging two iterator

    public static Iterator<Integer> mergeIterator(Iterator<Integer> foo, Iterator<Integer> bar) {

        List<Integer> res = new ArrayList<>();


        Integer num1 = foo.hasNext() ? foo.next() : null;
        Integer num2 = bar.hasNext() ? bar.next() : null;

        while (num1!=null && num2!=null) {

            if (num1 < num2) {
                res.add(num1);
                num1 = foo.hasNext() ? foo.next() : null;


            } else {
                res.add(num2);
                num2 = bar.hasNext() ? bar.next() : null;

            }
        }
        while (num1 != null) {
            res.add(num1);
            num1 = foo.hasNext() ? foo.next() : null;
        }
        while (num2 != null) {
            res.add(num2);
            num2 = bar.hasNext() ? bar.next() : null;
        }

        return res.iterator();
    }

    public static void main(String[] args) {

        //creating two list for elements
        List<Integer> l1= Arrays.asList(5,10,15);
        List<Integer> l2 = Arrays.asList(3,8,9);

        //calling mergeIterator() for merging two iterator
        Iterator merged_iterator = mergeIterator(l1.iterator(), l2.iterator());

        //printing the merged list
        while(merged_iterator.hasNext())System.out.println(merged_iterator.next());
    }
}
