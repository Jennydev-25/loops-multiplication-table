package dev.jenny.loops;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultiplicationTableTest {

    private MultiplicationTable multiplicationTable;

    @BeforeEach
    void setUp() {
        multiplicationTable = new MultiplicationTable();
    }

    @Test
    void testMultiplyBy_Number5_ShouldReturnFullTable() {
        String expected = """
                5 x 1 = 5
                5 x 2 = 10
                5 x 3 = 15
                5 x 4 = 20
                5 x 5 = 25
                5 x 6 = 30
                5 x 7 = 35
                5 x 8 = 40
                5 x 9 = 45
                5 x 10 = 50""";

        String result = multiplicationTable.multiplyBy(5);

        assertThat(result, is(equalTo(expected)));
    }

    @Test
    void testMultiplyBy_Number0_ShouldReturnAllZeros() {
        String expected = """
                0 x 1 = 0
                0 x 2 = 0
                0 x 3 = 0
                0 x 4 = 0
                0 x 5 = 0
                0 x 6 = 0
                0 x 7 = 0
                0 x 8 = 0
                0 x 9 = 0
                0 x 10 = 0""";

        String result = multiplicationTable.multiplyBy(0);

        assertThat(result, is(equalTo(expected)));
    }
}
