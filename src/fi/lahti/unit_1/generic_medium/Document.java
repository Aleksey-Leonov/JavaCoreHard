package fi.lahti.unit_1.generic_medium;

public interface Document<T> {
    T getHeader();
    T getContent();

}
