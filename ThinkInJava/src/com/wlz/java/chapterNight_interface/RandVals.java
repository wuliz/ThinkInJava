package com.wlz.java.chapterNight_interface;

import java.util.Random;

public interface RandVals {
Random RAND=new Random(47);
int RANDOM_INT=RAND.nextInt();
long RAND_LONG=RAND.nextLong();
float RANDOM_FLOAT=RAND.nextFloat();
double RAND_DOUBLE=RAND.nextDouble();
}
