package org.algo.array;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Map <Integer, Integer> data = new HashMap<>();

        for (Integer element : nums) {
            System.out.println(element);
            if (data.containsKey(element)) {
                data.put(element, data.get(element) + 1);
            } else {
                data.put(element, 1);
            }
        }

        for (Integer value : data.values()) {
            if(value > 1) return true;
        }

        return false;
    }

}
