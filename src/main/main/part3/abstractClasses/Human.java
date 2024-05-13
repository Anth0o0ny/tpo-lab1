package part3.abstractClasses;

import part3.enums.Gender;
import part3.enums.HumanCondition;

public abstract class Human {

    private String name;
    private Gender gender;
    private HumanCondition innerCondition;
    private HumanCondition outerCondition;

    public Human(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
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

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }
}
