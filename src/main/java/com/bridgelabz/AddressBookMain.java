package com.bridgelabz;
import java.util.ArrayList;
/**
 * @author mandeep
 * creating addressbookmain class
 */
public class AddressBookMain {
    ArrayList<Contacts> addressbook = new ArrayList<>();
    //main method()
    public static void main(String[] args) {
        System.out.println("Welcome To AddressBook."); //welcome message
    }
    public int createContact(String firstName, String lastName, String address,
                             String city, String state, String zip, String phone,
                             String email) throws CustomException {

        Contacts contact = new Contacts();
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setZip(zip);
        contact.setPhone(phone);
        contact.setEmail(email);
        addressbook.add(contact);
        return addressbook.size();
    }
}
