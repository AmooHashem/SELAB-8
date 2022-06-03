package AbstracFactory;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MainTest {
    @Test
    @DisplayName("check abstract factory")
    void checkAbstractFactory() {
        GardenCreator iranianGardenCreator = new IranianGardenCreator();
        GardenCreator japaneseGardenCreator = new JapaneseGardenCreator();
        assertAll(() -> assertEquals("J1", japaneseGardenCreator.createTree().getName()), () -> assertEquals("G1", japaneseGardenCreator.createFlower().getName()), () -> assertEquals("CHENAR", iranianGardenCreator.createTree().getName()), () -> assertEquals("KHATMI", iranianGardenCreator.createFlower().getName()));
    }
}