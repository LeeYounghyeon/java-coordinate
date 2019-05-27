package coordinate;

import coordinate.controller.FigureController;
import coordinate.controller.InputViewController;
import coordinate.controller.OutputViewController;
import coordinate.domain.Points;
import coordinate.domain.Rectangle;
import coordinate.view.InputView;
import coordinate.view.OutputView;

public class Main {
    public static void main(String[] args) {
        InputViewController inputViewController = new InputViewController(new InputView());
        Points points = inputViewController.inputCoordinates();

        FigureController figureController = new FigureController();

        Rectangle rectangle = Rectangle.create(points);

        OutputViewController outputViewController = new OutputViewController(new OutputView(), rectangle);
        outputViewController.printCoordinatesBoard();
        outputViewController.printFigureInfo();
    }

}
