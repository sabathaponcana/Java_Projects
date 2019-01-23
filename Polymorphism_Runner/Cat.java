public class Cat extends Animal {

    public Cat(int numLegs)
    {
        super(numLegs);
        super.setName("Cat");
        super.setNoise("Meow");
    }
    @Override
    public String toString(){
        return "An adorable kitten.";

    }
}
