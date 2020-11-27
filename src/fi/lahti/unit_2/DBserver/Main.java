package fi.lahti.unit_2.DBserver;


public class Main {
    public static void main(String[] args) {

      DbUserService db = new DbUserService();
      db.findUserByEmailPassword("n1@mail.com", "1");


    }
}
