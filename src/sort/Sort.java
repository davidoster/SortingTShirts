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
    
    public List<Integer> bubbleSort(List<Integer> arr) 
    { 
        List<Integer> arr2 = new ArrayList<>(arr);
        int n = arr2.size(); // 5
        for (int i = 0; i < n-1; i++) // i = 0, 1
            for (int j = 0; j < n-i-1; j++) // j = 5-0-1 = 4, 5-1-1 = 3
                if (arr2.get(j) > arr2.get(j+1)) 
                { 
                    // swap arr[j+1] and arr[j] 
                    int temp = arr2.get(j); 
                    arr2.set(j, arr2.get(j+1));  // arr[j] <- arr[j+1]
                    arr2.set(j+1, temp); // arr[j+1] = temp; 
                } 
        return(arr2);
    } 
    
    public List<TShirt> bubbleSortTShirtsBySize(List<TShirt> arr, int sortingType) // sortingType = 0 - ASC
                                                                                   // sortingType = 1 - DESC
    { 
        List<TShirt> arr2 = new ArrayList<>(arr);
        int n = arr2.size(); 
        switch(sortingType) {
            case 0:
                for (int i = 0; i < n-1; i++) 
                    for (int j = 0; j < n-i-1; j++) 
                        if (arr2.get(j).getSize().ordinal() > arr2.get(j+1).getSize().ordinal()) 
                        { 
                            // swap arr[j+1] and arr[j] 
                            TShirt temp = arr2.get(j); 
                            arr2.set(j, arr2.get(j+1));  // arr[j] <- arr[j+1]
                            arr2.set(j+1, temp); // arr[j+1] = temp; 
                        }
                break;
            case 1:
                for (int i = 0; i < n-1; i++) 
                    for (int j = 0; j < n-i-1; j++) 
                        if (arr2.get(j).getSize().ordinal() < arr2.get(j+1).getSize().ordinal()) 
                        { 
                            // swap arr[j+1] and arr[j] 
                            TShirt temp = arr2.get(j); 
                            arr2.set(j, arr2.get(j+1));  // arr[j] <- arr[j+1]
                            arr2.set(j+1, temp); // arr[j+1] = temp; 
                        }
                break;
        }
        
         
        return(arr2);
    } 
    
    public List<TShirt> bubbleSortTShirtsByColor(List<TShirt> arr, int sortingType) // sortingType = 0 - ASC
                                                                                   // sortingType = 1 - DESC
    { 
        List<TShirt> arr2 = new ArrayList<>(arr);
        int n = arr2.size(); 
        switch(sortingType) {
            case 0:
                for (int i = 0; i < n-1; i++) 
                    for (int j = 0; j < n-i-1; j++) 
                        if (arr2.get(j).getColor().ordinal() > arr2.get(j+1).getColor().ordinal()) 
                        { 
                            // swap arr[j+1] and arr[j] 
                            TShirt temp = arr2.get(j); 
                            arr2.set(j, arr2.get(j+1));  // arr[j] <- arr[j+1]
                            arr2.set(j+1, temp); // arr[j+1] = temp; 
                        }
                break;
            case 1:
                for (int i = 0; i < n-1; i++) 
                    for (int j = 0; j < n-i-1; j++) 
                        if (arr2.get(j).getColor().ordinal() < arr2.get(j+1).getColor().ordinal()) 
                        { 
                            // swap arr[j+1] and arr[j] 
                            TShirt temp = arr2.get(j); 
                            arr2.set(j, arr2.get(j+1));  // arr[j] <- arr[j+1]
                            arr2.set(j+1, temp); // arr[j+1] = temp; 
                        }
                break;
        }
        
         
        return(arr2);
    } 
    
     public List<TShirt> bubbleSortTShirtsByFabric(List<TShirt> arr, int sortingType) // sortingType = 0 - ASC
                                                                                   // sortingType = 1 - DESC
    { 
        List<TShirt> arr2 = new ArrayList<>(arr);
        int n = arr2.size(); 
        switch(sortingType) {
            case 0:
                for (int i = 0; i < n-1; i++) 
                    for (int j = 0; j < n-i-1; j++) 
                        if (arr2.get(j).getFabric().ordinal() > arr2.get(j+1).getFabric().ordinal()) 
                        { 
                            // swap arr[j+1] and arr[j] 
                            TShirt temp = arr2.get(j); 
                            arr2.set(j, arr2.get(j+1));  // arr[j] <- arr[j+1]
                            arr2.set(j+1, temp); // arr[j+1] = temp; 
                        }
                break;
            case 1:
                for (int i = 0; i < n-1; i++) 
                    for (int j = 0; j < n-i-1; j++) 
                        if (arr2.get(j).getFabric().ordinal() < arr2.get(j+1).getFabric().ordinal()) 
                        { 
                            // swap arr[j+1] and arr[j] 
                            TShirt temp = arr2.get(j); 
                            arr2.set(j, arr2.get(j+1));  // arr[j] <- arr[j+1]
                            arr2.set(j+1, temp); // arr[j+1] = temp; 
                        }
                break;
        }
        
         
        return(arr2);
    } 
}
