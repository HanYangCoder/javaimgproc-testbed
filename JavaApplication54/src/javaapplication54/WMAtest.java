/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54;

/**
 *
 * @author hansherrera
 */
public class WMAtest {
    
    public static void main(String[] args){
        
//        double[] survivalRate = {60, 70, 75, 65, 80, 95, 50, 65, 40, 85};
//        int period = 3;
//        SimpleMovingAverage obj = new SimpleMovingAverage(period);
//        
//        for (double x : survivalRate) {
//            obj.addData(x);
//            System.out.println("New number added is " +
//            x + ", SMA = " + obj.getMean());
//        }
        
        double[] survivalRate2 = {39, 44, 40, 45, 38, 43, 39};
        int period2 = 4;
        WeightedMovingAverage obj2 = new WeightedMovingAverage();
        
//        for (double x : survivalRate2) {
//            obj2.addData(x);
//            System.out.println("New number added is " +
//            x + ", SMA = " + obj2.getMean());
//        }
        
        for(int i=0; i<survivalRate2.length; i++){
            
            if(i<4){
                obj2.populateSet(survivalRate2[i]);
                
                if(i==3){
                    obj2.populateSet(survivalRate2[i]);
                    System.out.println("New number added is " +
                    survivalRate2[i] + ", SMA = " + obj2.getMean());
                }
            }
            else if(i>=4){
                obj2.addData(survivalRate2[i]);
                System.out.println("New number added is " +
                survivalRate2[i] + ", SMA = " + obj2.getMean());
            }
        }
    }
}
