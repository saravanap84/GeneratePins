import nz.co.westpac.util.PINGenerator;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PINGeneratorTest {

    @Test
    public void testGenerateUniquePins() {
        int batchSize = 1000;
        Set<String> uniquePins = PINGenerator.generateUniquePins();

        // Check if the size of the generated batch is 1000
        assertEquals(batchSize, uniquePins.size());

        // Check each PIN in the batch for its format (4 digits)
        for (String pin : uniquePins) {
            assertTrue(pin.matches("\\d{4}"), "PIN should consist of 4 digits: " + pin);
        }
        assertEquals(1000, uniquePins.stream().distinct().count(), "All numbers should be unique");
    }
}
