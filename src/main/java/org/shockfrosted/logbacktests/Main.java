package org.shockfrosted.logbacktests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final int RUNS = 100_000_000;

    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(Main.class);

        long start = System.nanoTime();
        int param1 = 4;
        int param2 = 5;
        for (int i=0; i< RUNS; i++) {
            logger.debug("Test {} {}", param1, param2);
        }
        System.out.printf("Time elapssed:%sseconds%n", (double) (System.nanoTime() - start) / (double) 1_000_000_000);

    }
}
