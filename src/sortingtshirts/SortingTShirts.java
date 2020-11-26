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
        
        int numberOfRandomTShirts = 5;
        System.out.println("Original Array");
        List<TShirt> randomTShirts = new ArrayList<>(numberOfRandomTShirts);
        for (int i = 0; i < numberOfRandomTShirts; i++) {
            randomTShirts.add(new RandomTShirt());
            System.out.println(randomTShirts.get(i));
        }
        
//        System.out.println("\nSorted Array By Size Ascending");
//        List<TShirt> bubbleSortRandomTShirtsBySize = s.bubbleSortTShirtsBySize(randomTShirts,0);
//        for (int i = 0; i < numberOfRandomTShirts; i++) {
//            System.out.println(bubbleSortRandomTShirtsBySize.get(i));
//        }
//        
//        System.out.println("\nSorted Array By Size Descending");
//        List<TShirt> bubbleSortRandomTShirtsBySize1 = s.bubbleSortTShirtsBySize(randomTShirts,1);
//        for (int i = 0; i < numberOfRandomTShirts; i++) {
//            System.out.println(bubbleSortRandomTShirtsBySize1.get(i));
//        }
        
//        System.out.println("\nSorted Array By Color Ascending");
//        List<TShirt> bubbleSortRandomTShirtsBySize2 = s.bubbleSortTShirtsByColor(randomTShirts,0);
//        for (int i = 0; i < numberOfRandomTShirts; i++) {
//            System.out.println(bubbleSortRandomTShirtsBySize2.get(i));
//        }
//        
//        System.out.println("\nSorted Array By Color Descending");
//        List<TShirt> bubbleSortRandomTShirtsBySize3 = s.bubbleSortTShirtsByColor(randomTShirts,1);
//        for (int i = 0; i < numberOfRandomTShirts; i++) {
//            System.out.println(bubbleSortRandomTShirtsBySize3.get(i));
//        }
        
//        System.out.println("\nSorted Array By Fabric Ascending");
//        List<TShirt> bubbleSortRandomTShirtsBySize4 = s.bubbleSortTShirts(randomTShirts, 0, 2);
//        for (int i = 0; i < numberOfRandomTShirts; i++) {
//            System.out.println(bubbleSortRandomTShirtsBySize4.get(i));
//        }
//        
//        System.out.println("\nSorted Array By Fabric Descending");
//        List<TShirt> bubbleSortRandomTShirtsBySize5 = s.bubbleSortTShirts(randomTShirts, 1, 2);
//        for (int i = 0; i < numberOfRandomTShirts; i++) {
//            System.out.println(bubbleSortRandomTShirtsBySize5.get(i));
//        }
        
//        System.out.println("\nQuick Sorted Array By Size Ascending");
//        List<TShirt> quickSortRandomTShirtsBySize = new ArrayList<TShirt>(randomTShirts);
//        s.quickSortTShirts(quickSortRandomTShirtsBySize, 0, numberOfRandomTShirts - 1, 0, 0);
//        for (int i = 0; i < numberOfRandomTShirts; i++) {
//            System.out.println(quickSortRandomTShirtsBySize.get(i));
//        }
//        
        System.out.println("\nQuick Sorted Array By Size Descending");
        List<TShirt> quickSortRandomTShirtsBySizeDesc = new ArrayList<TShirt>(randomTShirts);
        s.quickSortTShirts(quickSortRandomTShirtsBySizeDesc, 0, numberOfRandomTShirts - 1, 0, 1);
        for (int i = 0; i < numberOfRandomTShirts; i++) {
            System.out.println(quickSortRandomTShirtsBySizeDesc.get(i));
        }
//        
//        System.out.println("\nQuick Sorted Array By Color Ascending");
//        List<TShirt> quickSortRandomTShirtsByColor = new ArrayList<TShirt>(randomTShirts);
//        s.quickSortTShirts(quickSortRandomTShirtsByColor, 0, numberOfRandomTShirts - 1, 1, 0);
//        for (int i = 0; i < numberOfRandomTShirts; i++) {
//            System.out.println(quickSortRandomTShirtsByColor.get(i));
//        }
        
        System.out.println("\nQuick Sorted Array By Color Descending");
        List<TShirt> quickSortRandomTShirtsByColorDesc = new ArrayList<TShirt>(randomTShirts);
        s.quickSortTShirts(quickSortRandomTShirtsByColorDesc, 0, numberOfRandomTShirts - 1, 1, 1);
        for (int i = 0; i < numberOfRandomTShirts; i++) {
            System.out.println(quickSortRandomTShirtsByColorDesc.get(i));
        }
        
//        System.out.println("\nQuick Sorted Array By Fabric Ascending");
//        List<TShirt> quickSortRandomTShirtsByFabric = new ArrayList<TShirt>(randomTShirts);
//        s.quickSortTShirts(quickSortRandomTShirtsByFabric, 0, numberOfRandomTShirts - 1, 2, 0);
//        for (int i = 0; i < numberOfRandomTShirts; i++) {
//            System.out.println(quickSortRandomTShirtsByFabric.get(i));
//        }
        
        System.out.println("\nQuick Sorted Array By Fabric Descending");
        List<TShirt> quickSortRandomTShirtsByFabricDesc = new ArrayList<TShirt>(randomTShirts);
        s.quickSortTShirts(quickSortRandomTShirtsByFabricDesc, 0, numberOfRandomTShirts - 1, 2, 1);
        for (int i = 0; i < numberOfRandomTShirts; i++) {
            System.out.println(quickSortRandomTShirtsByFabricDesc.get(i));
        }
    }
}