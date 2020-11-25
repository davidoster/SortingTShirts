/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author George.Pasparakis
 */
public class Sort {
    
    public List<Integer> bubbleSort(List<Integer> arr) 
    { 
        List<Integer> arr2 = new ArrayList<>(arr);
        int n = arr2.size(); 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr2.get(j) > arr2.get(j+1)) 
                { 
                    // swap arr[j+1] and arr[j] 
                    int temp = arr2.get(j); 
                    arr2.set(j, arr2.get(j+1));  // arr[j] <- arr[j+1]
                    arr2.set(j+1, temp); // arr[j+1] = temp; 
                } 
        return(arr2);
    } 
}
