package fi.lahti.unit_1.generic_hard.document;

public abstract class DOM {
    private String content;

    public DOM(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
