package com.coditas.Customer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="customer")
public class Customer {
    int cust_Id;
    @Id
    String email;
    String password;
    Date dob;

    public int getCust_Id() {
        return cust_Id;
    }

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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "cust_Id=" + cust_Id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", dob=" + dob +
                '}';
    }


}
