package com.coditas.Customer;

public class UserBean {
    String email;
    String password;
    String date;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
