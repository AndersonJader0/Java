package ProjectLogin;

import java.util.Objects;

public class User {
    private String name;
    private int senha;
    int userNumber;

    public User(){
    }

    public User(String name, int senha) {
        this.name = name;
        this.senha = senha;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSenha(String name) {
        this.senha = senha;
    }
    public int getSenha() {
        return senha;
    }
    public String toString() {
        return  "\nName: " + this.getName() +
                "\nSenha: " + this.getSenha();
    }

    public boolean equals(User user) {
        User other = (User) user;
        // verifica se o nome e senha são iguais
        return this.name.equals(other.name) && Objects.equals(this.senha, other.senha);
    }
}