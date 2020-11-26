/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.ArrayList;
import java.util.List;
import models.TShirt;

/**
 *
 * @author George.Pasparakis
 */
public class Sort {

    public List<Integer> bubbleSort(List<Integer> arr) {
        List<Integer> arr2 = new ArrayList<>(arr);
        int n = arr2.size(); // 5
        for (int i = 0; i < n - 1; i++) // i = 0, 1
        {
            for (int j = 0; j < n - i - 1; j++) // j = 5-0-1 = 4, 5-1-1 = 3
            {
                if (arr2.get(j) > arr2.get(j + 1)) {
                    // swap arr[j+1] and arr[j] 
                    int temp = arr2.get(j);
                    arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                    arr2.set(j + 1, temp); // arr[j+1] = temp; 
                }
            }
        }
        return (arr2);
    }

    private List<TShirt> bubbleSortTShirtsBySize(List<TShirt> arr, int sortingType) // sortingType = 0 - ASC
    // sortingType = 1 - DESC
    {
        List<TShirt> arr2 = new ArrayList<>(arr);
        int n = arr2.size();
        switch (sortingType) {
            case 0:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getSize().ordinal() > arr2.get(j + 1).getSize().ordinal()) {
                            // swap arr[j+1] and arr[j] 
                            TShirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                            arr2.set(j + 1, temp); // arr[j+1] = temp; 
                        }
                    }
                }
                break;
            case 1:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getSize().ordinal() < arr2.get(j + 1).getSize().ordinal()) {
                            // swap arr[j+1] and arr[j] 
                            TShirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                            arr2.set(j + 1, temp); // arr[j+1] = temp; 
                        }
                    }
                }
                break;
        }

        return (arr2);
    }

    private List<TShirt> bubbleSortTShirtsByColor(List<TShirt> arr, int sortingType) // sortingType = 0 - ASC
    // sortingType = 1 - DESC
    {
        List<TShirt> arr2 = new ArrayList<>(arr);
        int n = arr2.size();
        switch (sortingType) {
            case 0:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getColor().ordinal() > arr2.get(j + 1).getColor().ordinal()) {
                            // swap arr[j+1] and arr[j] 
                            TShirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                            arr2.set(j + 1, temp); // arr[j+1] = temp; 
                        }
                    }
                }
                break;
            case 1:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getColor().ordinal() < arr2.get(j + 1).getColor().ordinal()) {
                            // swap arr[j+1] and arr[j] 
                            TShirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                            arr2.set(j + 1, temp); // arr[j+1] = temp; 
                        }
                    }
                }
                break;
        }

        return (arr2);
    }

    private List<TShirt> bubbleSortTShirtsByFabric(List<TShirt> arr, int sortingType) // sortingType = 0 - ASC
    // sortingType = 1 - DESC
    {
        List<TShirt> arr2 = new ArrayList<>(arr);
        int n = arr2.size();
        switch (sortingType) {
            case 0:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getFabric().ordinal() > arr2.get(j + 1).getFabric().ordinal()) {
                            // swap arr[j+1] and arr[j] 
                            TShirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                            arr2.set(j + 1, temp); // arr[j+1] = temp; 
                        }
                    }
                }
                break;
            case 1:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr2.get(j).getFabric().ordinal() < arr2.get(j + 1).getFabric().ordinal()) {
                            // swap arr[j+1] and arr[j] 
                            TShirt temp = arr2.get(j);
                            arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                            arr2.set(j + 1, temp); // arr[j+1] = temp; 
                        }
                    }
                }
                break;
        }

        return (arr2);
    }

    public List<TShirt> bubbleSortTShirts(List<TShirt> arr, int sortingType, int sortByAttribute) {
        List<TShirt> arr2 = new ArrayList<>(arr);
        if (sortingType == 0) {
            switch (sortByAttribute) {
                // Size
                case 0:
                    arr2 = bubbleSortTShirtsBySize(arr, 0);
                    break;
                // Color    
                case 1:
                    arr2 = bubbleSortTShirtsByColor(arr, 0);
                    break;
                // Fabric
                case 2:
                    arr2 = bubbleSortTShirtsByFabric(arr, 0);
                    break;
            }
        } else {
            switch (sortByAttribute) {
                // Size
                case 0:
                    arr2 = bubbleSortTShirtsBySize(arr, 1);
                    break;
                // Color    
                case 1:
                    arr2 = bubbleSortTShirtsByColor(arr, 1);
                    break;
                // Fabric
                case 2:
                    arr2 = bubbleSortTShirtsByFabric(arr, 1);
                    break;
            }
        }
        return (arr2);
    }

    int partition(List<TShirt> arr, int low, int high, int sortByAttribute, int sortingType) {
        TShirt pivot = arr.get(high);
        int i = (low - 1); // index of smaller element 
        for (int j = low; j < high; j++) {
            if (sortingType == 0) { // ASC
                switch (sortByAttribute) {
                    // Size
                    case 0:
                        // If current element is smaller than the pivot 
                        if (arr.get(j).getSize().ordinal() < pivot.getSize().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j] 
                            TShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                        break;
                    // Color
                    case 1:
                        if (arr.get(j).getColor().ordinal() < pivot.getColor().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j] 
                            TShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                        break;
                    // Fabric
                    case 2:
                        if (arr.get(j).getFabric().ordinal() < pivot.getFabric().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j] 
                            TShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                        break;
                }
            } else { // DESC
                switch (sortByAttribute) {
                    // Size
                    case 0:
                        // If current element is smaller than the pivot 
                        if (arr.get(j).getSize().ordinal() > pivot.getSize().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j] 
                            TShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                        break;
                    // Color
                    case 1:
                        if (arr.get(j).getColor().ordinal() > pivot.getColor().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j] 
                            TShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                        break;
                    // Fabric
                    case 2:
                        if (arr.get(j).getFabric().ordinal() > pivot.getFabric().ordinal()) {
                            i++;

                            // swap arr[i] and arr[j] 
                            TShirt temp = arr.get(i);
                            arr.set(i, arr.get(j));
                            arr.set(j, temp);
                        }
                        break;
                }
            }

        }

        // swap arr[i+1] and arr[high] (or pivot) 
        TShirt temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);

        return i + 1;
    }

    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
    public void quickSortTShirts(List<TShirt> arr, int low, int high, int sortByAttribute, int sortingType) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = 0;
            switch (sortingType) {
                // ASC
                case 0:
                    pi = partition(arr, low, high, sortByAttribute, sortingType); // part <--- Size, Color, Fabric

                    // Recursively sort elements before 
                    // partition and after partition 
                    quickSortTShirts(arr, low, pi - 1, sortByAttribute, 0);
                    quickSortTShirts(arr, pi + 1, high, sortByAttribute, 0);
                    break;
                // DESC
                case 1:
                    pi = partition(arr, low, high, sortByAttribute, sortingType); // part <--- Size, Color, Fabric

                    // Recursively sort elements before 
                    // partition and after partition 
                    quickSortTShirts(arr, low, pi - 1, sortByAttribute, 1);
                    quickSortTShirts(arr, pi + 1, high, sortByAttribute, 1);
                    break;
            }
        }
    }
}
