package BuilderDesignPattern;

public class Main {

    public static void main(String[] args) {

        HouseBuilder builder = new TechHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(builder);
        engineer.constructHouse();

        House house = engineer.getHouse();
        System.out.println(house.getName());

    }

}
