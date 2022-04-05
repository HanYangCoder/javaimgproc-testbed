/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author hansherrera
 */
public class WeightedMovingAverage {
    private final LinkedList<Double> Dataset = new LinkedList<>();
//    private LinkedList<Double> buffer = new LinkedList<>();
    private final int period = 4;
    private double sum = 0;
    
    public WeightedMovingAverage(){
        
    }
    
    // adds entry to the average in the queue,
    // removes oldest entry if it exceeds time
    public void addData(double num){
//        sum += num;
        Dataset.addLast(num);
        
        if(Dataset.size() > period)
        {
            double removed = Dataset.removeFirst();
            System.out.println(Dataset);
//            System.out.println("removed: "+removed);
            sum = sum - (removed * 0.1);
//            Dataset.addLast(num);
            double a = 0.1;
            for (Double Dataset1 : Dataset) {
                
                sum = sum + (Dataset1 * a);
                System.out.println("a value: " + a);
                a = a + 0.1;
            }
        }
//        else if(Dataset.size() == period)
//        {
//            
//            double b = 0.1;
//            for (Double Dataset1 : Dataset) {
//                
//                sum = sum + (Dataset1 * b);
//                b = b + 0.1;
//            }
//        }
    }
    
    public void populateSet(double num){
        
        Dataset.addLast(num);
        
        if(Dataset.size() == period)
        {
            
            double b = 0.1;
            for (Double Dataset1 : Dataset) {
                
                sum = sum + (Dataset1 * b);
                b = b + 0.1;
                System.out.println(Dataset);
            }
        }
    }
    
    public double getMean(){
        return sum;
    }
}
