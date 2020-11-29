package homework.DBserver;


import homework.DBserver.DbUserService;

public class Main {
    public static void main(String[] args) {

      DbUserService db = new DbUserService();
      System.out.println(db.findUserByEmailPassword("n1@mail.com", "1"));


    }
}
