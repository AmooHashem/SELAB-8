package AbstracFactory;

public class IranianGardenCreator implements GardenCreator {
    @Override
    public AbstractTree createTree() {
        return new Chenar();
    }

    @Override
    public AbstractFlower createFlower() {
        return new Khatmi();
    }
}
