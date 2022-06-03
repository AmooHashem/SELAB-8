package AbstracFactory;

public class JapaneseGardenCreator implements GardenCreator {
    @Override
    public AbstractTree createTree() {
        return new J1();
    }

    @Override
    public AbstractFlower createFlower() {
        return new G1();
    }
}
