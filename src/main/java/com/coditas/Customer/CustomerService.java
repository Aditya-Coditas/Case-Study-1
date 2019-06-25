package com.coditas.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
@Service
public class CustomerService {
    @Autowired
    CustomerRepo cust_repo;
    @Autowired
    Validation val;

    void addCustomer(UserBean userBean)
    {
        try {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date d1 = sdf.parse(userBean.getDate());

        System.out.println(val.validateEmail(userBean.getEmail()));
        System.out.println(val.validatePassword(userBean.getPassword()));
        System.out.println(val.validateDate(d1));


        if (val.validateEmail(userBean.getEmail()) && val.validatePassword(userBean.getPassword()) && val.validateDate(d1)) {
                Customer cust = new Customer();
                cust.setDob(d1);
                cust.setEmail(userBean.getEmail());
                cust.setPassword(userBean.getPassword());
                cust_repo.save(cust);
            } else
                throw new CustomerException();
        } catch (CustomerException e) {

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
