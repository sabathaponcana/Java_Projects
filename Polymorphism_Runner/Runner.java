/**
 ** DO NOT EDIT THIS CLASS **
 Use this class to check that your Animal, Cat, and Centipede classes work correctly.
**/
public class Runner {
    public static void main(String[] args) {

        // Make a new Animal using the base (super) class
        Animal animal = new Animal(4);
        System.out.println("Class: " + animal.getClass());
        System.out.println("Name: " + animal.getName());
        System.out.println("Number of legs: " + animal.getNumLegs());
        System.out.println("Noise: " + animal.getNoise());
        System.out.println();


        // Make a new Centipede using upcasting

        Animal centipede = new Centipede(100);
        System.out.println("Class: " + centipede.getClass());
        System.out.println("Name: " + centipede.getName());
        System.out.println("Number of legs: " + centipede.getNumLegs());
        centipede.setNoise("....");
        System.out.println("Noise: " + centipede.getNoise());
        System.out.println();


        // Make a new Centipede using the Centipede sub-class

        Centipede anotherCentipede = new Centipede(100);
        System.out.println("Class: " + anotherCentipede.getClass());
        System.out.println("Name: " + anotherCentipede.getName());
        System.out.println("Number of legs: " + anotherCentipede.getNumLegs());
        System.out.println("Noise: " + anotherCentipede.getNoise());
        System.out.println();


        // Make a new Cat using upcasting

         Animal catOne = new Cat(4);
         System.out.println("Class: " + catOne.getClass());
         System.out.println("Name: " + catOne.getName());
         System.out.println("Number of legs: " + catOne.getNumLegs());
         System.out.println("Noise: " + catOne.getNoise());
         System.out.println(catOne.toString());
         System.out.println();

         // Make a new Cat using the Cat sub-class

         Cat catTwo = new Cat(4);
         System.out.println("Class: " + catTwo.getClass());
         System.out.println("Name: " + catTwo.getName());
         System.out.println("Number of legs: " + catTwo.getNumLegs());
         System.out.println("Noise: " + catTwo.getNoise());
         System.out.println(catTwo.toString());
         System.out.println();
    }


}