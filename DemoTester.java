

import static org.junit.Assert.*;
import org.junit.*;

public class DemoTester {
    @Test 
    public void incrementTester() {
        assertEquals(3, Demo1.incrementValue(2));
    }
}
