/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingtshirts;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import models.TShirt;
import printing.Print;
import models.random.RandomTShirt;
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
        
//        List<Integer> integers = new ArrayList<>();
//        integers = Arrays.asList(new Integer[] {5,2,88,1,29,6,13});
// 
//        p.printArray(integers);
//        p.printArray(s.bubbleSort(integers));
        
//        TShirt randomTShirt = new RandomTShirt();
//        System.out.println(randomTShirt);
        
        int numberOfRandomTShirts = 10;
        List<RandomTShirt> randomTShirts = new ArrayList<>(numberOfRandomTShirts);
        for (int i = 0; i < numberOfRandomTShirts; i++) {
            randomTShirts.add(new RandomTShirt());
            System.out.println(randomTShirts.get(i));
        }
    }
}
