package part3.enums;

public enum Gender {

    MALE ("male"),
    FEMALE ("female");

    private String title;

    Gender(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
