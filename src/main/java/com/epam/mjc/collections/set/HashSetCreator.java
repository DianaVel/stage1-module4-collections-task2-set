package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet <Integer> res = new HashSet<>();
        for (int i : sourceList){
            if(i%2 == 0){
                while (i%2 == 0){
                    res.add(i);
                    i=i/2;
                }
                res.add(i);
            }else {
                res.add(i);
                res.add(2*i);
            }
        }

        return res;
    }
}

