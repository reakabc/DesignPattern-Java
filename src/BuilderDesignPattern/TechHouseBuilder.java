package BuilderDesignPattern;

public class TechHouseBuilder implements HouseBuilder{

    House house;

    public TechHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void provideName() {
        house.setName("Tech House");
    }

    @Override
    public void buildBasement() {
        house.setBasement("Tech Basement");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Tech Structure");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Tech Roof");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Tech Interior");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
