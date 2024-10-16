import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MergeDataTest {

    @Test
    void testMergeData() {
        int[] test1 = {1, 2, 3, 4, 5, 0, 0, 0},
                test2 = {6, 7, 8},
                test3 = {-3, -2, -1},
                test4 = {1, 3, 5, 7, 9, 0, 0, 0, 0},
                test5 = {2, 4, 6, 8};
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]",
                Arrays.toString(MergeData.mergeData(test1, 5,
                test2, 3)));
        Assertions.assertEquals("[-3, -2, -1, 1, 2, 3, 4, 5]",
                Arrays.toString(MergeData.mergeData(test1, 5 ,
                        test3, 3)));
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9]",
                Arrays.toString(MergeData.mergeData(test4, 5,
                        test5, 4)));
    }
}