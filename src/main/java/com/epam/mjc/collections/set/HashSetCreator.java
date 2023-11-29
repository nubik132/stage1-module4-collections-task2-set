package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set = new HashSet<>();
        for (int integer :
                sourceList) {
            set.add(integer);
            if (integer % 2 == 0) {
                while(integer % 2 == 0){
                    integer /= 2;
                    set.add(integer);
                }
            } else {
                set.add(integer * 2);
            }
        }
        return set;
    }
}
