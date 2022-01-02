package se.kth.iv1351.util;

import java.util.Random;

public class IdGenerator {
    public static Integer generate() {
        Random random = new Random();
        return Math.abs(random.nextInt());
    }
}
