package br.senac.edevs.model.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UsuarioAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String login;
    private String password;
    public UsuarioAdmin() {}
    public UsuarioAdmin(String login, String password) {
        super();
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
            return "User{" +
                   "login='" + login + '\'' +
                   ", password='" + password + '\'' +
                   '}';
        
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
