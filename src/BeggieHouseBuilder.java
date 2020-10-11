//Another Houser builder called beggie

public class BeggieHouseBuilder implements  HouseBuilder{
    private House house;

    public BeggieHouseBuilder()
    {
        this.house = new House();
    }

    public void buildBasement()
    {
        house.setBasement("Wooden Poles");
    }

    public void buildStructure()
    {
        house.setStructure("Wood and Ice");
    }

    public void bulidRoof()
    {
        house.setRoof("Wood, caribou and seal skins");
    }
    public void buildInterior()
    {
        house.setInterior("Fire Wood");
    }

    public House getHouse()
    {
        return this.house;
    }

}
