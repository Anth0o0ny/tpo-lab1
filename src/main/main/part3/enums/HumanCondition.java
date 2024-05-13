package part3.enums;

public enum HumanCondition {
    NERVOUS ("Нервничает"),
    FEAR ("Боится"),
    BRAVE (" Храбрится");

    private String title;

    HumanCondition(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
