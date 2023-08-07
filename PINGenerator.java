package nz.co.westpac.util;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class PINGenerator {
    public static final int BATCH_SIZE = 1000;
    public static Set<String> generateUniquePins() {
        Set<String> uniquePins = new HashSet<>();
        Random random = new Random();

        while (uniquePins.size() < BATCH_SIZE) {
            String pin = String.format("%04d", random.nextInt(10000));
            uniquePins.add(pin);
        }
        return uniquePins;
    }
}
