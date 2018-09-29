package company;

/* clasa do przecowywania danych użytkowników
id - int
login - Sring
password - String

 */
public class User {
    private Long id;
    private String login;
    private String password;

    /*public User(){
        id = 1;
        login = "User login";
        password = "User password";

    } nie ma potrzeby tworzyć defultowego Usera
    */
    public User (Long id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }
    /* if data privet, -> define/deklare method get* -> get date from privet positions.

     */
    public Long getId () {
        return id;
    }

    public String getLogin () {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
