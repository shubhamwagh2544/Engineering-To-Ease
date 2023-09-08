package com.engineering.tryout;

import java.util.ArrayList;
import java.util.List;

public class ListOutOfBounds {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        //System.out.println(list.get(1));        //IndexOutOfBounds Exception : Index 1 out of bounds for length 0

        //adding
        list.add(1);
        list.add(2);
        list.add(3);

        //print
        System.out.println(list);

        //clearing list
        list.clear();
        System.out.println(list);
    }
}
