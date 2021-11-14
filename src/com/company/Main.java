package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String str = new Scanner(System.in).nextLine();
            listA.add(str);
        }
        System.out.println(listA);


        ArrayList<String> listB = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String str = new Scanner(System.in).nextLine();
            listB.add(str);
        }
        System.out.println(listB);
        
        Collections.reverse(listB);
        
        
        ArrayList<String> listC = new ArrayList<>();

        for (int i = 0; i < listA.size(); i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));
        }
        System.out.println(listC);

        Collections.sort(listC, new SampleComparator());
        System.out.println(listC);
    }
}
class SampleComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int i = new Integer(o1.length()).compareTo(o2.length());
        return i;
    }
}