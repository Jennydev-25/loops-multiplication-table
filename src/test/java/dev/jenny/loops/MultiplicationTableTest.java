package dev.jenny.loops;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MultiplicationTableTest {

    private MultiplicationTable multiplicationTable;

    @BeforeEach
    void setUp() {
        multiplicationTable = new MultiplicationTable();
    }

    @Test
    void testMultiplyBy_Number5_ShouldReturnFullTable() {
        List<String> expected = List.of(
                "5 x 1 = 5",
                "5 x 2 = 10",
                "5 x 3 = 15",
                "5 x 4 = 20",
                "5 x 5 = 25",
                "5 x 6 = 30",
                "5 x 7 = 35",
                "5 x 8 = 40",
                "5 x 9 = 45",
                "5 x 10 = 50");

        List<String> result = multiplicationTable.multiplyBy(5);

        assertThat(result, is(equalTo(expected)));
    }

    @Test
    void testMultiplyBy_Number0_ShouldReturnAllZeros() {
        List<String> expected = List.of(
                "0 x 1 = 0",
                "0 x 2 = 0",
                "0 x 3 = 0",
                "0 x 4 = 0",
                "0 x 5 = 0",
                "0 x 6 = 0",
                "0 x 7 = 0",
                "0 x 8 = 0",
                "0 x 9 = 0",
                "0 x 10 = 0");

        List<String> result = multiplicationTable.multiplyBy(0);

        assertThat(result, is(equalTo(expected)));
    }

    @ParameterizedTest(name = "table of {0} ends with \"{1}\"")
    @MethodSource("lastRowCases")
    void testMultiplyBy_ShouldEndWithCorrectLastRow(int numb, String expectedLastRow) {
        List<String> result = multiplicationTable.multiplyBy(numb);

        assertThat(result.get(result.size() - 1), is(equalTo(expectedLastRow)));
    }

    private static Stream<Arguments> lastRowCases() {
        return Stream.of(
                Arguments.of(1, "1 x 10 = 10"),
                Arguments.of(2, "2 x 10 = 20"),
                Arguments.of(7, "7 x 10 = 70"),
                Arguments.of(10, "10 x 10 = 100"));
    }
}
