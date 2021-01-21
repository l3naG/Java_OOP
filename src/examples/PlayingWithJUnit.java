package examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayingWithJUnit {

    @Test
    void testName() {
        Assertions.assertEquals(4, Calculator(2, 2));
    }

    private int Calculator(int i, int i1) {
        return i + i1;
    }


}
