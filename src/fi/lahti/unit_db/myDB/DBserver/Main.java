package fi.lahti.unit_db.myDB.DBserver;


public class Main {
    public static void main(String[] args) {

      DbUserService db = new DbUserService();
      db.findUserByEmailPassword("n1@mail.com", "1");


    }
}
