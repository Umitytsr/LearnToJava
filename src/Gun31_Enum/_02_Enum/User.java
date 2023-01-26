package Gun31_Enum._02_Enum;

public class User {
    String userName;
    Rol role;
    Statu  statu;


    public User(String userName, Rol role, Statu statu) {
        this.userName = userName;
        this.role = role;
        this.statu = statu;
    }

    void userSil(User user){
        if (user.role == Rol.ADMIN){
            System.out.println("Admin silinemez");
        }
    }
}
