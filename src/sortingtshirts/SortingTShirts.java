/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingtshirts;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import printing.Print;
import sort.Sort;
/**
 *
 * @author George.Pasparakis
 */
public class SortingTShirts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Print p = new Print();
        Sort s = new Sort();
        
        List<Integer> integers = new ArrayList<>();
        integers = Arrays.asList(new Integer[] {5,2,88,1,29,6,13});
 
        p.printArray(integers);
        p.printArray(s.bubbleSort(integers));
    }
}
