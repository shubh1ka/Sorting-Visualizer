package com.example.sortingvisualizer;

import com.example.sortingvisualizer.service.SortingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private SortingService sortingService;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/bubble")
    public String bubbleSort(@RequestParam("arr") String arr, Model model) {
        String[] parts = arr.split(",");
        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i].trim());
        }

        List<int[]> steps = sortingService.bubbleSortSteps(numbers);
        model.addAttribute("steps", steps);

        return "index";
    }
}
