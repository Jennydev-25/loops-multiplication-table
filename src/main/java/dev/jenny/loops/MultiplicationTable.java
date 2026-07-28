package dev.jenny.loops;

import java.util.LinkedList;
import java.util.List;

public class MultiplicationTable {

    private final int FIRST_MULTIPLIER = 1;
    private final int LAST_MULTIPLIER = 10;

    public List<String> multiplyBy(int numb) {

        List<String> table = new LinkedList<>();

        for (int i = FIRST_MULTIPLIER; i <= LAST_MULTIPLIER; i++) {
            table.add(buildRow(numb, i));
        }

        return table;
    }

    private String buildRow(int numb, int multiplier) {
        return String.format("%d x %d = %d", numb, multiplier, numb * multiplier);
    }
}
