/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingtshirts;

import java.util.ArrayList;
import java.util.List;
import models.TShirt;
import models.random.RandomTShirt;
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
        int numberOfRandomTShirts = 7;
        System.out.println("Original Array");
        List<TShirt> randomTShirts = new ArrayList<>(numberOfRandomTShirts);
        for (int i = 0; i < numberOfRandomTShirts; i++) {
            randomTShirts.add(new RandomTShirt());
            System.out.println(randomTShirts.get(i));
        }

        s.bucketSortTShirtsBySizeThenColorThenFabric(randomTShirts, 0);

//        System.out.println("\nBucket Sorted Array By Size Ascending");
//        Timer bucketTimer = new Timer();
//        s.bucketSortTShirts(randomTShirts, 0, 0);
//        bucketTimer.stop();
//        System.out.println("Bucket Sort Time: " + bucketTimer.elapsedTime());
//        System.out.println("\nBubble Sorted Array By Size Ascending");
//        Timer bubbleTimer = new Timer();
//        List<TShirt> bubbleSortRandomTShirtsBySize4 = s.bubbleSortTShirts(randomTShirts, 0, 0);
//        bubbleTimer.stop();
////        for (int i = 0; i < numberOfRandomTShirts; i++) {
////            System.out.println(bubbleSortRandomTShirtsBySize4.get(i));
////        }
//        System.out.println("Bubble Sort Time: " + bubbleTimer.elapsedTime());
//        System.out.println("\nQuick Sorted Array By Size Ascending");
//        List<TShirt> quickSortRandomTShirtsBySize = new ArrayList<TShirt>(randomTShirts);
//        Timer quickTimer = new Timer();
//        s.quickSortTShirts(quickSortRandomTShirtsBySize, 0, numberOfRandomTShirts - 1, 0, 0);
//        quickTimer.stop();
////        for (int i = 0; i < numberOfRandomTShirts; i++) {
////            System.out.println(quickSortRandomTShirtsBySize.get(i));
////        }
//        System.out.println("Quick Sort Time: " + quickTimer.elapsedTime());
    }
}
