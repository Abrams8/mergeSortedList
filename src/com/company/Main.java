package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(10);
        a.add(15);
        a.add(20);
        a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(16);
        b.add(50);

        List<Integer> list = mergeSortedList(a, b);
        System.out.println(list);
    }

    public static List<Integer> mergeSortedList(List<Integer> a, List<Integer> b) {
        List<Integer> c = new ArrayList<>();
        int aIndex = 0;
        int bIndex = 0;
        while (aIndex < a.size() && bIndex < b.size()) {
            if (a.get(aIndex) < b.get(bIndex)) {
                c.add(a.get(aIndex));
                aIndex++;
            } else if (a.get(aIndex) == b.get(bIndex)) {
                c.add(a.get(aIndex));
                c.add(b.get(bIndex));
                aIndex++;
                bIndex++;
            } else if (b.get(bIndex) < a.get(aIndex)) {
                c.add(b.get(bIndex));
                bIndex++;
            }
        }
        while (bIndex < b.size()) {
            c.add(b.get(bIndex));
            bIndex++;
        }
        while (aIndex < a.size()) {
            c.add(a.get(aIndex));
            aIndex++;
        }
        return c;


    }
}
