package com.geometria.retangulo.controller;

import com.geometria.retangulo.model.Rectangle;
import com.geometria.retangulo.view.RectangleView;

public class RectangleController {
    private final RectangleView view;

    public RectangleController(RectangleView view) {
        this.view = view;
    }

    public void run() {
        int choice;

        do {
            choice = view.showMenu();

            if (choice != 0) {
                double sideA;
                double sideB;
                Rectangle rectangle;

                switch (choice) {
                    case 1:
                        sideA = view.getSideAInput();
                        sideB = view.getSideBInput();
                        rectangle = new Rectangle(sideA, sideB);
                        view.showResult("Área", rectangle.calculateArea());
                        break;
                    case 2:
                        sideA = view.getSideAInput();
                        sideB = view.getSideBInput();
                        rectangle = new Rectangle(sideA, sideB);
                        view.showResult("Perímetro", rectangle.calculatePerimeter());
                        break;
                    default:
                        view.showError("Opção inválida. Tente novamente!");
                }
            }
        } while (choice != 0);
    }
}
