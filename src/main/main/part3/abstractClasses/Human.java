package part3.abstractClasses;

import part3.entities.Flashlight;
import part3.enums.Gender;
import part3.enums.HumanCondition;

public abstract class Human {

    private String name;
    private Gender gender;
    private HumanCondition innerCondition;
    private HumanCondition outerCondition;
    private Flashlight flashlight;
    private Location currentLocation;

    public Human(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.flashlight = new Flashlight(false);
    }

    public abstract boolean illuminate();

    public void changeInnerCondition(HumanCondition newCondition) {
        this.innerCondition = newCondition;
    }

    public void changeOuterCondition(HumanCondition newCondition) {
        this.outerCondition = newCondition;
    }

    public HumanCondition getInnerCondition() {
        return innerCondition;
    }

    public HumanCondition getOuterCondition() {
        return outerCondition;
    }

    public Flashlight getFlashlight() {
        return flashlight;
    }

    public void setCurrentLocation(Location location) {
        this.currentLocation = location;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }
}
