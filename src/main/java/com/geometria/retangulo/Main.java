package com.geometria.retangulo;

import com.geometria.retangulo.controller.RectangleController;
import com.geometria.retangulo.view.RectangleView;

public class Main {
    public static void main(String[] args) {
        RectangleView view = new RectangleView();
        RectangleController controller = new RectangleController(view);
        controller.run();
    }
}
