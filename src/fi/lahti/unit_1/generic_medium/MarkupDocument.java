package fi.lahti.unit_1.generic_medium;

public abstract class MarkupDocument<T> implements Document<T>{

    protected String encoding;

    public MarkupDocument(String encoding) {
        this.encoding = encoding;
    }

}
