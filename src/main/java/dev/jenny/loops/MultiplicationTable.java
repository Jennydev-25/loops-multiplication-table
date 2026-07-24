package dev.jenny.loops;

public class MultiplicationTable {

    private final int FIRST_MULTIPLIER = 1;
    private final int LAST_MULTIPLIER = 10;

    public String multiplyBy(int numb) {

        StringBuilder table = new StringBuilder();

        for (int i = FIRST_MULTIPLIER; i <= LAST_MULTIPLIER; i++) {
            table.append(String.format("%d x %d = %d", numb, i, numb * i));
            if (i < LAST_MULTIPLIER)
                table.append("\n");
        }

        return table.toString();
    }
}
