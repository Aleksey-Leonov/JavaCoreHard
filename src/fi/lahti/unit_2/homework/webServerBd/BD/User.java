package fi.lahti.unit_2.homework.webServerBd.BD;

public class User {

    private String nickname;
    private String email;
    private String password;

    public User(String nickname, String email, String password) {
        this.nickname = nickname;
        this.email = email;
        this.password = password;
    }


    public String getNickname() {
        return nickname;
    }


    @Override
    public String toString() {
        return "User{" +
                "nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
