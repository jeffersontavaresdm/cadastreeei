package br.com.cadastreeei.domain.entity;

public class UserEntityBuilder {
    private String name;
    private String email;
    private String password;

    public UserEntityBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public UserEntityBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public UserEntityBuilder withPassword(String password) {
        this.password = password;
        return this;
    }

    public UserEntity build() {
        return new UserEntity(name, email, password);
    }
}
