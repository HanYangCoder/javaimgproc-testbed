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
public class SimpleMovingAverage {
    private final Queue<Double> Dataset = new LinkedList<Double>();
    private final int period;
    private double sum;
    
    public SimpleMovingAverage(int period){
        this.period = period;
    }
    
    // adds entry to the average in the queue,
    // removes oldest entry if it exceeds time
    public void addData(double num){
        sum += num;
        Dataset.add(num);
        
        if(Dataset.size() > period)
        {
            sum -= Dataset.remove();
        }
    }
    
    public double getMean(){
        return sum / period;
    }
}
