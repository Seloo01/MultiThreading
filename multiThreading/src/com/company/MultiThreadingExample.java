package com.company;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MultiThreadingExample implements Runnable{

    int counter = 0;
    int stopTime = 0;
    long increasTime = 0;

    public MultiThreadingExample(int startFrom, int stopTime, long increasTime){
        this.counter = startFrom;
        this.stopTime = stopTime;
        this.increasTime = increasTime;
    }
    public void run(){
        long increatFunction = increasTime * 1000;
        counter--;
        while(true){
            counter++;
            System.out.println(counter);
            if(counter==stopTime){
                System.exit(0);
            }
            try {
                Thread.sleep(increatFunction);
            } catch (InterruptedException ex) {
                Logger.getLogger(MultiThreadingExample.class.getName())
                        .log(Level.INFO, null, ex);
            }
        }
    }
}

