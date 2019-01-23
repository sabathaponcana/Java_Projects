/**
 ** DO NOT EDIT THIS CLASS **
 Use this class to check that your Car class works correctly.
 This class should print out 'true' for all of its tests.
 **/
public class Runner{
    public static void main(String[]args){

        // Create a white, pre-owned Ford Fiesta.
        Car firstCar = new Car(true);
        firstCar.setType("Ford Fiesta");
        firstCar.colour = "white";

        // Check that the fiesta has the right attributes
        System.out.println("Checking first car:");
        System.out.println(firstCar.colour.equals("white"));
        System.out.println(firstCar.getNumWheels() == 4);
        System.out.println(firstCar.getPreviouslyOwned() == true);
        System.out.println(firstCar.getType().equals("Ford Fiesta"));
        System.out.println(firstCar.getMileage() == 20000);

        // Create a brand new, red, Ferrari Enzo
        Car secondCar = new Car(false);
        secondCar.setType("Ferrari Enzo");
        secondCar.colour = "red";
        // We have to drive it from the dealership to our house, which is 20km away
        secondCar.setMileage(20);

        // Check that the Ferrari has the correct attributes
        System.out.println("Checking second car:");
        System.out.println(secondCar.colour.equals("red"));
        System.out.println(secondCar.getNumWheels() == 4);
        System.out.println(secondCar.getPreviouslyOwned() == false);
        System.out.println(secondCar.getType().equals("Ferrari Enzo"));
        System.out.println(secondCar.getMileage() == 20);

        // Create a blue, pre-owned Robin Reliant
        Car thirdCar = new Car(true);
        thirdCar.setType("Reliant Robin");
        thirdCar.colour = "blue";

        // Check that the reliant has the correct attributes.
        System.out.println("Checking third car:");
        System.out.println(thirdCar.colour.equals("blue"));
        System.out.println(thirdCar.getNumWheels() == 3);
        System.out.println(thirdCar.getPreviouslyOwned() == true);
        System.out.println(thirdCar.getType().equals("Reliant Robin"));
        System.out.println(thirdCar.getMileage() == 20000);
    }
}
