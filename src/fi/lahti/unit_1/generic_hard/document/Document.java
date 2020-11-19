package fi.lahti.unit_1.generic_hard.document;

public interface Document<T> {
     T getContent();
     void setContent(T content);
     void append(T element);
}
