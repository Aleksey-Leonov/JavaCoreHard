package fi.lahti.unit_3.io;

import java.io.Serializable;

public class User implements Serializable {
    int id;
    String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
