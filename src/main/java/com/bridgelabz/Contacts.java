package com.bridgelabz;

/**
 * @author mandeep
 * Creating a Contacts class using getter and setter
 * it's pojo class
 */
public class Contacts {
    //variables
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String emailId;

    //creating getter and setter method() for firstname

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    //creating getter and setter method() for lastname
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //creating getter and setter method() for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //creating getter and setter method() for city
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    //creating getter and setter method() for state
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    //creating getter and setter method() for zipcode
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    //creating getter and setter method() for phoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    //creating getter and setter method() for EmailId
    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    //using toString() to print the data
    @Override
    public String toString() {
        return "Contacts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
