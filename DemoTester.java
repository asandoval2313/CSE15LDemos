

import static org.junit.Assert.*;
import org.junit.*;

public class DemoTester {
    @Test 
    public void incrementTester() {
        assertEquals(4, Demo1.incrementValue(2));
    }
}
