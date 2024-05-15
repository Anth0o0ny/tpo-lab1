package part3.abstractClasses;

import java.util.List;

public abstract class Location {

    protected Location subLocation;
    protected List<Human> visitors;

    public void setVisitors(List<Human> visitors) {
        this.visitors = visitors;
    }

}
