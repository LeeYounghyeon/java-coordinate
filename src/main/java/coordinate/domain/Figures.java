package coordinate.domain;

import java.util.Arrays;
import java.util.function.Function;

public enum Figures {

    LINE(2, Line::create),
    TRIANGLE(3, Triangle::create),
    RECTANGLE(4, Rectangle::create);

    private final int size;
    private final Function<Points, ResultPrintable> creator;

    Figures(int size, Function<Points, ResultPrintable> creator) {
        this.size = size;
        this.creator = creator;
    }

    public static Figures valueOf(int size) {
        return Arrays.stream(Figures.values())
                .filter(value -> value.size == size)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    public ResultPrintable create(Points points) {
        return creator.apply(points);
    }
}
