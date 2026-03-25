package com.edu.eci.arep.mathservice;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class MathController {

    @GetMapping("/linearsearch")
    public String linearSearch(@RequestParam String list, @RequestParam String value) {
        String[] arr = list.split(",");
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(value)) {
                result = i;
                break;
            }
        }
        return String.format(
            "{\"operation\":\"linearSearch\",\"inputlist\":\"%s\",\"value\":\"%s\",\"output\":\"%d\"}",
            list, value, result);
    }

    @GetMapping("/binarysearch")
    public String binarySearch(@RequestParam String list, @RequestParam String value) {
        String[] arr = list.split(",");
        int result = binarySearchRecursive(arr, value, 0, arr.length - 1);
        return String.format(
            "{\"operation\":\"binarySearch\",\"inputlist\":\"%s\",\"value\":\"%s\",\"output\":\"%d\"}",
            list, value, result);
    }

    private int binarySearchRecursive(String[] arr, String value, int low, int high) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            int cmp = arr[mid].compareTo(value);
            if (cmp == 0) return mid;
            if (cmp > 0) return binarySearchRecursive(arr, value, low, mid - 1);
            return binarySearchRecursive(arr, value, mid + 1, high);
        }
        return -1;
    }
}