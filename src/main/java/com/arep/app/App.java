package com.arep.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Math;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        double mean = 0, stDeviation = 0;
        Linked<Double> a;
        a = new Linked<Double>();
        a.add((double) 15.0);
        a.add((double) 69.9);
        a.add((double) 6.5);
        a.add((double) 22.4);
        a.add((double) 28.4);
        a.add((double) 65.9);
        a.add((double) 19.4);
        a.add((double) 198.7);
        a.add((double) 38.8);
        a.add((double) 138.2);
        for (double var : a) {
            mean += var;
        }
        mean /= a.size();
        // stardart deviation
        for (double var : a) {
            double c = Math.pow(var - mean, 2.0);
            stDeviation += c;
        }
        stDeviation = Math.sqrt(stDeviation / (a.size() - 1));
        System.out.println("| --- MEAN ----- / ----  \\-----  STDEVIATION |");
        System.out.println("| " + mean + " ---- " + stDeviation + " |");
    }
}
