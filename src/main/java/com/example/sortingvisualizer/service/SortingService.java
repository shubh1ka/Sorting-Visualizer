package com.example.sortingvisualizer.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class SortingService {

    public List<int[]> bubbleSortSteps(int[] arr) {
        List<int[]> steps = new ArrayList<>();
        int[] current = arr.clone();
        steps.add(current.clone());
        

        int n = current.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (current[j] > current[j + 1]) {
                    int temp = current[j];
                    current[j] = current[j + 1];
                    current[j + 1] = temp;
                    steps.add(current.clone());
                }
            }
        }
        return steps;
    }
}
