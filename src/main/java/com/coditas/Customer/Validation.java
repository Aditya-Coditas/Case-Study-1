package com.coditas.Customer;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Validation {

    public boolean validateDate(Date d)
    {
        int flag=0;
       try {
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
           Date d1 = sdf.parse("1985/01/01");
           Date d2 = sdf.parse("1995/12/31");
           boolean temp1=d.after(d1);
           boolean temp2=d.before(d2);
           System.out.println("========================");
           if (temp1 && temp2) {
               System.out.println("In If");
               flag=1;

           }
       } catch (ParseException e) {
           e.printStackTrace();
       }
       System.out.println(flag);
       if(flag==1)
           return  true;
       else
           return false;

    }

    public boolean validateEmail(String s)
    {
            if((s.length()>6)&&(s.length()<21)&&(s.contains("@")))
            {
                return true;
            }
            else
                return false;
    }


    public boolean validatePassword(String s)
    {
         if((s.length()>4)&&(s.length()<10))
         {
             if((s.contains("--*"))||(s.contains("$"))||(s.contains("#")))
                 return true;
             else
                 return false;
         }
         else
             return false;

    }
}
