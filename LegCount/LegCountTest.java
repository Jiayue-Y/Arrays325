package LegCount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LegCountTest {

    @Test
    void testHasFourLegs() {
        String[] test1 = {"cat"};
        String[] test2 = {"fish"};
        String[] test3 = {"cat", "fish"};
        String[] test4 = {"cat", "dog", "horse"};
        String[] test5 = {"lion", "monkey", "deer", "snake", "elephant"};
        String[] test6 = {"fish", "fish", "fish", "fish"};

        Assertions.assertEquals(1, LegCount.hasFourLegs(test1));
        Assertions.assertEquals(0, LegCount.hasFourLegs(test2));
        Assertions.assertEquals(1, LegCount.hasFourLegs(test3));
        Assertions.assertEquals(3, LegCount.hasFourLegs(test4));
        Assertions.assertEquals(3, LegCount.hasFourLegs(test5));
        Assertions.assertEquals(0, LegCount.hasFourLegs(test6));
    }
}