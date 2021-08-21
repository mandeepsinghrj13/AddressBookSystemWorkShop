package com.bridgelabz;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class AddressBookMainTest {
    AddressBookMain addressbook = null;

    @Before
    public void setUp() {
        addressbook = new AddressBookMain();
    }

    @Test
    public void given_AddingContactInList_IfSuccssful_ShouldReturnCorrectSizeOfList() throws CustomException {
        int result = addressbook.createContact("Mandeep", "Singh", "DhilloSir", "Sriganganagar",
                "Rajasthan", "335001","919 166677855","mandeep@gmail.com");
        Assert.assertEquals(1, result);
    }

    @Test
    public void given_CreatingContactInListAddressbook_WhenFirstNameIncorrect_ShouldThrowCustomException() {
        try {
            int result = addressbook.createContact("mandeep", "singh", "abcd", "ganganagar",
                    "sri", "12345","777582","abc@gmail.com");
            Assert.assertEquals(0, result);

        }
        catch(CustomException e){
            Assert.assertEquals(CustomException.Exception.FIRST_NAME_INCORRECT,e.type);
        }
    }
}
