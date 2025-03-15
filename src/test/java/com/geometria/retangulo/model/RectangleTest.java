package com.geometria.retangulo.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    private Rectangle rectangle;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(2.0, 5.0);
    }

    @Test
    void testCalculateArea() {
        assertEquals(10.0, rectangle.calculateArea());
    }

    @Test
    void testCalculatePerimeter() {
        assertEquals(14.0, rectangle.calculatePerimeter());
    }
}
