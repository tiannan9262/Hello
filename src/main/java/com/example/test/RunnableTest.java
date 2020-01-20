package com.example.test;

import java.awt.*;

public class RunnableTest implements Runnable{
    @Override
    public void run() {
        while (times>0)
        {
            times--;
            try{
                Thread.sleep(100);

            }
            catch ( Exception e)
            {
                e.printStackTrace();
            }
            finally{
                System.out.println(times);
            }
        }
    }
    public RunnableTest(int times)
    {
        this.times=times;
    }
    private int times;
    public static void main(String[] args) {
        new Thread(new RunnableTest(10)).start();
        new Thread(new RunnableTest(15)).start();
    }

}
