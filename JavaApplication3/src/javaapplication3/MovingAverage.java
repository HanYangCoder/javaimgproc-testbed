/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.*;

/**
 *
 * @author hansherrera
 */
public class MovingAverage {
    
    public static void main(String[] args){
        
        double[] survivalRate = {60, 70, 75, 65, 80, 95, 50, 65, 40, 85};
        int period = 3;
        SimpleMovingAverage obj = new SimpleMovingAverage(period);
        
        for (double x : survivalRate) {
            obj.addData(x);
            System.out.println("New number added is " +
            x + ", SMA = " + obj.getMean());
        }
    }
}

class SimpleMovingAverage{
    
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
