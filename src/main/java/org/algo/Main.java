package org.algo;

import org.algo.array.RemoveDuplicate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        RemoveDuplicate newRemoveDuplicate = new RemoveDuplicate();
//        List<Integer> arrayList1 = new ArrayList<>();
//        arrayList1.add(1);
//        arrayList1.add(3);
//        arrayList1.add(2);
//        arrayList1.add(0);

        int[] array = {1,2,3,4};

        boolean isValid = newRemoveDuplicate.containsDuplicate(array);
        System.out.println(isValid);
    }
}