// House builders called Trassco

public class TrasccoHouseBuilder implements  HouseBuilder{

    private House house;

    public TrasccoHouseBuilder()
    {
        this.house = new House();
    }

    public void buildBasement()
    {
        house.setBasement("Ice Bars");
    }

    public void buildStructure()
    {
        house.setStructure("Ice Blocks");
    }

    public void bulidRoof()
    {
        house.setRoof("Ice Dome");
    }
    public void buildInterior()
    {
        house.setInterior("Ice Carvings");
    }

    public House getHouse()
    {
        return this.house;
    }
}
