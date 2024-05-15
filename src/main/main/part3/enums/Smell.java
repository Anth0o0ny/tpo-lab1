package part3.enums;

public enum Smell {
    SMOLDER("тление"),
    SOOT("гарь");

    private String title;

    Smell(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

}
