//package part3.entities;
//
//import part3.enums.Gender;
//import part3.enums.HumanCondition;
//import part3.interfaces.HumanInterface;
//
//public class HumanEntity implements HumanInterface {
//
//    private String name;
//
//    private Gender gender;
//
//    private HumanCondition innerCondition;
//
//    private HumanCondition outterCondition;
//
//    private Flashlight flashlight = new Flashlight(false);
//
//    public HumanEntity(String name, Gender gender) {
//        this.gender = gender;
//        this.name = name;
//    }
//
//    @Override
//    public boolean illuminate() {
//        if (!flashlight.getCondition()) {
//            flashlight.switchOn();
//        }
//
//        if (flashlight.getCondition()) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    @Override
//    public void changeInnerCondition(HumanCondition newCondition) {
//        this.innerCondition = newCondition;
//    }
//
//    @Override
//    public void changeOutterCondition(HumanCondition newCondition) {
//        this.outterCondition = newCondition;
//    }
//
//    @Override
//    public HumanCondition getInnerCondition() {
//        return innerCondition;
//    }
//
//    @Override
//    public HumanCondition getOutterCondition() {
//        return outterCondition;
//    }
//
//    @Override
//    public Gender getGender() {
//        return gender;
//    }
//
//    @Override
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public void setGender(Gender gender) {
//        this.gender = gender;
//    }
//
//    @Override
//    public void setName(String name) {
//        this.name = name;
//    }
//
//}
package part3.entities;

import part3.abstractClasses.Human;
import part3.abstractClasses.Location;
import part3.enums.Gender;
import part3.enums.HumanCondition;

public class HumanEntity extends Human {
    private Flashlight flashlight = new Flashlight(false);

    public HumanEntity(String name, Gender gender) {
        super(name, gender);
    }

    @Override
    public boolean illuminate() {
        Flashlight flashlight = getFlashlight();
        if (!flashlight.getCondition()) {
            flashlight.switchOn();
        }
        return flashlight.getCondition();
    }

    public void updateConditionBasedOnLocationAndFlashlight() {
        Location currentLocation = getCurrentLocation();
        if (currentLocation instanceof Tunnel) {
            if (getFlashlight().getCondition()) {
                changeInnerCondition(HumanCondition.NERVOUS);
            } else {
                changeInnerCondition(HumanCondition.FEAR);
            }
        } else {
            changeInnerCondition(HumanCondition.BRAVE);
        }
    }
}

