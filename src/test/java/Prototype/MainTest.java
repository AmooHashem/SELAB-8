package Prototype;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    @DisplayName("check prototype")
    void checkPrototype() {
        Circle shape = new Circle();
        shape.x = 10;
        shape.y = 20;
        shape.color = "yellow";
        shape.name = "circle";
        Shape copyShape = shape.clone();
        assertAll(() -> assertNotSame(shape, copyShape), () -> assertEquals(shape, copyShape));
    }
}


