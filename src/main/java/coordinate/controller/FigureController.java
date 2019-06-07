package coordinate.controller;

import coordinate.domain.*;

public class FigureController {
    public ResultPrintable getFigure(Points points) {
        return Figures.valueOf(points.getSize()).create(points);
    }
}
