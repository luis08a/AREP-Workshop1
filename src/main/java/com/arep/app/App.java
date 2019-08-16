package com.arep.app;
import java.lang.Math;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        double mean = 0,stDeviation = 0;
        Linked<Double> a;
        a =  new Linked<Double>();

        a.add((double)1);
        a.add((double)2);
        a.add((double)3);
        a.add((double)4);
        a.add((double)5);

        for (double var : a) {
            mean += var;
            System.out.println(var);
        }
        mean /= a.size();
        // stardart deviation
        for (double var : a) {
            System.out.println(var);
            double c = Math.pow(var - mean,2.0);
            stDeviation += c;
        }
        stDeviation = Math.sqrt(stDeviation/(mean-1));
        System.out.println(mean+ " ---- " + stDeviation);
    }
}
