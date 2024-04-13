package utils;

import utils.myexception.InvalidInput;
public class Validate {
    public static boolean validateDate (String date) throws InvalidInput {
        String regex = "^\\d{2}/\\d{2}/\\d{4}$";
        if (date.matches(regex)) {
            return true;
        }
        else {
            throw new InvalidInput("Invalid date format (dd-mm-YYYY) : "+ date);
        }
    }
    public static boolean validateVip (String vip) throws InvalidInput {
        String regex = "^VIP[123]$";
        if (vip.matches(regex)) {
            return true;
        }
        else {
            throw new InvalidInput("Invalid VIP (VIP1/VIP2/VIP3) : "+ vip);
        }
    }
    public static boolean validateEmail (String email) throws InvalidInput {
        String regex = "^\\w+@[a-zA-Z]+\\.[a-zA-Z]+$";
        if (!email.matches(regex)) {
            throw new InvalidInput("Invalid email format : "+ email);
        }
        return true;
    }
    public static boolean validatePhone (String phone) throws InvalidInput {
        String regex = "^0\\d{9}$";
        if (!phone.matches(regex)) {
            throw new InvalidInput("Invalid phone format (10 digits and start with 0) : "+ phone);
        }
        return true;
    }
    public static boolean validateId(String id) throws InvalidInput {
        String regex = "^NV-\\d{4}$";
        if (!id.matches(regex)) {
            throw new InvalidInput ("Invalid Id : " +  id);
        }
        return true;
    }
    public static boolean validateRecId(String name) throws InvalidInput {
        String regex = "^BA-\\d{4}$";
        if (!name.matches(regex)) {
            throw new InvalidInput ("Invalid Rec id : "+  name);
        }
        return true;
    }
    public static boolean validateSalary (double salary) throws InvalidInput {
        if (!(salary>0)) {
            throw new InvalidInput ("Invalid Salary (>0) : "+  salary);
        }
        return true;
    }
    public static boolean validateEmptyInput (String str) throws InvalidInput {
        if (str.equals("")) {
            throw new InvalidInput ("Empty input "+  str);
        }
        return true;
    }
    public static boolean validatePositiveNumber (double number) throws InvalidInput {
        if (!(number>0.0)) {
            throw new InvalidInput ("Invalid number (>0) : "+  number);
        }
        return true;
    }
    public static boolean validatePositiveNumber (int number) throws InvalidInput {
        if (!(number>0)) {
            throw new InvalidInput ("Invalid number (>0) : "+  number);
        }
        return true;
    }

}
