package BuilderDesignPattern;

public interface HouseBuilder {

    public void provideName();
    public void buildBasement();
    public void buildStructure();
    public void buildRoof();
    public void buildInterior();
    public House getHouse();

}
