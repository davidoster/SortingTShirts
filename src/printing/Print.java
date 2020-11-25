/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printing;

import java.util.List;

/**
 *
 * @author George.Pasparakis
 */
public class Print {
    /* Prints the array */
    public void printArray(List<Integer> arr) 
    { 
        int n = arr.size(); 
        for (int i=0; i<n; ++i) 
            System.out.print(arr.get(i) + " "); 
        System.out.println(); 
    } 
    
}
