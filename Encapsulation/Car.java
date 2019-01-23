public class Car {
    private boolean previouslyOwned;
    private int numWheels;
    private int mileage;
    private String type;
    public String colour;

    public boolean getPreviouslyOwned() {
        return previouslyOwned;
    }

    public void setPreviouslyOwned(boolean previouslyOwned) {
        this.previouslyOwned = previouslyOwned;
        if(previouslyOwned == true)
        {
            this.previouslyOwned = true;
            this.mileage = 20000;
        }
        else
        {
            this.previouslyOwned = false;
            this.mileage = 0;
        }
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
        if(type.equals("Reliant Robin"))
        {
            this.numWheels = 3;
        }
        else
        {
            this.numWheels = 4;
        }
        this.numWheels = numWheels;
        this.mileage = mileage;
        this.type = type;
    }
}
