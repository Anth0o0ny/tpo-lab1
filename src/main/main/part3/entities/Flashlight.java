package part3.entities;

public class Flashlight {

    private boolean condition = false;

    public Flashlight(boolean condition) {
        this.condition = condition;
    }
    
    public void switchOn() {
        this.condition = true;
    }

    public void switchOff() {
        this.condition = false;
    }

    public boolean getCondition() {
        return this.condition;
    }

}
