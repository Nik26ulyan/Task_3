package ru.vsu.sc.uliyanov_n_s;

import ru.vsu.sc.uliyanov_n_s.figures.Circle;
import ru.vsu.sc.uliyanov_n_s.figures.Line;
import ru.vsu.sc.uliyanov_n_s.figures.VerticalParabola;

public class Picture {

    private final Line L;
    private final VerticalParabola P;
    private final Circle C;

    public Picture(Line l, VerticalParabola p, Circle c) {
        L = l;
        P = p;
        C = c;
    }

    public SimpleColor getColor(double x, double y) {
        SimpleColor color;

        if (P.isPointBelowOfParabola(x, y) && C.isPointInCircle(x, y)) {
            color = SimpleColor.YELLOW;
        } else if (C.isPointInCircle(x, y) && !P.isPointBelowOfParabola(x, y) && !L.isPointBelowLine(x, y)) {
            color = SimpleColor.YELLOW;
        } else if (C.isPointInCircle(x, y) && L.isPointBelowLine(x, y) && !P.isPointBelowOfParabola(x, y)) {
            color = SimpleColor.BLUE;
        } else if (L.isPointBelowLine(x, y) && !P.isPointBelowOfParabola(x, y) && x > 5) {
            color = SimpleColor.BLUE;
        } else if (L.isPointBelowLine(x, y) && !P.isPointBelowOfParabola(x, y) && !C.isPointInCircle(x, y)) {
            color = SimpleColor.GRAY;
        } else if (P.isPointBelowOfParabola(x, y)) {
            color = SimpleColor.BLUE;
        } else {
            color = SimpleColor.ORANGE;
        }

        return color;
    }
}
