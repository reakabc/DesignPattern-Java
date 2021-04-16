package BuilderDesignPattern;

public class House implements HousePlan{

    public String name;
    public String basement;
    public String structure;
    public String roof;
    public String interior;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setBasement(String basement) {
        this.basement = basement;
    }

    @Override
    public void setStructure(String structure) {
        this.structure = structure;
    }

    @Override
    public void setRoof(String roof) {
        this.roof = roof;
    }

    @Override
    public void setInterior(String interior) {
        this.interior = interior;
    }

    public String getName() {
        return name;
    }
}
