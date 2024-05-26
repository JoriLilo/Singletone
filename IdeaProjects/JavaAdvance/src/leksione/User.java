package leksione;

public class User{
    private Long id;
    private String firstName;
    private String lastNme;
    private String userName;
    private String password;

    public User(Long id,
                String firstName,
                String lastNme,
                String userName,
                String password)  {
        this.id = id;
        this.firstName=firstName;
        this.lastNme=lastNme;
        this.userName=userName;
        this.password=password;
        //kur metoda ekzekuton nje return gjithcka psht saj nuk ekzekutohet
    }

    public void printsth(){
        String toprint="user me ID"+ id+ "me emer"+
                this.firstName+" ";
        System.out.println(toprint);
    }
    public Boolean loginEx(){
        return true;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastNme() {
        return lastNme;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }


}
