package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet <Integer> squares = new TreeSet<>();
        for (int i : sourceList){
         squares.add(i*i);
        }
        return  squares.subSet(lowerBound,true,upperBound,true);
    }
}
