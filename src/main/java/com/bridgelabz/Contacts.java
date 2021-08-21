package com.bridgelabz;
import java.util.regex.Pattern;
/**
 * @author mandeep
 * Creating a Contacts class using getter and setter
 * it's pojo class
 */
public class Contacts {
    //variables
    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public String zip;
    public String phone;
    public String email;

    @Override
    public String toString() {
        return "Contacts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName
     * @throws CustomException
     */
    public void setFirstName(String firstName) throws CustomException {
        boolean check = Pattern.matches("[A-Z]+[a-z]{2,}", firstName);
        if (check) {
            System.out.println("**********Valid First Name**********");
            this.firstName = firstName;
        }
        else
            System.out.println("********Invalid First Name**********");
            throw new CustomException(CustomException.Exception.FIRST_NAME_INCORRECT);
    }

    public String getLastName() {
        return lastName;
    }
    /**
     * @param lastName
     * @throws CustomException
     */
    public void setLastName(String lastName) throws CustomException {
        boolean check = Pattern.matches("[A-Z]+[a-z]{2,}", lastName);
        if(check)
            this.lastName = lastName;
        else
            System.out.println("*********Invalid LastName**********");
            throw new CustomException(CustomException.Exception.LAST_NAME_INCORRECT);
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    /**
     * @param city
     * @throws CustomException
     */
    public void setCity(String city) throws CustomException {
        boolean check = Pattern.matches("[A-Z]+[a-z]{2,}", city);
        if(check)
            this.city = city;
        else
            System.out.println("*******Invalid City******");
            throw new CustomException(CustomException.Exception.CITY_INCORRECT);
    }
    public String getState() {
        return state;
    }


    /**
     * @param state
     * @throws CustomException
     */
    public void setState(String state) throws CustomException {
        boolean check = Pattern.matches("[A-Z]+[a-z]{2,}", state);
        if(check)
            this.state = state;
        else
            System.out.println("*********Invalid State********");
            throw new CustomException(CustomException.Exception.STATE_INCORRECT);
    }
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public String getPhone() {
        return phone;
    }
    /**
     * @param phone
     * @throws CustomException
     */
    public void setPhone(String phone) throws CustomException {
        boolean check = Pattern.matches("^[1-9][0-9][1-9]{10}$", phone);
        if(check)
            this.phone = phone;
        else
            System.out.println("*********Invalid Phone Number*******");
            throw new CustomException(CustomException.Exception.PHONE_INCORRECT);
    }
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     * @throws CustomException
     */
    public void setEmail(String email) throws CustomException {
        boolean check = Pattern.matches("^[a-z0-9.+-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,6}$", email);
        if(check)
            this.email = email;
        else
            System.out.println("*******Invalid Email...*********");
            throw new CustomException(CustomException.Exception.EMAIL_INCORRECT);
    }
}
