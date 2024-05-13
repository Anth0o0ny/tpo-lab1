package part3.entities;

public class Wall {

    private String material;

    private String condition;

    Wall(String material, String condition) {
        this.material = material;
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

}
