package com.example.sortingvisualizer;

import com.example.sortingvisualizer.service.SortingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
    @Autowired
    private SortingService sortingService;

    @GetMapping("/sort")
    public int[] sortArray(){
        int[] arr ={5,2,9,1,6};
        return sortingService.bubbleSort(arr);
    }

     @GetMapping("/bubble")
     public  int[] bubblesort(@RequestParam int[] arr){
         return sortingService.bubbleSort(arr);
     }

     @GetMapping("/")
     public String home() {
         return "Sorting Visualizer is running";
     }
         
}
