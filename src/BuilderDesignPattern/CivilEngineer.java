package BuilderDesignPattern;

public class CivilEngineer {

    HouseBuilder houseBuilder;

    public CivilEngineer(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public void constructHouse(){

        this.houseBuilder.buildBasement();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
        this.houseBuilder.buildInterior();
        this.houseBuilder.provideName();

    }

    public House getHouse(){
        return this.houseBuilder.getHouse();
    }

}
