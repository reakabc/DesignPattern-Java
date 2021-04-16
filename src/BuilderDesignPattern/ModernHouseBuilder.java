package BuilderDesignPattern;

public class ModernHouseBuilder implements HouseBuilder{

    House house;

    public ModernHouseBuilder(){
        this.house = new House();
    }

    @Override
    public void provideName() {
        house.setName("Modern house");
    }

    @Override
    public void buildBasement() {
        house.setBasement("Modern Basement");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Modern Structure");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Modern Roof");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Modern Interior");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
