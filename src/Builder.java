public class Builder {

        public static void main(String[] args)
        {
            HouseBuilder trasscoBuilder = new TrasccoHouseBuilder();
            CivilEngineer engineer1 = new CivilEngineer(trasscoBuilder);

            HouseBuilder beggiebuilder = new BeggieHouseBuilder();
            CivilEngineer engineer2 = new CivilEngineer(beggiebuilder);


            engineer1.constructHouse();
            engineer2.constructHouse();


            House house1 = engineer1.getHouse();
            House house2 = engineer2.getHouse();

            System.out.println("Builder1 constructed: " + house1);
            
            System.out.println("Builder2 constructed: " + house2);
        }
    }

