package com.learning.springboot.sortingAlgorithm;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Component
public class RadixSort {
    public ArrayList<Integer> sort(ArrayList<Integer> al) {
        ArrayList<Integer> al2 = al.stream().sorted().collect(Collectors.toCollection(ArrayList::new));
        return al2;
    }

    public void name() {
        System.out.println("RadixSort");
    }
}
