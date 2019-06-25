package com.coditas.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class CustomerController {
    @Autowired
    CustomerService custserv;

    @PostMapping("/saveData")
    void saveData(@RequestBody UserBean userBean)
    {

        System.out.println("userBean  : "+userBean);
        custserv.addCustomer(userBean);

    }

 /*   @RequestMapping("/insertData")
    void insertData()
    {
        custserv
    }
*/

}
