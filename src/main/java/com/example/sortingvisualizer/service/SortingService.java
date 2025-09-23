package com.example.sortingvisualizer.service;
import org.springframework.stereotype.Service;

@Service
public class SortingService {

    public int[] bubbleSort(int[] arr){
        int n = arr.length;
        int temp;
        for(int x = 0;x<n-1;x++)
        {
            for (int i = 0; i < n - 1 - x; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i + 1];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;

    }



}


    