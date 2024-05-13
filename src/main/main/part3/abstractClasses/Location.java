package part3.abstractClasses;

import java.util.List;

public abstract class Location {

    protected Location subLocation;
    protected List<Human> visitors;

    public void comeIn(Human human) {
        this.visitors.add(human);
    }

    public void leave(Human human) {
        this.visitors.remove(human);
    }

    public void setVisitors(List<Human> visitors) {
        this.visitors = visitors;
    }

    public List<Human> getVisitors() {
        return visitors;
    }

    public void setSubLocation(Location subLocation) {
        this.subLocation = subLocation;
    }

    public Location getSubLocation() {
        return subLocation;
    }
}
