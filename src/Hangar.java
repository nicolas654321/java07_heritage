public class Hangar {

    public static void main(String[] args) {

        Car myCar = new Car("grosse voiture", 100);
        System.out.println(myCar.doStuff());

        Car myCar2 = new Car("teufteuf", 10000);
        System.out.println(myCar2.doStuff());

        Boat myBoat = new Boat("barque", 2);
        System.out.println(myBoat.doStuff());

        Boat myBoat2 = new Boat("gros bateau", 2);
        System.out.println(myBoat2.doStuff());

    }
}
